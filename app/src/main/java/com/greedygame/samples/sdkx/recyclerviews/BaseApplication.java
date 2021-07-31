package com.greedygame.samples.sdkx.recyclerviews;

import android.app.Application;
import android.content.Context;

import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppConfig.Builder builder = new AppConfig.Builder(this)
                .withAppId("81939769")
                .enableFacebookAds(true);
        GreedyGameAds.initWith(builder.build());
        appContext = this;
    }

    public static Context appContext = null;
}
