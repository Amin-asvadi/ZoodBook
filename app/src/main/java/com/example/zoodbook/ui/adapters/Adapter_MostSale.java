package com.example.zoodbook.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.zoodbook.ClsSharedPreference;
import com.example.zoodbook.R;
import com.example.zoodbook.ui.home.Models.Obj_MostSale;
import com.example.zoodbook.ui.utility.Global;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Adapter_MostSale extends RecyclerView.Adapter<Adapter_MostSale.ViewHolder> {
    private List<Obj_MostSale> data;
    private Context context;
    private ClsSharedPreference sharedPreference;



    public List<Obj_MostSale> getData() {
        return data;
    }

    public void setData(List<Obj_MostSale> items) {
        this.data = items;
    }


    public Adapter_MostSale(Context context) {
        this.context = context;
        sharedPreference=new ClsSharedPreference(context);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_the_best_selling_historical, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


		Glide.with(context)
				.load(sharedPreference.get_file_url() + data.get(position).getImage())
				.diskCacheStrategy(DiskCacheStrategy.ALL)
				.placeholder(R.drawable.ic_placeholder_large)
				.dontAnimate()
				.into(holder.iv_book);

		holder.tv_title.setText(data.get(position).getTitle());

        ViewGroup.LayoutParams params = holder.iv_book.getLayoutParams();
        params.height = (int) ((Global.getSizeScreen(context)) / 2);
        params.width = (int) ((Global.getSizeScreen(context)) / 3);
        holder.iv_book.setLayoutParams(params);
        holder.itemBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, "BOOOOOOM HEAD SHOT", Toast.LENGTH_SHORT).show();
				/*Intent details = new Intent(context, ProductItemActivity.class);
				details.putExtra("bookImage", bestSellaryModel.getImgbook());
				details.putExtra("ratenum", bestSellaryModel.getRate());
				details.putExtra("price", bestSellaryModel.getPrice());
				details.putExtra("writer", bestSellaryModel.getWriter());
				details.putExtra("bookname", bestSellaryModel.getTitle());
				context.startActivity(details);*/
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
		@BindView(R.id.iv_book)
		ImageView iv_book;
		@BindView(R.id.tv_title)
		TextView tv_title;
		@BindView(R.id.rate)
		TextView rate;
		@BindView(R.id.img_star)
		ImageView imgStar;
		@BindView(R.id.item_book)
        ConstraintLayout itemBook;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
			ButterKnife.bind(this,itemView);
        }
    }
}

