package com.example.zoodbook.ui.home;

import com.example.zoodbook.ui.home.Models.Obj_Data;
import com.example.zoodbook.ui.home.Models.Ser_Book_Main;

public interface HomeView {

    void showWait();

    void removeWait();

    void onFailure(String message);

    void onServerFailure(Ser_Book_Main ser_book_main);

    void Response(Ser_Book_Main ser_book_main);
}
