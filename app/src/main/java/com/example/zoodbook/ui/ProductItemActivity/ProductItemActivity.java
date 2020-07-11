package com.example.zoodbook.ui.ProductItemActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.example.zoodbook.Components.Global;
import com.example.zoodbook.Network.RetrofitApiInterface;
import com.example.zoodbook.R;
import com.example.zoodbook.ui.adapters.FreeBookLibralysAdapter;
import com.example.zoodbook.ui.adapters.ViewPagerSingelAdapter;
import com.example.zoodbook.ui.home.Models.Ser_Book_Main;
import com.example.zoodbook.ui.mdoels.ProductInformationModel;
import com.example.zoodbook.ui.tabfragments.AboutBookFragment;
import com.example.zoodbook.ui.tabfragments.CommentFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductItemActivity extends AppCompatActivity implements ProductItemView, FreeBookLibralysAdapter.ClickListener {
	@Inject
	RetrofitApiInterface retrofitApiInterface;
	public String DESCRIPTION;
	private ViewPager viewPager;
	private TabLayout tabLayout;

	private AboutBookFragment aboutBookFragment;
	private CommentFragment commentFragment;
	private TextView bookName;
	private TextView bookWriter;
	private TextView bookPrice;
	private ImageView bookImg;
	private ImageView flashback;



	public ProductSingelModel aboutFragmentModel;

	 List<ProductSingelModel> productInformationitem;
	ProductItemActivityPeresenter productItemActivityPeresenter;

	@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		ActionBar actionBar = getSupportActionBar();
		actionBar.hide();
		ButterKnife.bind(ProductItemActivity.this);
		((Global) getApplication()).getGitHubComponent().inject_singel_page(this);
		productItemActivityPeresenter = new ProductItemActivityPeresenter(retrofitApiInterface, this);

		aboutFragmentModel = new ProductSingelModel();
		aboutBookFragment = new AboutBookFragment();
		commentFragment = new CommentFragment();

		tabLayout = findViewById(R.id.tab_layout_singel);
		viewPager = findViewById(R.id.tab_singel_view_pager);
		bookName = findViewById(R.id.book_name_single);
		tabLayout.setupWithViewPager(viewPager);
		bookWriter = findViewById(R.id.book_writer_singel);
		bookPrice = findViewById(R.id.txt_book_price_singel);
		bookImg = findViewById(R.id.img_book_single);
		flashback = findViewById(R.id.flashBack);
		ViewGroup.LayoutParams params = bookImg.getLayoutParams();
		params.height = (int) ((Global.getSizeScreen(ProductItemActivity.this)) / 2.25);
		params.width = (int) ((Global.getSizeScreen(ProductItemActivity.this)) / 3.25);
		bookImg.setLayoutParams(params);
		ViewPagerSingelAdapter viewPagerSingelAdapter =
				new ViewPagerSingelAdapter(getSupportFragmentManager(), 0);


		viewPagerSingelAdapter.addFragments(commentFragment, "نطرات کاربران");
		viewPagerSingelAdapter.addFragments(aboutBookFragment, "درباره کتاب");
		viewPager.setAdapter(viewPagerSingelAdapter);

		tabLayout.getTabAt(0).setIcon(R.drawable.ic_comment);
		tabLayout.getTabAt(1).setIcon(R.drawable.ic_book_black).select();
		tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
			@Override
			public void onTabSelected(TabLayout.Tab tab) {
				if (tab.getPosition() == 0) {
					tab.setIcon(R.drawable.ic_comment_black);

				} else {
					tab.setIcon(R.drawable.ic_book_black);

				}
			}

			@Override
			public void onTabUnselected(TabLayout.Tab tab) {
				if (tab.getPosition() == 0) {
					tab.setIcon(R.drawable.ic_comment);

				} else {
					tab.setIcon(R.drawable.ic_book);

				}
			}

			@Override
			public void onTabReselected(TabLayout.Tab tab) {

			}
		});
		if (Global.NetworkConnection()) {

			productItemActivityPeresenter.ResponseCheck();
		} else {

			Toast.makeText(this, "Cannot connect to the network", Toast.LENGTH_SHORT).show();
		}

	}


	public void GoBack(View view) {
		finish();
	}

	@Override
	public void Responce_PrItem_responce(Ser_Book_Main ser_book_main) {
		productInformationitem = ser_book_main.getData().getPrdSingel();
		if (productInformationitem != null){
			Toast.makeText(this, "Not Null", Toast.LENGTH_SHORT).show();

		bookName.setText(ser_book_main.getData().getPrdSingel().get(0).getTitle());

		Glide.with(this).load(ser_book_main.getData().getPrdSingel().get(0).getImage())
				.into(bookImg);
		bookPrice.setText(ser_book_main.getData().getPrdSingel().get(0).getPrice());

		bookWriter.setText(ser_book_main.getData().getPrdSingel().get(0).getAuthor());

		DESCRIPTION = ser_book_main.getData().getPrdSingel().get(0).getDescription();}
		else {

			Toast.makeText(this, "IS Null", Toast.LENGTH_SHORT).show();
		}

	}

	@Override
	public void onPointerCaptureChanged(boolean hasCapture) {

	}

	@Override
	public void onclick(int position) {


	}
}