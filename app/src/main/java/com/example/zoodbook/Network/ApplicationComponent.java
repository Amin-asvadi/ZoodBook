package com.example.zoodbook.Network;


import com.example.zoodbook.ui.ProductItemActivity.ProductItemActivity;
import com.example.zoodbook.ui.home.HomeFragment;

import dagger.Component;


@RetrofitScope
@Component(dependencies = NetComponent.class, modules = ApplicationModule.class)

public interface ApplicationComponent {

    void inject_first_page(HomeFragment homeFragment);
    void inject_singel_page(ProductItemActivity productItemActivity);
}