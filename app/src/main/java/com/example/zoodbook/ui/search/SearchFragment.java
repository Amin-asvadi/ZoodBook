
package com.example.zoodbook.ui.search;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zoodbook.R;
import com.example.zoodbook.ui.adapters.HistorialSellerAdapter;
import com.example.zoodbook.ui.adapters.SearchViewAdapter;
import com.example.zoodbook.ui.mdoels.HistorialSellerModel;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    SearchView searchView;
    SearchViewAdapter searchViewAdapter;
    RecyclerView rc_serach;
    List<HistorialSellerModel> list;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_search, container, false);
/*
        rc_serach = root.findViewById(R.id.rc_search);
        searchView = root.findViewById(R.id.searchView);
        list = new ArrayList<>();
        list.add(new HistorialSellerModel
                (R.drawable.my_war, R.drawable.star, 4.5f,
                        "کتاب نبرد من", "45,000", "فرشته اکبر پور", "کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
        list.add(new HistorialSellerModel
                (R.drawable.escape_from_the_camp, R.drawable.star, 3.8f, "فرار از اردوگاه 14", "19,000", "بلین هاردن", "کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
        list.add(new HistorialSellerModel
                (R.drawable.west, R.drawable.star, 4.8f, "غرب", "17,000", "صادق زیبا کلام", "کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
        list.add(new HistorialSellerModel
                (R.drawable.my_war, R.drawable.star, 4.5f, "کتاب نبرد من", "38,000", "فرشته اکبر پور", "کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
        list.add(new HistorialSellerModel
                (R.drawable.escape_from_the_camp, R.drawable.star, 3.8f, "فرار از اردوگاه 14", "45,000", "فرشته اکبر پور", "کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
        list.add(new HistorialSellerModel
                (R.drawable.escape_from_the_camp, R.drawable.star, 3.8f, "فرار از اردوگاه 14", "45,000", "فرشته اکبر پور", "کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
        list.add(new HistorialSellerModel
                (R.drawable.escape_from_the_camp, R.drawable.star, 3.8f, "فرار از اردوگاه 14", "45,000", "فرشته اکبر پور", "کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
        list.add(new HistorialSellerModel
                (R.drawable.escape_from_the_camp, R.drawable.star, 3.8f, "فرار از اردوگاه 14", "45,000", "فرشته اکبر پور", "کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
        list.add(new HistorialSellerModel
                (R.drawable.escape_from_the_camp, R.drawable.star, 3.8f, "فرار از اردوگاه 14", "45,000", "فرشته اکبر پور", "کتاب نبرد من نوشته آدولف هیتلر با ترجمه فرشته اکبرپور را یکی دوستانم برایم فرستاد. او اینکار را کرد زیرا میدانست تا چه میزان به زندگی رهبرآلمان نازی وجنگ جهانی دوم علاقه\u200Cمندم.یمیل او دارای ضمیمه کتاب و حاوی متنی به این شرح بود: «فرض کن برنامه هیتلر بتواند اجرا شود. آنچه که او تصور می\u200Cکرد، صد سال پس ازآن،حالت مداوم 250میلیون آلمانی به مرزهایبی\u200Cشمار کشورِ بزرگ بود. "));
        searchViewAdapter = new SearchViewAdapter(list, getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager
                (getContext(), LinearLayoutManager.VERTICAL, true);
        rc_serach.setLayoutManager(linearLayoutManager);
        rc_serach.setAdapter(searchViewAdapter);

        searchView.setOnSearchClickListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (list.contains(query))
                    searchViewAdapter.get
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
*/


        return root;
    }
}