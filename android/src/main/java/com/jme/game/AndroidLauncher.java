package com.jme.game;

import android.os.Bundle;
import com.jme3.app.AndroidHarness;

public class AndroidLauncher extends AndroidHarness {
    public AndroidLauncher(){
        appClass="com.jme.game";
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        app=new Main();
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onDestroy() {
    }
}