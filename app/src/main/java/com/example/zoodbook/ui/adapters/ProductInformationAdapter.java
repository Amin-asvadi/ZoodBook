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
import com.example.zoodbook.ui.mdoels.ProductInformationModel;
import com.example.zoodbook.ui.utility.Global;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductInformationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
	List<ProductInformationModel> items;
	Context context;

	public ProductInformationAdapter(List<ProductInformationModel> items, Context context) {
		this.items = items;
		this.context = context;
	}

	@NonNull
	@Override
	public ViewHolderProductInformation onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.item_information,parent,false);

		return new ViewHolderProductInformation(view);
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		ProductInformationModel productInformationModel = items.get(position);
		final ViewHolderProductInformation vh = (ViewHolderProductInformation) holder;
		vh.title.setText(productInformationModel.getTitle());
		vh.desc.setText( String.valueOf(productInformationModel.getDecraption()));

		ViewGroup.LayoutParams params =vh.item_information.getLayoutParams();
		params.height = (int) ((Global.getSizeScreen(context)) / 4);
		params.width = (int) ((Global.getSizeScreen(context)) / 3);
		vh.item_information.setLayoutParams(params);

	}

	@Override
	public int getItemCount() {
		return items.size();
	}
}
class ViewHolderProductInformation extends RecyclerView.ViewHolder {
	@BindView(R.id.txt_info_title)
	TextView title;
	@BindView(R.id.txt_info_desk)
	TextView desc;
	@BindView(R.id.cons_item_info)
	ConstraintLayout item_information;
	public ViewHolderProductInformation(@NonNull View itemView) {
		super(itemView);
		/*desc = itemView.findViewById(R.id.txt_info_desk);
		title = itemView.findViewById(R.id.txt_info_title);
		item_information = itemView.findViewById(R.id.cons_item_info);
*/
		try {
			ButterKnife.bind(this, itemView);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




