package com.example.zoodbook.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zoodbook.R;
import com.example.zoodbook.ui.mdoels.CategoryModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
	List<CategoryModel> items;
	Context context;

	public CategoryAdapter(List<CategoryModel> items, Context context) {
		this.items = items;
		this.context = context;
	}

	@NonNull
	@Override
	public ViewHolderCategory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.item_ctaegory,parent,false);
		return new ViewHolderCategory(view) ;
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		final CategoryModel categoryModel = items.get(position);
		final ViewHolderCategory vh = (ViewHolderCategory) holder;
		vh.icon.setImageResource(categoryModel.getIcon());
		vh.icon.setBackgroundResource(categoryModel.getBack());
		vh.category_name.setText(categoryModel.getName());

		//ViewGroup.LayoutParams params =vh.item_Category.getLayoutParams();
		//params.height = (int) ((Global.getSizeScreen(context)) / 4);
		//params.width = (int) ((Global.getSizeScreen(context)) / 3);
		/*vh.item_book.setLayoutParams(params);
		vh.item_book.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Toast.makeText(context, "BOOOOOOM HEAD SHOT", Toast.LENGTH_SHORT).show();
				Intent details = new Intent(context, ProductItemActivity.class);
				details.putExtra("bookImage", bestSellaryModel.getImgbook());
				details.putExtra("ratenum", bestSellaryModel.getRate());
				details.putExtra("price", bestSellaryModel.getPrice());
				details.putExtra("writer", bestSellaryModel.getWriter());
				details.putExtra("bookname", bestSellaryModel.getTitle());
				context.startActivity(details);
			}
		});*/
	}

	@Override
	public int getItemCount() {
		return items.size();
	}
}
class ViewHolderCategory extends RecyclerView.ViewHolder {
	@BindView(R.id.category_icon)
	ImageView icon;
	@BindView(R.id.category_name)
	TextView category_name;
	@BindView(R.id.category_item_id)
ConstraintLayout item_Category;
	public ViewHolderCategory(@NonNull View itemView) {
		super(itemView);
		try {
			ButterKnife.bind(this, itemView);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//item_Category = itemView.findViewById(R.id.category_item_id);
		//icon = itemView.findViewById(R.id.category_icon);
		//category_name = itemView.findViewById(R.id.category_name);
	}
}
