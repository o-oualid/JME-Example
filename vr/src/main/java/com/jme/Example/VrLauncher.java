package com.jme.Example;

import com.jme3.app.LostFocusBehavior;
import com.jme3.app.VRAppState;
import com.jme3.app.VRConstants;
import com.jme3.app.VREnvironment;
import com.jme3.system.AppSettings;

public class VrLauncher extends VRAppState {

    private VrLauncher(AppSettings settings, VREnvironment environment) {
        super(settings, environment);
    }

    public static void main(String[] args) {
        AppSettings settings = new AppSettings(true);
        settings.put(VRConstants.SETTING_VRAPI, VRConstants.SETTING_VRAPI_OPENVR_VALUE);
        settings.put(VRConstants.SETTING_ENABLE_MIRROR_WINDOW, true);
        VREnvironment env = new VREnvironment(settings);
        env.initialize();
        if (env.isInitialized()) {
            VrLauncher vrLauncher = new VrLauncher(settings, env);
            vrLauncher.setMirrorWindowSize(1024, 800);
            Main app = new Main();
            app.setLostFocusBehavior(LostFocusBehavior.Disabled);
            app.setSettings(settings);
            app.setShowSettings(false);
            app.start();
        }
    }


}