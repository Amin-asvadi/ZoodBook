package com.example.zoodbook.ui.utility;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

public class Global {

	public static int getSizeScreen(Context context) {
		DisplayMetrics displayMetrics = new DisplayMetrics();
		((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
		int height = displayMetrics.heightPixels;
		int width = displayMetrics.widthPixels;
		return width;
	}
}
