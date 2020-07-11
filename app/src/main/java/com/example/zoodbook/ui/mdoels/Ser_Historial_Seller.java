package com.example.zoodbook.ui.mdoels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Ser_Historial_Seller {
	@SerializedName("data")
	@Expose
	private List<HistorialSellerModel> data;
	public List<HistorialSellerModel> getData() {
		return data;
	}

	public void setData(List<HistorialSellerModel> data) {
		this.data = data;
	}
}
