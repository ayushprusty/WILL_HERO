package com.example.switchscene;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.Serializable;

public class Orc  implements Serializable
{
    private int health;
    private int reward;
    private double[] size;

    public boolean isAlive(){
        return health > 0;
    }
    public void disappear(){}
    public void jump(){
        for(ImageView i : NewController.orcs2){
//            if(i.getId().equals("boss")){
//                TranslateTransition t = new TranslateTransition();
//                t.setNode(i);
//                t.setDuration(Duration.millis(1000));
//                t.setCycleCount(TranslateTransition.INDEFINITE);
//
//                t.setByY(-130);
//                t.setAutoReverse(true);
//                t.play();
//
//            }
            TranslateTransition t = new TranslateTransition();
            t.setNode(i);
            t.setDuration(Duration.millis(700));
            t.setCycleCount(TranslateTransition.INDEFINITE);

            t.setByY(-90);
            t.setAutoReverse(true);
            t.play();
        }
    }
    public void collide(){}

    public int getHealth() { return health;    }
    public double[] getSize() { return size;    }
    public int getReward() { return reward;    }

    public void setHealth(int health) { this.health = health;    }
    public void setSize(double[] size) { this.size = size;    }
    public void killPlayer(){}

}
