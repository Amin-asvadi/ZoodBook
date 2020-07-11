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

import com.balysv.materialripple.MaterialRippleLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.zoodbook.ClsSharedPreference;
import com.example.zoodbook.R;
import com.example.zoodbook.ui.ProductItemActivity.ProductItemActivity;
import com.example.zoodbook.ui.home.Models.Obj_FreeItem;
import com.example.zoodbook.ui.utility.Global;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FreeBookLibralysAdapter extends RecyclerView.Adapter<FreeBookLibralysAdapter.ViewHolder> {


    private List<Obj_FreeItem> items;
    public Context context;
    private final int limit = 3;
    private ClsSharedPreference sharedPreference;
    private ClickListener clickListener;


    public FreeBookLibralysAdapter(Context context,ClickListener onclick) {
        this.context = context;
        sharedPreference=new ClsSharedPreference(context);
        this.clickListener = onclick;
    }

    public List<Obj_FreeItem> getItems() {
        return items;
    }

    public void setItems(List<Obj_FreeItem> items) {
        this.items = items;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.items_free_book_home, parent, false);
        return new ViewHolder(view,clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Obj_FreeItem item = getItems().get(position);

        holder.bookName.setText(item.getTitle());
        holder.bookWriter.setText(item.getAuthor());
        Glide.with(context)
                .load(sharedPreference.get_file_url() + items.get(position).getImage())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_placeholder_large)
                .dontAnimate()
                .into(holder.imgBook);

        ViewGroup.LayoutParams params = holder.itemsFreeBook.getLayoutParams();
        params.width = (int) ((Global.getSizeScreen(context)) / 1.20);
        holder.itemsFreeBook.setLayoutParams(params);
        holder.itemsFreeBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent details = new Intent(context, ProductItemActivity.class);

                context.startActivity(details);
            }
        });
    }


    @Override
    public int getItemCount() {


        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.img_book)
        ImageView imgBook;
        @BindView(R.id.book_name)
        TextView bookName;
        @BindView(R.id.book_writer)
        TextView bookWriter;
        @BindView(R.id.img_book_star)
        ImageView imgBookStar;
        @BindView(R.id.book_rate)
        TextView bookRate;
        @BindView(R.id.items_free_book1)
        ConstraintLayout itemsFreeBook1;
        @BindView(R.id.items_free_book)
        MaterialRippleLayout itemsFreeBook;

        ClickListener onclickListener;
        public ViewHolder(@NonNull View itemView,ClickListener onclickListener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.onclickListener = onclickListener;
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
onclickListener.onclick(getAdapterPosition());
        }
    }


public interface ClickListener{
        void onclick(int position);

}
}
