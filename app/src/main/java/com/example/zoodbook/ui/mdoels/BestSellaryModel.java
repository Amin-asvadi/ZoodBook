package com.example.zoodbook.ui.mdoels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BestSellaryModel {
	//@SerializedName("img")

	@SerializedName("id")
	@Expose
	int id;



	@SerializedName("image")
	@Expose
	String imgbook;
	int imgstar;

	@SerializedName("author_id")
	@Expose
	int author_id;

	float rate;
	@SerializedName("title")
	@Expose
	String title;
	@SerializedName("price")
	@Expose
	String price;
	@SerializedName("author")
	@Expose
	String writer;



	public BestSellaryModel(String imgbook, int imgstar, float rate, String title,String price,String writer) {
		this.imgbook = imgbook;
		this.imgstar = imgstar;
		this.rate = rate;
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
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

	public String getImgbook() {
		return imgbook;
	}

	public void setImgbook(String imgbook) {
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
