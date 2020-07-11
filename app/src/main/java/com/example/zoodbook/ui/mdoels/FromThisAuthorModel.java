package com.example.zoodbook.ui.mdoels;

public class FromThisAuthorModel {
	int imgbook;
	int imgstar;
	float rate;
	String price;
	String writer;
	String about;
	String title;

	public FromThisAuthorModel(int imgbook, int imgstar, float rate, String title, String price, String writer,String about) {
		this.imgbook = imgbook;
		this.imgstar = imgstar;
		this.rate = rate;
		this.title = title;
		this.price = price;
		this.writer = writer;
		this.about =about;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
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
