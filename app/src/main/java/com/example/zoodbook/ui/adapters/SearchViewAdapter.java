package com.example.zoodbook.ui.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zoodbook.R;
import com.example.zoodbook.ui.mdoels.HistorialSellerModel;
import com.example.zoodbook.ui.utility.Global;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

	List<HistorialSellerModel> items;
	Context context;

	public SearchViewAdapter(List<HistorialSellerModel> items, Context context) {
		this.items = items;
		this.context = context;
	}

	@NonNull
	@Override
	public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.item_search_result, parent, false);
		return new SearchViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		final HistorialSellerModel historialSellerModel = items.get(position);
		final SearchViewHolder vh = (SearchViewHolder) holder;
		vh.imageView.setImageResource(historialSellerModel.getImgbook());
		vh.txtname.setText(historialSellerModel.getTitle());
		vh.txtprice.setText(historialSellerModel.getPrice());
		vh.txtauthor.setText(historialSellerModel.getWriter());
		//Dive Width TO Height
		/*ViewGroup.LayoutParams params = vh.item_book.getLayoutParams();
		params.height = (int) ((Global.getSizeScreen(context)) / 2);
		params.width = (int) ((Global.getSizeScreen(context)) / 3);
		vh.item_book.setLayoutParams(params);*/
	}

	@Override
	public int getItemCount() {
		return items.size();
	}
}

class SearchViewHolder extends RecyclerView.ViewHolder {
	@BindView(R.id.imgbook_search)
	ImageView imageView;
	@BindView(R.id.name_book_search)
	TextView txtname;
	@BindView(R.id.price_search)
	TextView txtprice;
	@BindView(R.id.author_book_search)
	TextView txtauthor;

	public SearchViewHolder(@NonNull View itemView) {
		super(itemView);

		//txtname = itemView.findViewById(R.id.name_book_search);
		//txtprice = itemView.findViewById(R.id.price_search);
		//txtauthor = itemView.findViewById(R.id.author_book_search);
		//imageView = itemView.findViewById(R.id.imgbook_search);
		try {
			ButterKnife.bind(this, itemView);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
