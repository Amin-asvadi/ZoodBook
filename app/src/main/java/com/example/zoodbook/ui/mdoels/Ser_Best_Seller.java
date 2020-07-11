package com.example.zoodbook.ui.mdoels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.net.BindException;
import java.util.List;

public class Ser_Best_Seller {

@SerializedName("data")
@Expose
private List<BestSellaryModel> data;
	public List<BestSellaryModel> getData() {
		return data;
	}

	public void setData(List<BestSellaryModel> data) {
		this.data = data;
	}

}
