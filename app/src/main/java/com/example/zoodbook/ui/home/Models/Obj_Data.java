package com.example.zoodbook.ui.home.Models;

import com.example.zoodbook.ui.ProductItemActivity.ProductSingelModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Obj_Data {
    @SerializedName("sliders")
    @Expose
    private List<Obj_Slider> sliders = null;
    @SerializedName("banner")
    @Expose
    private Obj_Slider banner = null;
    @SerializedName("free_items")
    @Expose
    private List<Obj_FreeItem> freeItems = null;
    @SerializedName("most_sale")
    @Expose
    private List<Obj_MostSale> mostSale = null;
    @SerializedName("most_visit")
    @Expose
    private List<Obj_MostSale> most_visit = null;
    @SerializedName("singel_page")
    public List<Obj_Slider> getSliders() {
        return sliders;
    }

    private List<ProductSingelModel> data = null;

    public List<ProductSingelModel> getPrdSingel() {
        return data;
    }
    public void setPrdSingel(List<ProductSingelModel> data) {
        this.data = data;
    }

    public void setSliders(List<Obj_Slider> sliders) {
        this.sliders = sliders;
    }

    public List<Obj_FreeItem> getFreeItems() {
        return freeItems;
    }

    public void setFreeItems(List<Obj_FreeItem> freeItems) {
        this.freeItems = freeItems;
    }

    public List<Obj_MostSale> getMostSale() {
        return mostSale;
    }

    public void setMostSale(List<Obj_MostSale> mostSale) {
        this.mostSale = mostSale;
    }

    public Obj_Slider getBanner() {
        return banner;
    }

    public void setBanner(Obj_Slider banner) {
        this.banner = banner;
    }

    public List<Obj_MostSale> getMost_visit() {
        return most_visit;
    }

    public void setMost_visit(List<Obj_MostSale> most_visit) {
        this.most_visit = most_visit;
    }
}
