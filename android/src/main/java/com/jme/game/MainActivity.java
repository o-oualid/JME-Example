package com.jme.game;

import android.os.Bundle;

import com.jme3.app.AndroidHarness;

public class MainActivity extends AndroidHarness {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app=new Main();
        app.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        app.stop();
    }
}