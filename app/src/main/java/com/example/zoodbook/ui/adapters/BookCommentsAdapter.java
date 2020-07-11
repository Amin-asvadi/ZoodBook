package com.example.zoodbook.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zoodbook.R;
import com.example.zoodbook.ui.ViewModel.BookUserCommentModel;
import com.example.zoodbook.ui.utility.Global;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookCommentsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
	List<BookUserCommentModel> items;
	public Context context;


	public BookCommentsAdapter(List<BookUserCommentModel> items, Context context) {
		this.items = items;
		this.context = context;
	}

	@NonNull
	@Override
	public ViewHolderUserComments onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.item_book_comment, parent, false);


		return new ViewHolderUserComments(view);
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		BookUserCommentModel bookUserCommentModel = items.get(position);
		final ViewHolderUserComments vh = (ViewHolderUserComments) holder;
		vh.imgprofile.setImageResource(bookUserCommentModel.getImgProfile());
		//vh.imgstar.setImageResource(freeBookLibralysModel.getImgstar());
		vh.ratingBar.setStepSize(bookUserCommentModel.getStepSize());
		vh.userName.setText(bookUserCommentModel.getUserName());
		vh.date.setText(bookUserCommentModel.getDate());
		vh.descreption.setText(bookUserCommentModel.getComment());

	}

	@Override
	public int getItemCount() {
		return items.size();

	}
}
class ViewHolderUserComments extends RecyclerView.ViewHolder {
	@BindView(R.id.cons_book_comment)
	ConstraintLayout constraintLayout;
	@BindView(R.id.img_profile)
	ImageView imgprofile;
	@BindView(R.id.ratingBarComment)
	RatingBar ratingBar;
	@BindView(R.id.txt_date)
	TextView date;
	@BindView(R.id.txt_profile_name)
	TextView userName;
	@BindView(R.id.txt_comment_user)
	TextView descreption;


	public ViewHolderUserComments(@NonNull View itemView) {
		super(itemView);
		//constraintLayout = itemView.findViewById(R.id.cons_book_comment);
		//imgprofile = itemView.findViewById(R.id.img_profile);
		//ratingBar = itemView.findViewById(R.id.ratingBarComment);
		//userName =itemView.findViewById(R.id.txt_profile_name);
		//date =itemView.findViewById(R.id.txt_date);
		//descreption =itemView.findViewById(R.id.txt_comment_user);
		try {
			ButterKnife.bind(this, itemView);
		} catch (Exception e) {
			e.printStackTrace();
		}



	}
}
