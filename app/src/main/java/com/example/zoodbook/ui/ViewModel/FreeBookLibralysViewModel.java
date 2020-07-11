package com.example.zoodbook.ui.ViewModel;

import android.content.Context;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.zoodbook.ui.mdoels.FreeBookLibralysModel;

public class FreeBookLibralysViewModel {

	int imgbook;
	int imgstar;
	float rate;
	String bookname;
	String wirter;
	Context context;

	public FreeBookLibralysViewModel(Context context) {
		this.context = context;
	}

	public FreeBookLibralysViewModel(FreeBookLibralysModel freeBookLibralysModel) {
		this.imgbook = imgbook;
		this.imgstar = imgstar;
		this.rate = rate;
		this.bookname = bookname;
		this.wirter = wirter;
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

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getWirter() {
		return wirter;
	}

	public void setWirter(String wirter) {
		this.wirter = wirter;
	}
}
