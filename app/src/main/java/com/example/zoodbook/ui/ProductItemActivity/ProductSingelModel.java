package com.example.zoodbook.ui.ProductItemActivity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductSingelModel {

	@SerializedName("id")
	@Expose
	private int id;
	@SerializedName("title")
	private String title;
	@SerializedName("author_id")
	private int author_id;
	@SerializedName("author")
	private String author;
	@SerializedName("publisher_id")
	@Expose
	private int publisher_id;
	@SerializedName("publisher")
	@Expose
	private String publisher;
	@SerializedName("price")
	@Expose
	private String price;
	@SerializedName("category_id")
	@Expose
	private String category_id;
	@SerializedName("category")
	@Expose
	private String category;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("image")
	@Expose
	private String image;
	@SerializedName("is_most_visit")
	@Expose
	private int is_most_visit;
	@SerializedName("is_most_popular")
	@Expose
	private int is_most_popular;
	@SerializedName("printable_price")
	@Expose
	private int printable_price;
	@SerializedName("comments")
	@Expose
	private String[] comment;

	public String[] getComment() {
		return comment;
	}

	public void setComment(String[] comment) {
		this.comment = comment;
	}

	public int getPrintable_price() {
		return printable_price;
	}

	public void setPrintable_price(int printable_price) {
		this.printable_price = printable_price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getIs_most_visit() {
		return is_most_visit;
	}

	public void setIs_most_visit(int is_most_visit) {
		this.is_most_visit = is_most_visit;
	}

	public int getIs_most_popular() {
		return is_most_popular;
	}

	public void setIs_most_popular(int is_most_popular) {
		this.is_most_popular = is_most_popular;
	}
}
