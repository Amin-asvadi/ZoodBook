package com.example.zoodbook.ui.home.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Obj_FreeItem {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("author_id")
    @Expose
    private Integer authorId;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("publisher_id")
    @Expose
    private Integer publisherId;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("is_most_visit")
    @Expose
    private Integer isMostVisit;
    @SerializedName("is_most_popular")
    @Expose
    private Integer isMostPopular;
    @SerializedName("printable_price")
    @Expose
    private Integer printablePrice;
    @SerializedName("image")
    @Expose
    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
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

    public Integer getIsMostVisit() {
        return isMostVisit;
    }

    public void setIsMostVisit(Integer isMostVisit) {
        this.isMostVisit = isMostVisit;
    }

    public Integer getIsMostPopular() {
        return isMostPopular;
    }

    public void setIsMostPopular(Integer isMostPopular) {
        this.isMostPopular = isMostPopular;
    }

    public Integer getPrintablePrice() {
        return printablePrice;
    }

    public void setPrintablePrice(Integer printablePrice) {
        this.printablePrice = printablePrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
