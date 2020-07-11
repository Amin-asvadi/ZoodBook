package com.example.zoodbook.ui.ViewModel;

import com.example.zoodbook.ui.mdoels.HistorialSellerModel;

public class HistorialSellerViewModel {
	int imgbook;
	int imgstar;
	float rate;
	String title;

	public HistorialSellerViewModel(HistorialSellerModel historialSellerModel) {
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
