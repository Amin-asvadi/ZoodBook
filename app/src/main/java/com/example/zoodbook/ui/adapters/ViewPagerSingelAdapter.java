package com.example.zoodbook.ui.adapters;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerSingelAdapter extends FragmentPagerAdapter {
	List<Fragment> fragments = new ArrayList<>();
	List<String> fragmentTitle = new ArrayList<>();
int pos;

	public ViewPagerSingelAdapter(@NonNull FragmentManager fm, int behavior) {
		super(fm, behavior);
	}
	public void addFragments(Fragment fragment ,String title){

		fragments.add(fragment);
		fragmentTitle.add(title);
	}

	@NonNull
	@Override
	public Fragment getItem(int position) {

		return fragments.get(position);
	}

	@Override
	public int getCount() {
		return fragments.size();
	}

	@Nullable
	@Override
	public CharSequence getPageTitle(int position) {
		return fragmentTitle.get(position);
	}
}