package com.example.zoodbook.ui.home;

import android.util.Log;

import com.example.zoodbook.Network.RetrofitApiInterface;
import com.example.zoodbook.ui.home.Models.Obj_Data;
import com.example.zoodbook.ui.home.Models.Ser_Book_Main;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class HomeFragmentPresenter {
	RetrofitApiInterface retrofitApiInterface;

	private HomeView homeView;
	private CompositeDisposable disposable;

	public HomeFragmentPresenter(RetrofitApiInterface retrofitApiInterface,
								 HomeView homeView) {
		this.retrofitApiInterface = retrofitApiInterface;
		this.homeView = homeView;
		disposable = new CompositeDisposable();
	}

	public void getData(int device_os,int version) {

		homeView.showWait();
		try {
			retrofitApiInterface.Get_Book_HomePage_Data(device_os,version)
					.observeOn(AndroidSchedulers.mainThread())
					.subscribeOn(Schedulers.io())
					.subscribe(new Observer<Response<Ser_Book_Main>>() {
						@Override
						public void onSubscribe(Disposable d) {
							disposable.add(d);
						}

						@Override
						public void onNext(Response<Ser_Book_Main> response) {
							homeView.removeWait();
							if (response.code() == 200) {
								homeView.Response(response.body());
							} else{

								homeView.onServerFailure(response.body());
							}

						}

						@Override
						public void onError(Throwable e) {
							homeView.removeWait();
							homeView.onFailure(e.getMessage());
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
