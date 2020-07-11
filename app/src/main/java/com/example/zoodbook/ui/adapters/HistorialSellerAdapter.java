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
import com.example.zoodbook.ui.mdoels.HistorialSellerModel;
import com.example.zoodbook.ui.utility.Global;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HistorialSellerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
	List<HistorialSellerModel> items;
	Context context;
	View view;

	public HistorialSellerAdapter(List<HistorialSellerModel> items, Context context) {
		this.items = items;
		this.context = context;
	}

	@NonNull
	@Override
	public ViewHolderBookseller onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.items_the_best_selling_historical, parent, false);
		return new ViewHolderBookseller(view);
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		//Get Data From Model
		final HistorialSellerModel historialSellerModel = items.get(position);
		final ViewHolderBookseller vh = (ViewHolderBookseller) holder;
		vh.imgbook.setImageResource(historialSellerModel.getImgbook());
		vh.imgstar.setImageResource(historialSellerModel.getImgstar());
		vh.title.setText(historialSellerModel.getTitle());
		vh.rate.setText(String.valueOf(historialSellerModel.getRate()));
		//Dive Width TO Height
		ViewGroup.LayoutParams params = vh.item_book.getLayoutParams();
		params.height = (int) ((Global.getSizeScreen(context)) / 2);
		params.width = (int) ((Global.getSizeScreen(context)) / 3);
		vh.item_book.setLayoutParams(params);

		//Put Data To an Other Activity
		vh.imgbook.setOnClickListener(new View.OnClickListener() {
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

	}

	@Override
	public int getItemCount() {
		return items.size();
	}
}

class ViewHolderBookseller extends RecyclerView.ViewHolder {
	@BindView(R.id.imgbook)
	ImageView imgbook;
	@BindView(R.id.img_star)
	ImageView imgstar;
	@BindView(R.id.title_book)
	TextView title;
	@BindView(R.id.rate)
	TextView rate;
	@BindView(R.id.item_book)
	ConstraintLayout item_book;

	public ViewHolderBookseller(@NonNull View itemView) {
		super(itemView);
		//imgbook = itemView.findViewById(R.id.imgbook);
		//imgstar = itemView.findViewById(R.id.img_star);
		//title = itemView.findViewById(R.id.title_book);
		//rate = itemView.findViewById(R.id.rate);
	//	item_book = itemView.findViewById(R.id.item_book);
		try {
			ButterKnife.bind(this, itemView);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



