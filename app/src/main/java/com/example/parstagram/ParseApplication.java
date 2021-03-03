package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("vGAfkiGdeEzNm1j4mVONnxXBTw3Q18UM6kFdaVrS")
                .clientKey("JKm7lnaGuvpIkVe2XxjfaCiP1lyqO6yAYeqrCqrp")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
