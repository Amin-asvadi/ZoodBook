package com.example.zoodbook;

import com.example.zoodbook.ui.mdoels.BestSellaryModel;
import com.example.zoodbook.ui.mdoels.FreeBookLibralysModel;
import com.example.zoodbook.ui.mdoels.HistorialSellerModel;
import com.example.zoodbook.ui.mdoels.Ser_Best_Seller;
import com.example.zoodbook.ui.mdoels.Ser_Historial_Seller;

public interface MainView {
	void show_best_seller();

	void Responce_best_responce(Ser_Best_Seller ser_best_seller);
	void Responce_Free_book_responce(FreeBookLibralysModel freeBookLibralysModel);
	void Responce_Historial_book_responce(Ser_Historial_Seller ser_historial_seller);
	void Response_No_Responce(String string);
	void onFailure_shop_product(String message);

	void Response_is_ok(String string);


}
