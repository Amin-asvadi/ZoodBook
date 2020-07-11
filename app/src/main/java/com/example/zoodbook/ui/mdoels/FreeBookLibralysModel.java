package com.example.zoodbook.ui.mdoels;

public class FreeBookLibralysModel {

    int imgbook;
    int imgstar;
    float rate;
    String bookname;
    String wirter;
    String price;

    public FreeBookLibralysModel(int imgbook, int imgstar, float rate, String bookname, String wirter,String price) {
        this.imgbook = imgbook;
        this.imgstar = imgstar;
        this.rate = rate;
        this.bookname = bookname;
        this.wirter = wirter;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
