package com.example.zoodbook.ui.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.balysv.materialripple.MaterialRippleLayout;
import com.example.zoodbook.R;
import com.example.zoodbook.ui.ProductItemActivity.ProductItemActivity;
import com.example.zoodbook.ui.mdoels.HistorialSellerModel;
import com.example.zoodbook.ui.utility.Global;

import java.util.List;

import butterknife.BindView;

public class HistorialShowAllAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
	List<HistorialSellerModel> items;
	Context context;

	public static final int SPAN_COUNT_ONE = 1;
	public static final int SPAN_COUNT_TWO = 2;

	private static final int VIEW_TYPE_SMALL = 1;
	private static final int VIEW_TYPE_BIG = 2;
	int spanCount;
	private GridLayoutManager mLayoutManager;
	int status;


	@Override
	public int getItemViewType(int position) {
		 spanCount = mLayoutManager.getSpanCount();
		Log.e("BOOM",String.valueOf(spanCount));
		if (spanCount == SPAN_COUNT_ONE) {
			return VIEW_TYPE_BIG;
		} else {
			return VIEW_TYPE_SMALL;
		}
	}

	public HistorialShowAllAdapter(List<HistorialSellerModel> items, Context context,GridLayoutManager layoutManager) {
		this.items = items;
		this.context = context;
		mLayoutManager = layoutManager;
	}

	@NonNull
	@Override
	public ViewHolderBook onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		View view;
		status = viewType;
		if (viewType == VIEW_TYPE_BIG) {
			view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_show_all_linear, parent, false);

		} else {
			view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_show_all_grid, parent, false);
		}
		return new ViewHolderBook(view);
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		//Get Data From Model
		final HistorialSellerModel historialSellerModel = items.get(position);
		final ViewHolderBook vh = (ViewHolderBook) holder;
		vh.imgbook.setImageResource(historialSellerModel.getImgbook());
		vh.imgstar.setImageResource(historialSellerModel.getImgstar());
		vh.title.setText(historialSellerModel.getTitle());
		vh.rate.setText(String.valueOf(historialSellerModel.getRate()));
		vh.item_bookM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Toast.makeText(context, "BOOOOOOM HEAD SHOT", Toast.LENGTH_SHORT).show();
				Intent details = new Intent(context, ProductItemActivity.class);
				details.putExtra("bookImage", historialSellerModel.getImgbook());
				details.putExtra("ratenum", historialSellerModel.getRate());
				details.putExtra("price", historialSellerModel.getPrice());
				details.putExtra("about", historialSellerModel.getAbout());
				details.putExtra("writer", historialSellerModel.getWriter());
				details.putExtra("ratebar", historialSellerModel.getRate());
				details.putExtra("bookname", historialSellerModel.getTitle());
				context.startActivity(details);
			}
		});
if (holder.getItemViewType() == VIEW_TYPE_BIG){
			ViewGroup.LayoutParams params =vh.item_book.getLayoutParams();
			params.height = (int) ((Global.getSizeScreen(context)) / 3);
			vh.item_book.setLayoutParams(params);}

	else {
	ViewGroup.LayoutParams paramses = vh.item_book.getLayoutParams();
	paramses.height = (int) ((Global.getSizeScreen(context)) / 1.5);
	paramses.width = (int) ((Global.getSizeScreen(context)) / 2);
	vh.item_book.setLayoutParams(paramses);
}

	}

	@Override
	public int getItemCount() {
		return items.size();
	}
}
class ViewHolderBook extends RecyclerView.ViewHolder {
	@BindView(R.id.imgbook)
	ImageView imgbook;
	@BindView(R.id.img_star)
	ImageView imgstar;
	@BindView(R.id.title_book)
	TextView title;
	@BindView(R.id.rate)
	TextView rate;
	@BindView(R.id.item_book2)
	RelativeLayout item_book;
	@BindView(R.id.item_book)
	MaterialRippleLayout item_bookM;

	public ViewHolderBook(@NonNull View itemView) {
		super(itemView);

		//imgbook = itemView.findViewById(R.id.imgbook);
		//imgstar = itemView.findViewById(R.id.img_star);
		//title = itemView.findViewById(R.id.title_book);
		//rate = itemView.findViewById(R.id.rate);
		//item_book = itemView.findViewById(R.id.item_book2);
		//item_bookM = itemView.findViewById(R.id.item_book);
	}
}
