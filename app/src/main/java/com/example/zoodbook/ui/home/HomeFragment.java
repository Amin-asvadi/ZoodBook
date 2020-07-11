package com.example.zoodbook.ui.home;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.zoodbook.BuildConfig;
import com.example.zoodbook.ClsSharedPreference;
import com.example.zoodbook.Components.Global;
import com.example.zoodbook.MainActivity;
import com.example.zoodbook.Network.RetrofitApiInterface;
import com.example.zoodbook.R;
import com.example.zoodbook.ui.adapters.Adapter_MostSale;
import com.example.zoodbook.ui.adapters.FreeBookLibralysAdapter;
import com.example.zoodbook.ui.adapters.HistorialSellerAdapter;
import com.example.zoodbook.ui.adapters.ViewPagerHomeAdapter;
import com.example.zoodbook.ui.home.Models.Obj_FreeItem;
import com.example.zoodbook.ui.home.Models.Obj_MostSale;
import com.example.zoodbook.ui.home.Models.Obj_Slider;
import com.example.zoodbook.ui.home.Models.Ser_Book_Main;
import com.example.zoodbook.ui.mdoels.HistorialSellerModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment implements HomeView {

    @Inject
    RetrofitApiInterface retrofitApiInterface;

    @BindView(R.id.viewPager_slider)
    ViewPager homSlider;
    @BindView(R.id.rv_mostVisit)
    RecyclerView rv_mostVisit;
    @BindView(R.id.rc_free_book)
    RecyclerView rc_book_free;

    @BindView(R.id.show_more_historial)
    TextView more;
    @BindView(R.id.more_free_libralys)
    TextView more_free_libralys;
    @BindView(R.id.textheader)
    TextView textheader;
    @BindView(R.id.linearLayout2)
    LinearLayout linearLayout2;
    @BindView(R.id.iv_banner)
    ImageView iv_banner;
    @BindView(R.id.more_best_seller)
    TextView moreBestSeller;
    @BindView(R.id.title_best_seller)
    TextView titleBestSeller;
    @BindView(R.id.rc_best_sell)
    RecyclerView rcBestSell;
    @BindView(R.id.scrollView2)
    NestedScrollView scrollView2;


    private Context context;
    private HistorialSellerAdapter historialSellerAdapter;
    private List<HistorialSellerModel> historialSelleritems;
    private HomeFragmentPresenter homeFragmentPresenter;
    private ClsSharedPreference sharedPreference;


    //Adapters
    private ViewPagerHomeAdapter viewPagerHomeAdapter;
    private FreeBookLibralysAdapter freeBookLibralysAdapter;
    private Adapter_MostSale adapterMostSale;
    private Adapter_MostSale adapterMostVisit;


    View root;


    //Data List
    private List<Obj_Slider> sliders;
    private List<Obj_FreeItem> freeBookLibralysitems;
    private List<Obj_MostSale> mostSales;
    private List<Obj_MostSale> mostVisit;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, root);

        ((Global) requireActivity().getApplication()).getGitHubComponent().inject_first_page(this);
        homeFragmentPresenter = new HomeFragmentPresenter(retrofitApiInterface, this);
        addSlideAdapter();
        getData();
        sharedPreference=new ClsSharedPreference(getContext());


        CreateAdapter();
        return root;
    }

    private void getData() {
        if (Global.NetworkConnection()) {
            homeFragmentPresenter.getData(Global.DEVICE_OS, BuildConfig.VERSION_CODE);
        }
    }


    private void CreateAdapter() {
        mostSales = new ArrayList<>();
        adapterMostSale = new Adapter_MostSale(getContext());
        rcBestSell.setLayoutManager(new LinearLayoutManager
                (getContext(), LinearLayoutManager.HORIZONTAL, true));
        adapterMostSale.setData(mostSales);
		rcBestSell.setAdapter(adapterMostSale);

        /////////////////////////////////////////////////////////////////////////////////////////

        freeBookLibralysitems = new ArrayList<>();
        freeBookLibralysAdapter = new FreeBookLibralysAdapter(getContext(), (FreeBookLibralysAdapter.ClickListener) getActivity());
        rc_book_free.setLayoutManager(new GridLayoutManager(getContext(),
                3, GridLayoutManager.HORIZONTAL, true));
        freeBookLibralysAdapter.setItems(freeBookLibralysitems);
        rc_book_free.setAdapter(freeBookLibralysAdapter);


        /////////////////////////////////////////////////////////////////////////////////////////


        mostVisit = new ArrayList<>();
        adapterMostVisit = new Adapter_MostSale(getContext());
        rv_mostVisit.setLayoutManager(new LinearLayoutManager
                (getContext(), LinearLayoutManager.HORIZONTAL, true));
        adapterMostVisit.setData(mostVisit);
        rv_mostVisit.setAdapter(adapterMostVisit);

    }


    //-------------FillRcSallers------------//


    //-------------FillSlider---------------//
    private void addSlideAdapter() {
        sliders = new ArrayList<>();
        viewPagerHomeAdapter = new ViewPagerHomeAdapter(getContext());

        viewPagerHomeAdapter.setData(sliders);
        //homSlider = root.findViewById(R.id.viewPager_slider);
        homSlider.setAdapter(viewPagerHomeAdapter);

        homSlider.setPadding(100, 0, 100, 0);
        final Timer timer;


        timer = new Timer();

        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);


    }



	/*@Override
	public void Responce_best_responce(Ser_Best_Seller ser_best_seller) {
		bestSellaryitems = ser_best_seller.getData();
		bestSellaryAdapter.setData(bestSellaryitems);
		rc_best.setAdapter(bestSellaryAdapter);

	}




	@Override
	public void Responce_Historial_book_responce(Ser_Historial_Seller ser_historial_seller) {

		historialSelleritems = ser_historial_seller.getData();
		bestSellaryAdapter.setData(bestSellaryitems);
		book_recyclerView.setAdapter(historialSellerAdapter);
	}

*/

    @Override
    public void showWait() {

    }

    @Override
    public void removeWait() {

    }

    @Override
    public void onFailure(String message) {

    }

    @Override
    public void onServerFailure(Ser_Book_Main serBookMain) {

    }

    @Override
    public void Response(Ser_Book_Main serBookMain) {
        sliders = serBookMain.getData().getSliders();
        viewPagerHomeAdapter.setData(sliders);
        viewPagerHomeAdapter.notifyDataSetChanged();


        freeBookLibralysitems = serBookMain.getData().getFreeItems();
        freeBookLibralysAdapter.setItems(freeBookLibralysitems);
        freeBookLibralysAdapter.notifyDataSetChanged();

        mostSales=serBookMain.getData().getMostSale();
        adapterMostSale.setData(mostSales);
        adapterMostSale.notifyDataSetChanged();

        mostVisit=serBookMain.getData().getMost_visit();
        adapterMostVisit.setData(mostVisit);
        adapterMostVisit.notifyDataSetChanged();

        Glide.with(getContext())
                .load(sharedPreference.get_file_url() + serBookMain.getData().getBanner().getImg())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_placeholder_large)
                .dontAnimate()
                .into(iv_banner);


    }


    public class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            if (homSlider.getCurrentItem() == 0) {
                homSlider.setCurrentItem(1);
            } else if (homSlider.getCurrentItem() == 1) {
                homSlider.setCurrentItem(2);
            } else if (homSlider.getCurrentItem() == 2) {
                homSlider.setCurrentItem(0);
            } else {
                homSlider.setCurrentItem(0);
            }
        }
    }

}

