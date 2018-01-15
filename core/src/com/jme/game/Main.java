package com.jme.game;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

public class Main extends SimpleApplication {
    private Geometry geometry;
    @Override
    public void simpleInitApp() {
        Box box = new Box(1, 1, 1);
         geometry = new Geometry("Box", box);
        Material mat = new Material(assetManager,"Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        geometry.setMaterial(mat);
        rootNode.attachChild(geometry);
    }

    @Override
    public void simpleUpdate(float tpf) {
        geometry.rotate(tpf,tpf,tpf);
    }

    @Override
    public void simpleRender(RenderManager rm) {

    }
}
