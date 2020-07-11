package com.example.zoodbook.ui.mdoels;

import android.graphics.drawable.Drawable;

public class CategoryModel {
	String name;
	int icon;
int back;

	public CategoryModel(String name, int icon,int back) {
		this.name = name;
		this.icon = icon;
		this.back = back;
	}

	public int getBack() {
		return back;
	}

	public void setBack(int back) {
		this.back = back;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

}
