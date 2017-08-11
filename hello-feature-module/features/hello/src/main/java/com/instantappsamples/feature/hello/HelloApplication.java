package com.instantappsamples.feature.hello;

import android.app.Application;
import android.util.Log;

import main.Toto;

public class HelloApplication extends Application implements Toto {
    @Override
    public void sayToto() {
        Log.e("laurent", "HelloApplication HelloApplication HelloApplication");
    }
}
