package com.example.zoodbook.Network;
import com.example.zoodbook.ui.home.Models.Ser_Book_Main;
import com.example.zoodbook.ui.mdoels.FreeBookLibralysModel;
import com.example.zoodbook.ui.mdoels.HistorialSellerModel;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitApiInterface {


	@GET("v1/book/home")
	Observable<Response<Ser_Book_Main>> Get_Book_HomePage_Data(
			@Query("device_os") int device_os,
			@Query("version") int version
	);

	@GET("v1/book/291")
	Observable<Response<Ser_Book_Main>> Get_Url(
			@Query("id") int id
	);
}