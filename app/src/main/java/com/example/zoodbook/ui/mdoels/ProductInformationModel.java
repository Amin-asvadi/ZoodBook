package com.example.zoodbook.ui.mdoels;

public class ProductInformationModel {
	String title;
	String decraption;

	public ProductInformationModel(String title, String decraption) {
		this.title = title;
		this.decraption = decraption;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDecraption() {
		return decraption;
	}

	public void setDecraption(String decraption) {
		this.decraption = decraption;
	}
}
