package com.jme.game;

import com.jme3.app.VRAppState;
import com.jme3.app.VREnvironment;
import com.jme3.system.AppSettings;

/**
 * Created by: ouazrou-oualid on: 15/01/2018 package: com.jme.game project: jme.
 */

class VrLauncher extends VRAppState  {

    /**
     * Create a new VR app state with given settings. The app state relies on the the given {@link VREnvironment VR environment}.
     *
     * @param settings    the settings to use.
     * @param environment the {@link VREnvironment VR environment} that this app state is using.
     */
    public VrLauncher(AppSettings settings, VREnvironment environment) {
        super(settings, environment);
    }



}
