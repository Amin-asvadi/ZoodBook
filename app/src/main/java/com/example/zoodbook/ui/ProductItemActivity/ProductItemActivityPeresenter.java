package com.example.zoodbook.ui.ProductItemActivity;

import android.util.Log;

import com.example.zoodbook.Network.RetrofitApiInterface;
import com.example.zoodbook.ui.home.Models.Ser_Book_Main;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class ProductItemActivityPeresenter {
private ProductItemView productItemView;

 RetrofitApiInterface retrofitApiInterface;
	private CompositeDisposable disposable;

	public ProductItemActivityPeresenter(RetrofitApiInterface retrofitApiInterface,
	                                     ProductItemView productItemView) {
		this.retrofitApiInterface = retrofitApiInterface;
		this.productItemView = productItemView;
		disposable = new CompositeDisposable();
	}

	public void ResponseCheck() {

		try {
			retrofitApiInterface.Get_Url(291)
					.observeOn(AndroidSchedulers.mainThread())
					.subscribeOn(Schedulers.io())
					.subscribe(new Observer<Response<Ser_Book_Main>>() {
						@Override
						public void onSubscribe(Disposable d) {
							disposable.add(d);
						}

						@Override
						public void onNext(Response<Ser_Book_Main> response) {
							if (response.code() == 200){
								productItemView.Responce_PrItem_responce(response.body());
							}


						}

						@Override
						public void onError(Throwable e) {
						}

						@Override
						public void onComplete() {

						}
					});
		} catch (NumberFormatException e) {
			Log.i("numberformat", "");
		}
	}
}
