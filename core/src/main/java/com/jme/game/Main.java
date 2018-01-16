package com.jme.game;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

// your game need to be on this package
// you can launch your game from other modules. for example if you want to launch game app on desktop go to DesktopLauncher class on desktop module.
public class Main extends SimpleApplication {
    @Override
    public void simpleInitApp() {
       Box b = new Box(1, 1, 1);                     // create box mesh
        Geometry geom = new Geometry("Box", b);       // create geometry from mesh

        Material mat = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md"); // create a simple material
        mat.setColor("Color", ColorRGBA.Blue);        // color the material blue
        geom.setMaterial(mat);                        // assign the material to geometry
        rootNode.attachChild(geom);
        //Spatial model = assetManager.loadModel("model.obj");
       // rootNode.attachChild(model);
        DirectionalLight sun = new DirectionalLight();
        sun.setDirection((new Vector3f(-0.5f, -0.5f, -0.5f)));
        sun.setColor(ColorRGBA.White);
        rootNode.addLight(sun);
    }

    @Override
    public void simpleUpdate(float tpf) {

    }

    @Override
    public void simpleRender(RenderManager rm){

    }
}