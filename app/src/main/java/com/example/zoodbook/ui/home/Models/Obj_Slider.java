package com.example.zoodbook.ui.home.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Obj_Slider {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("value_type")
    @Expose
    private String valueType;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("id_value")
    @Expose
    private Integer idValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getIdValue() {
        return idValue;
    }

    public void setIdValue(Integer idValue) {
        this.idValue = idValue;
    }

}
