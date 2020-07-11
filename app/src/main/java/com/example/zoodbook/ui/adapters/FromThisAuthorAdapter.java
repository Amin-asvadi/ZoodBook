package com.example.zoodbook.ui.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zoodbook.R;
import com.example.zoodbook.ui.ProductItemActivity.ProductItemActivity;
import com.example.zoodbook.ui.mdoels.FromThisAuthorModel;
import com.example.zoodbook.ui.utility.Global;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FromThisAuthorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
	List<FromThisAuthorModel> items;
	Context context;

	public FromThisAuthorAdapter(List<FromThisAuthorModel> items, Context context) {
		this.items = items;
		this.context = context;
	}

	@NonNull
	@Override
	public ViewHolderFromThisAuthor onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.items_the_best_selling_historical, parent, false);

		return new ViewHolderFromThisAuthor(view);
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		//Get Data From Model
		final FromThisAuthorModel fromThisAuthorModel = items.get(position);
		final ViewHolderFromThisAuthor vh = (ViewHolderFromThisAuthor) holder;
		vh.imgbook.setImageResource(fromThisAuthorModel.getImgbook());
		vh.imgstar.setImageResource(fromThisAuthorModel.getImgstar());
		vh.title.setText(fromThisAuthorModel.getTitle());
		vh.rate.setText(String.valueOf(fromThisAuthorModel.getRate()));
		//Dive Width TO Height
		ViewGroup.LayoutParams params = vh.item_book.getLayoutParams();
		params.height = (int) ((Global.getSizeScreen(context)) / 2);
		params.width = (int) ((Global.getSizeScreen(context)) / 3);
		vh.item_book.setLayoutParams(params);
		//Put Data To an Other Activity

	}

	@Override
	public int getItemCount() {
		return items.size();
	}
}

class ViewHolderFromThisAuthor extends RecyclerView.ViewHolder {

	ImageView imgbook;

	ImageView imgstar;

	TextView title;

	TextView rate;

	ConstraintLayout item_book;

	public ViewHolderFromThisAuthor(@NonNull View itemView) {
		super(itemView);
		imgbook = itemView.findViewById(R.id.imgbook);
		imgstar = itemView.findViewById(R.id.img_star);
		title = itemView.findViewById(R.id.title_book);
		rate = itemView.findViewById(R.id.rate);
		item_book = itemView.findViewById(R.id.item_book);
		try {
			ButterKnife.bind(this, itemView);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

