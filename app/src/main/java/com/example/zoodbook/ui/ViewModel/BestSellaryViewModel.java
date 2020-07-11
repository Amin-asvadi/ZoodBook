package com.example.zoodbook.ui.ViewModel;

import android.content.Context;

import com.example.zoodbook.ui.mdoels.BestSellaryModel;

public class BestSellaryViewModel {
	int imgbook;
	int imgstar;
	float rate;
	String title;
	Context context;

	public BestSellaryViewModel(Context context) {
		this.context = context;
	}

	public BestSellaryViewModel(BestSellaryModel bestSellaryModel) {
		this.imgbook = imgbook;
		this.imgstar = imgstar;
		this.rate = rate;
		this.title = title;
	}

	public int getImgbook() {
		return imgbook;
	}

	public void setImgbook(int imgbook) {
		this.imgbook = imgbook;
	}

	public int getImgstar() {
		return imgstar;
	}

	public void setImgstar(int imgstar) {
		this.imgstar = imgstar;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
