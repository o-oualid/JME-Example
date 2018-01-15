package com.jme.game;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;

public class Main extends SimpleApplication {
    @Override
    public void simpleInitApp() {
        Spatial mymodel = assetManager.loadModel("mymodel.obj");
        rootNode.attachChild(mymodel);
        DirectionalLight sun = new DirectionalLight();  sun.setDirection((new Vector3f(-0.5f, -0.5f, -0.5f)));  sun.setColor(ColorRGBA.White);  rootNode.addLight(sun);
    }

    @Override
    public void simpleUpdate(float tpf) {

    }

    @Override
    public void simpleRender(RenderManager rm) {

    }
}
