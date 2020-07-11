package com.example.zoodbook.ui.ViewModel;

public class BookUserCommentModel {
	int imgProfile;
	float stepSize;
	String date;
	String userName;
	String comment;

	public BookUserCommentModel(int imgProfile, float stepSize, String date, String userName, String comment) {
		this.imgProfile = imgProfile;
		this.stepSize = stepSize;
		this.date = date;
		this.userName = userName;
		this.comment = comment;
	}

	public int getImgProfile() {
		return imgProfile;
	}

	public void setImgProfile(int imgProfile) {
		this.imgProfile = imgProfile;
	}

	public float getStepSize() {
		return stepSize;
	}

	public void setStepSize(float stepSize) {
		this.stepSize = stepSize;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
