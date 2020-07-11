package com.example.zoodbook.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.zoodbook.ClsSharedPreference;
import com.example.zoodbook.R;
import com.example.zoodbook.ui.home.Models.Obj_Slider;
import com.example.zoodbook.ui.mdoels.ViewPagerHomeModel;

import java.util.List;

public class ViewPagerHomeAdapter extends PagerAdapter {


    private List<Obj_Slider> data;
    private LayoutInflater layoutInflater;
    private Context context;
    private ClsSharedPreference sharedPreference;

    public ViewPagerHomeAdapter( Context context) {
        this.context = context;
        sharedPreference=new ClsSharedPreference(context);
    }

    public List<Obj_Slider> getData() {
        return data;
    }

    public void setData(List<Obj_Slider> data) {
        this.data = data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_view_pager,container,false);
        ImageView imgslider;
        imgslider = view.findViewById(R.id.img_slider);
        Glide.with(context)
                .load(sharedPreference.get_file_url() + data.get(position).getImg())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_placeholder_large)
                .dontAnimate()
                .into(imgslider);



        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }
}
