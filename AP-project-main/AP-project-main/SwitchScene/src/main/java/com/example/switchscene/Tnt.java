package com.example.switchscene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Timer;

public class Tnt implements Serializable {
    Timer t;
    static ArrayList<ImageView> tnts = new ArrayList<ImageView>();
    public static void explode(){
        for(ImageView i : tnts){
            if(i.getBoundsInParent().intersects(NewController.heros.get(0).getBoundsInParent())){

                i.setImage(new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/bomb.gif"));
                i.setVisible(false);
            }
        }

    }
}
