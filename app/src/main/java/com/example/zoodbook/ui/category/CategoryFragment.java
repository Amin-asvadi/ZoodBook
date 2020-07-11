package com.example.zoodbook.ui.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zoodbook.R;
import com.example.zoodbook.ui.adapters.CategoryAdapter;
import com.example.zoodbook.ui.mdoels.CategoryModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryFragment extends Fragment {
    View root;
    @BindView(R.id.rc_category)
    RecyclerView rc_category;

    CategoryAdapter categoryAdapter;
    ArrayList<CategoryModel> categoryitems;
    private CategoryViewModel categoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categoryViewModel =
                ViewModelProviders.of(this).get(CategoryViewModel.class);
        root = inflater.inflate(R.layout.fragment_category, container, false);
        ButterKnife.bind(this, root);
       // rc_category =root.findViewById(R.id.rc_category);
        categoryitems = new ArrayList<>();
        categoryitems.add(new CategoryModel("تاریخی",R.drawable.ic_history,R.drawable.ic_cricle_open_green));
        categoryitems.add(new CategoryModel("ادبیات",R.drawable.ic_literature,R.drawable.ic_crcle_blue));
        categoryitems.add(new CategoryModel("آموزشی",R.drawable.ic_student,R.drawable.ic_cricle_yellow));
        categoryitems.add(new CategoryModel("داستان و رمان",R.drawable.ic_write,R.drawable.ic_cricle_red));
        categoryitems.add(new CategoryModel("پزشکی",R.drawable.ic_doctor,R.drawable.ic_cricle_dark_blue));
        categoryitems.add(new CategoryModel("ریاضیات",R.drawable.ic_calculator,R.drawable.ic_cricle_green));
        categoryAdapter = new CategoryAdapter(categoryitems, getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager
                (getContext(), LinearLayoutManager.VERTICAL, false);

        rc_category.setLayoutManager(linearLayoutManager);
        rc_category.setAdapter(categoryAdapter);
        return root;
    }
}