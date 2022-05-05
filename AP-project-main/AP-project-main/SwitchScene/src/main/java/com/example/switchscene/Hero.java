package com.example.switchscene;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.Serializable;

public class Hero implements Serializable {
    private static int health=100;
    private static ImageView hero;
    public void setHero(ImageView i){
        hero=i;
    }
    public ImageView getHero(){
        return hero;
    }
    public void setHealth(int i){
        health=i;
    }
    public int getHealth(){
        return health;
    }
    public boolean isAlive(){
        return health>0;
    }
    public void die(){


    }
}
