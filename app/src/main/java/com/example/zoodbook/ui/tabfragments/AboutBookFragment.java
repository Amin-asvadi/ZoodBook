package com.example.zoodbook.ui.tabfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zoodbook.R;
import com.example.zoodbook.ui.ProductItemActivity.ProductItemActivity;
import com.example.zoodbook.ui.adapters.FromThisAuthorAdapter;
import com.example.zoodbook.ui.adapters.ProductInformationAdapter;
import com.example.zoodbook.ui.mdoels.FromThisAuthorModel;
import com.example.zoodbook.ui.mdoels.ProductInformationModel;
import com.ms.square.android.expandabletextview.ExpandableTextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AboutBookFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutBookFragment extends Fragment {
	ProductInformationAdapter productInformationAdapter;
	List<ProductInformationModel> productInformationitems;

	FromThisAuthorAdapter fromThisAuthorAdapter;
	ArrayList<FromThisAuthorModel> fromThisAuthoritems;
	RecyclerView rc_product_info;
	RecyclerView rc_from_this_arthor;
	@BindView(R.id.expand_text_view)
	ExpandableTextView showmore;
	// TODO: Rename parameter arguments, choose names that match
	// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
	private static final String ARG_PARAM1 = "param1";
	private static final String ARG_PARAM2 = "param2";
	TextView textView;

	// TODO: Rename and change types of parameters
	private String mParam1;
	private String mParam2;

	public AboutBookFragment() {
		// Required empty public constructor
	}

	/**
	 * Use this factory method to create a new instance of
	 * this fragment using the provided parameters.
	 *
	 * @param param1 Parameter 1.
	 * @param param2 Parameter 2.
	 * @return A new instance of fragment AboutBookFragment.
	 */
	// TODO: Rename and change types and number of parameters
	public static AboutBookFragment newInstance(String param1, String param2) {
		AboutBookFragment fragment = new AboutBookFragment();
		Bundle args = new Bundle();
		args.putString(ARG_PARAM1, param1);
		args.putString(ARG_PARAM2, param2);
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {
			mParam1 = getArguments().getString(ARG_PARAM1);
			mParam2 = getArguments().getString(ARG_PARAM2);
		}


	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View root= inflater.inflate(R.layout.fragment_about_book, container, false);
		rc_product_info =root. findViewById(R.id.rc_item_info);

		ButterKnife.bind(this, root);
		ProductItemActivity pr = new ProductItemActivity();
		showmore.setText(pr.DESCRIPTION);


		productInformationitems = new ArrayList<>();
		productInformationitems.add(new ProductInformationModel("ناشر","نتشارات سوره مهر" ));
		productInformationitems.add(new ProductInformationModel("قیمت نسخه چاپی","78000 تومان" ));
		productInformationitems.add(new ProductInformationModel("دسته بندی ","رمان - هنر" ));
		productInformationitems.add(new ProductInformationModel("ناشر","نتشارات سوره مهر" ));
		productInformationitems.add(new ProductInformationModel("قیمت نسخه چاپی","78000 تومان" ));
		productInformationitems.add(new ProductInformationModel("دسته بندی ","رمان - هنر" ));
		productInformationAdapter = new ProductInformationAdapter(productInformationitems, getContext());
		LinearLayoutManager linearLayoutManager = new LinearLayoutManager
				(getContext(), LinearLayoutManager.HORIZONTAL, false);

		rc_product_info.setLayoutManager(linearLayoutManager);
		rc_product_info.setAdapter(productInformationAdapter);



		//rc_from_this_arthor = root.findViewById(R.id.rc_From_this_author);
		fromThisAuthoritems = new ArrayList<>();
		fromThisAuthoritems.add(new FromThisAuthorModel
				(R.drawable.my_war, R.drawable.star, 4.5f,
						"کتاب نبرد من","45,000","فرشته اکبر پور","کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
		fromThisAuthoritems.add(new FromThisAuthorModel
				(R.drawable.escape_from_the_camp, R.drawable.star, 3.8f, "فرار از اردوگاه 14","19,000","بلین هاردن","کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
		fromThisAuthoritems.add(new FromThisAuthorModel
				(R.drawable.west, R.drawable.star, 4.8f, "غرب","17,000","صادق زیبا کلام","کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
		fromThisAuthoritems.add(new FromThisAuthorModel
				(R.drawable.my_war, R.drawable.star, 4.5f, "کتاب نبرد من","38,000","فرشته اکبر پور","کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
		fromThisAuthoritems.add(new FromThisAuthorModel
				(R.drawable.escape_from_the_camp, R.drawable.star, 3.8f, "فرار از اردوگاه 14","45,000","فرشته اکبر پور","کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
		fromThisAuthorAdapter = new FromThisAuthorAdapter(fromThisAuthoritems, getContext());
		LinearLayoutManager linearLayoutManagerfrom = new LinearLayoutManager
				(getContext(), LinearLayoutManager.HORIZONTAL, true);

		//rc_from_this_arthor.setLayoutManager(linearLayoutManagerfrom);
		//rc_from_this_arthor.setAdapter(fromThisAuthorAdapter);

		return root;
	}
}