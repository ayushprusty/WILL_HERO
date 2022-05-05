package com.example.switchscene;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class NewController implements Initializable {


    private Scene scene;
    private Stage stage;
    static ArrayList<ImageView> islandarr = new ArrayList<ImageView>();

    @FXML
    public AnchorPane GameScene;
    @FXML
    private  AnchorPane scenePane;
    @FXML
    private ImageView heroImg;

    @FXML
    public Label scoreLabel;
    @FXML
    public Label gameover;
    @FXML
    public Label coin;
    @FXML
    private ImageView coinicon;
    @FXML
    private ImageView island;

    @FXML
    private ImageView isl4;
    @FXML
    private ImageView isl5;

    @FXML
    private ImageView islass;
    @FXML
    private ImageView islass1;

    @FXML
    private  ImageView isl6;
    @FXML
    private  ImageView isl61;
    @FXML
    private ImageView isl611;
    @FXML
    private ImageView isl7;
    @FXML
    private ImageView isl8;
    @FXML
    private ImageView isl9;
    @FXML
    private ImageView isl10;
    @FXML
    private ImageView isl11;
    @FXML
    private ImageView isl12;
    @FXML
    private ImageView isl13;
    @FXML
    private ImageView islA;
    @FXML
    private ImageView islB;
    @FXML
    private ImageView islC;
    @FXML
    private ImageView islD;
    @FXML
    private ImageView orc;
    @FXML
    private ImageView orc1;
    @FXML
    private ImageView orc11;
    @FXML
    private ImageView orc111;
    @FXML
    private  ImageView boss;
    @FXML
    private ImageView chestClosed;
    @FXML
    private ImageView chestClosed1;
    @FXML
    private ImageView chestClosed2;
    @FXML
    private ImageView sword1;
    @FXML
    private ImageView hammer;
    @FXML
    private ImageView tnt;
    @FXML
    private ImageView tnt1;
    @FXML
    private ImageView tnt2;
    @FXML
    private ImageView c1;
    @FXML
    private ImageView c2;
    @FXML
    private ImageView c3;
    @FXML
    private ImageView c4;
    @FXML
    private ImageView c5;
    @FXML
    private ImageView c6;
    @FXML
    private ImageView c7;
    @FXML
    private ImageView c8;
    @FXML
    private ImageView c9;
    @FXML
    private ImageView c10;
    @FXML
    private ImageView c11;
    @FXML
    private ImageView c12;
    @FXML
    private ImageView c13;
    @FXML
    private ImageView c14;
    @FXML
    private ImageView c15;
    @FXML
    private ImageView c16;
    @FXML
    private ImageView c17;
    @FXML
    private ImageView c18;
    @FXML
    private ImageView c19;
    @FXML
    private ImageView c20;
    @FXML
    private ImageView c21;
    @FXML
    private ImageView c22;
    @FXML
    private ImageView c23;
    @FXML
    private ImageView c24;
    @FXML
    private ImageView c25;
    @FXML
    private ImageView coinchest;

    private static boolean canjump;
    private static boolean weaponStat=false;
    private static Point2D velocity = new Point2D(0,0);

    ArrayList<ImageView> chests = new ArrayList<ImageView>();
    static ArrayList<ImageView> weapons = new ArrayList<ImageView>();
    static ArrayList<AnchorPane> anch = new ArrayList<AnchorPane>();
    static ArrayList<ImageView> orcs1 = new ArrayList<ImageView>();
    static ArrayList<ImageView> orcs2 = new ArrayList<ImageView>();
    static ArrayList<ImageView> tnts = new ArrayList<ImageView>();
    static ArrayList<ImageView> coins = new ArrayList<ImageView>();

    static ArrayList<ImageView> heros = new ArrayList<ImageView>();
    static ArrayList<ImageView> bosses = new ArrayList<ImageView>();
    static ArrayList<Label> labels = new ArrayList<Label>();

    static ArrayList<Double> spacesleft= new ArrayList<Double>();
    static ArrayList<Double> spacesright= new ArrayList<Double>();

    int score=0;
    static Hero h;
    static int coincount =0;
    Timer t;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1){

        //up down
        TranslateTransition tr = new TranslateTransition();
        tr.setNode(heroImg);
        tr.setDuration(Duration.millis(600));
        tr.setCycleCount(TranslateTransition.INDEFINITE);

        tr.setByY(-70);
        tr.setAutoReverse(true);
        tr.play();
        //boss
        TranslateTransition trr = new TranslateTransition();
        trr.setNode(boss);
        trr.setDuration(Duration.millis(1200));
        trr.setCycleCount(TranslateTransition.INDEFINITE);

        trr.setByY(-170);
        trr.setAutoReverse(true);
        trr.play();
        //sword
        TranslateTransition tr2 = new TranslateTransition();
        tr2.setNode(sword1);
        tr2.setDuration(Duration.millis(600));
        tr2.setCycleCount(TranslateTransition.INDEFINITE);
        tr2.setByY(-60);
        tr2.setAutoReverse(true);
        tr2.play();
        //hammer
        TranslateTransition tr3 = new TranslateTransition();
        tr3.setNode(hammer);
        tr3.setDuration(Duration.millis(600));
        tr3.setCycleCount(TranslateTransition.INDEFINITE);
        tr3.setByY(-60);
        tr3.setAutoReverse(true);
        tr3.play();
        //up down 2
        TranslateTransition tra = new TranslateTransition();
        tra.setNode(orc);
        tra.setDuration(Duration.millis(500));
        tra.setCycleCount(TranslateTransition.INDEFINITE);
        tra.setByY(-50);
        tra.setAutoReverse(true);
        tra.play();
        //













    }
    public void addHero(){
        h= new Hero();
        h.setHero(heroImg);
        heros.add(heroImg);
    }
    public void addIsl(){
        islandarr.add(island);
        islandarr.add(islass);
        islandarr.add(isl8);
        islandarr.add(isl6);

        islandarr.add(isl7);


        islandarr.add(islass1);
        islandarr.add(isl5);

        islandarr.add(isl9);
        islandarr.add(isl10);
        islandarr.add(isl11);
        islandarr.add(isl611);
        islandarr.add(islA);
        islandarr.add(islB);
        islandarr.add(islC);
        islandarr.add(isl12);
        islandarr.add(isl13);












    }
    public void addWeapon(){
        weapons.add(sword1);
        weapons.add(hammer);
    }
    public void addChest(){
        chests.add(chestClosed);
        chests.add(chestClosed1);
        chests.add(chestClosed2);
    }
    public void addBoss(){
        bosses.add(boss);
    }

    public void addOrc(){
        orcs1.add(orc1);
        orcs1.add(orc);
        orcs1.add(orc11);
        orcs1.add(orc111);

        orcs2.add(orc1);
        orcs2.add(orc);
        orcs2.add(orc11);
        Orc c = new Orc();
        c.jump();

    }
    public void addTnt(){
        tnts.add(tnt);
        tnts.add(tnt1);
        tnts.add(tnt2);
//        System.out.println(tnts);
    }
    public void addPane(){
        anch.add(GameScene);
    }
    public void addLabel(){
        labels.add(gameover);
        labels.add(coin);
    }
    public void addCoin(){
        coins.add(c1);
        coins.add(c2);
        coins.add(c3);
        coins.add(c4);
        coins.add(c5);
        coins.add(c6);
        coins.add(c7);
        coins.add(c8);
        coins.add(c9);
        coins.add(c10);
        coins.add(c11);
        coins.add(c12);
        coins.add(c13);
        coins.add(c14);
        coins.add(c15);
        coins.add(c16);
        coins.add(c17);
        coins.add(c18);
        coins.add(c19);
        coins.add(c20);
        coins.add(c21);
        coins.add(c22);
        coins.add(c23);
        coins.add(c24);
        coins.add(c25);
        coins.add(coinicon);
    }






    public void HOMESCREEN(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Scene1.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();

    }


    public void LOGIN(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Login.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();

    }

    public void SETTINGS(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Settings.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();
//        Parent root1 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Settings.fxml")));
//        stage1 = new Stage();
//        Scene scene1 = new Scene(root1);
//        stage1.setScene(scene1);
//        stage1.show();

    }


//    public void Settings(ActionEvent event) throws IOException{
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Settings.fxml"))));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene((scene));
//        stage.show();
//
//    }
    public void Exit(ActionEvent event){
        Alert ar = new Alert(Alert.AlertType.CONFIRMATION);
        ar.setTitle("EXIT");
        ar.setContentText("Do you want to save before exiting?");
        ar.setHeaderText("You are about to logout");


        if(ar.showAndWait().get() == ButtonType.OK){
            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }
    public void Exit1(ActionEvent event){
//        Alert ar = new Alert(Alert.AlertType.CONFIRMATION);
//        ar.setTitle("EXIT");
//        ar.setContentText("Do you want to save before exiting?");
//        ar.setHeaderText("You are about to logout");


//        if(ar.showAndWait().get() == ButtonType.OK){
//            stage = (Stage) scenePane.getScene().getWindow();
//            System.out.println("You successfully logged out!");
//            stage.close();
//        }
        stage = (Stage) scenePane.getScene().getWindow();

        stage.close();
    }
    public void ResumeGame(ActionEvent event) throws IOException {
//        Exit1(event);
//        stage = (Stage) scenePane.getScene().getWindow();


        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("SceneGame.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();

    }
    public void ReturnHome(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Scene1.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();

    }


    public void hello(){



//        heroImg.setLayoutX((heroImg.getLayoutX()+50));
        TranslateTransition tr1 = new TranslateTransition();
        tr1.setNode(sword1);
        tr1.setDuration(Duration.millis(1000));
        RotateTransition rot = new RotateTransition();
        rot.setNode(sword1);
        rot.setCycleCount(1);
        rot.setInterpolator(Interpolator.LINEAR);
        rot.setByAngle(360);
        rot.setAxis(Rotate.Z_AXIS);
        rot.play();
        RotateTransition rot1 = new RotateTransition();
        rot1.setNode(hammer);
        rot1.setCycleCount(1);
        rot1.setInterpolator(Interpolator.LINEAR);
        rot1.setByAngle(360);
        rot1.setAxis(Rotate.Z_AXIS);
        rot1.play();
        sword1.setLayoutX((sword1.getLayoutX()+40));
        TranslateTransition tr2 = new TranslateTransition();
        tr2.setNode(hammer);
        tr2.setDuration(Duration.millis(1000));
        hammer.setLayoutX((hammer.getLayoutX()+40));
        for(Node c : GameScene.getChildren()){
            if(c instanceof ImageView){
                ((ImageView) c).setLayoutX(((ImageView) c).getLayoutX()-40);
            }

        }
        heroImg.setLayoutX((heroImg.getLayoutX()+40));
        coinicon.setLayoutX((coinicon.getLayoutX()+40));
//        gameover.setLayoutX((gameover.getLayoutX()+40));
        for(int i=0; i<spacesleft.size();i++){
            spacesleft.set(i, spacesleft.get(i)-40);
            spacesright.set(i, spacesright.get(i)-40);

        }
//        System.out.println(spacesright);
//        System.out.println(spacesleft);


        score++;
        scoreLabel.setText( Integer.toString(score) );

        openChest();

//










    }
//    public void Gameover(KeyEvent event) throws  IOException{
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("SceneGame.fxml"))));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene((scene));
//        stage.show();
//    }
    public void ENTERGAME(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Saveve.fxml"));
        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
        Parent root = loader.load();
        NewController controller = loader.getController();
        controller.sword1.setVisible(false);
        controller.hammer.setVisible(false);
        controller.gameover.setVisible(false);
//        sword1.setVisible(false);
        controller.addIsl();
        controller.addChest();
        controller.addOrc();
        controller.addTnt();
        controller.addWeapon();
        controller.addHero();
        controller.addSpaces();
        controller.addPane();
        controller.addLabel();
        controller.addCoin();
        controller.addBoss();
        canjump=true;
//        jump();
//        ImageView x = NewController.heros.get(0);
////        for(ImageView i: islandarr){
////            TranslateTransition t = new TranslateTransition();
////            t.setNode(x);
////
////            if(canjump){
////
////                t.setDuration(Duration.millis(900));
////                t.setByY(-40);
////                canjump=false;
////            }else{
////
////                t.setDuration(Duration.millis(900));
////                t.setByY(+40);
////                canjump=true;
////            }
////        }





//        System.out.println(islandarr);
//        KeyFrame k = new KeyFrame(Duration.millis(10), e ->{
//            hello();
//        });


        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,750, 400);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.RIGHT) {
                    controller.hello();
                }

            }


        });

        stage.setScene((scene));
        stage.show();
        MyTimer timer = new MyTimer();
        timer.start();




    }
    class MyTimer extends AnimationTimer{

        @Override
        public void handle(long l) {
//            System.out.println(NewController.heros.get(0).getLayoutX());
//            for(Node c : islandarr){
//                System.out.println(c.getLayoutX());
//            }
            NewController.coinGrab();
            NewController.collide();
            NewController.kill();
            NewController.explode();
            NewController.fall();
            if(!h.isAlive()){
                FadeTransition f = new FadeTransition();
                f.setNode(NewController.heros.get(0));
                f.setDuration(Duration.millis(600));


                f.setFromValue(10);
                f.setToValue(0);
                f.play();
                //NewController.anch.get(0).getChildren().remove(heros.get(0));
                stop();

            }





        }

    }
    public static void coinGrab(){
        for(ImageView i: coins){
            if(NewController.heros.get(0).getBoundsInParent().intersects(i.getBoundsInParent())){
                FadeTransition f = new FadeTransition();
                f.setNode(i);
                f.setDuration(Duration.millis(100));


                f.setFromValue(10);
                f.setToValue(0);
                f.play();
                NewController.anch.get(0).getChildren().remove(i);

                coincount++;
                System.out.println(coincount);
                NewController.labels.get(1).setText(Integer.toString(coincount));

            }
        }
    }
    public static void fall(){
//        System.out.println(NewController.islandarr.get(6).getBoundsInParent().getMaxX());
//        System.out.println(NewController.islandarr.get(7).getBoundsInParent().getMinX());
        if(NewController.islandarr.get(0).getBoundsInParent().getMaxX()==90&&NewController.islandarr.get(1).getBoundsInParent().getMinX()==142&&NewController.heros.get(0).getTranslateY()>=-3){
            for(ImageView z : weapons){
                z.setVisible(false);
            }
            TranslateTransition x = new TranslateTransition();
            x.setNode(NewController.heros.get(0));
            x.setDuration(Duration.millis(100));

            x.setByY(120);

            x.play();
            h.setHealth(0);
            //stop();
            NewController.labels.get(0).setVisible(true);
            TranslateTransition tr = new TranslateTransition();
            tr.setNode(NewController.labels.get(0));
            tr.setDuration(Duration.millis(1000));
            tr.setCycleCount(TranslateTransition.INDEFINITE);
            tr.setByY(-200);
            tr.setAutoReverse(true);

            tr.play();
        }
        if(NewController.islandarr.get(4).getBoundsInParent().getMaxX()==87.31939697265625&&NewController.islandarr.get(5).getBoundsInParent().getMinX()==160.0&&NewController.heros.get(0).getTranslateY()>=-3){
            for(ImageView z : weapons){
                z.setVisible(false);
            }
            TranslateTransition x = new TranslateTransition();
            x.setNode(NewController.heros.get(0));
            x.setDuration(Duration.millis(1000));

            x.setByY(120);

            x.play();
            h.setHealth(0);
            //stop();
            NewController.labels.get(0).setVisible(true);
            TranslateTransition tr = new TranslateTransition();
            tr.setNode(NewController.labels.get(0));
            tr.setDuration(Duration.millis(1000));
            tr.setCycleCount(TranslateTransition.INDEFINITE);
            tr.setByY(-200);
            tr.setAutoReverse(true);

            tr.play();

        }
        if(NewController.islandarr.get(5).getBoundsInParent().getMaxX()==94.15383911132812&&NewController.islandarr.get(6).getBoundsInParent().getMinX()==163.0&&NewController.heros.get(0).getTranslateY()>=-3){
            for(ImageView z : weapons){
                z.setVisible(false);
            }
            TranslateTransition x = new TranslateTransition();
            x.setNode(NewController.heros.get(0));
            x.setDuration(Duration.millis(100));

            x.setByY(120);

            x.play();
            h.setHealth(0);
            //stop();
            NewController.labels.get(0).setVisible(true);
            TranslateTransition tr = new TranslateTransition();
            tr.setNode(NewController.labels.get(0));
            tr.setDuration(Duration.millis(1000));
            tr.setCycleCount(TranslateTransition.INDEFINITE);
            tr.setByY(-200);
            tr.setAutoReverse(true);

            tr.play();

        }
        if(NewController.islandarr.get(6).getBoundsInParent().getMaxX()==60.823341369628906&&NewController.islandarr.get(7).getBoundsInParent().getMinX()==180.0&&NewController.heros.get(0).getTranslateY()>=-3){
            for(ImageView z : weapons){
                z.setVisible(false);
            }
            TranslateTransition x = new TranslateTransition();
            x.setNode(NewController.heros.get(0));
            x.setDuration(Duration.millis(100));

            x.setByY(120);

            x.play();
            h.setHealth(0);
            //stop();
            NewController.labels.get(0).setVisible(true);
            TranslateTransition tr = new TranslateTransition();
            tr.setNode(NewController.labels.get(0));
            tr.setDuration(Duration.millis(500));
            tr.setCycleCount(TranslateTransition.INDEFINITE);
            tr.setByY(-200);
            tr.setAutoReverse(true);

            tr.play();

        }
//        if(NewController.islandarr.get(2).getBoundsInParent().getMaxX()==143&&NewController.islandarr.get(3).getBoundsInParent().getMinX()==200){
//            TranslateTransition x = new TranslateTransition();
//            x.setNode(NewController.orcs1.get(0));
//            x.setDuration(Duration.millis(100));
//
//            x.setByY(120);
//
//            x.play();
//            orcs1.remove(orcs1.get(0));
//
//        }
    }

    public static void explode(){
        for(ImageView i : tnts){

            if(i.getBoundsInParent().intersects(NewController.heros.get(0).getBoundsInParent())){


                i.setImage(new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/bomb.gif"));

                h.setHealth(0);


                for(ImageView z : weapons){
                        z.setVisible(false);
                }
//                NewController.labels.get(0).setLayoutY(NewController.gameover.getLayoutY());
                NewController.labels.get(0).setVisible(true);
                TranslateTransition tr = new TranslateTransition();
                tr.setNode(NewController.labels.get(0));
                tr.setDuration(Duration.millis(2000));
                tr.setCycleCount(TranslateTransition.INDEFINITE);
                tr.setByY(-200);
                tr.setAutoReverse(true);
                tr.play();


                break;

            }
        }


    }



    public static void moveY(int mag){

        boolean goDown=mag >0;
        for(int i =0; i<Math.abs(mag); i++) {
            for(ImageView j: islandarr) {
                if (NewController.heros.get(0).getBoundsInParent().intersects(j.getBoundsInParent())) {
                    if (goDown) {

                        if(NewController.heros.get(0).getTranslateY()+46== j.getTranslateY()) {
                            System.out.println("yes123");
                            NewController.heros.get(0).setTranslateY(NewController.heros.get(0).getTranslateY() - 1);
                            System.out.println(NewController.heros.get(0).getTranslateY());
                            canjump = true;
                            return;
                        }else{
                            return;
                        }
                    }
                }
            }
            NewController.heros.get(0).setTranslateY(NewController.heros.get(0).getTranslateY()+(goDown?1:-1));
            System.out.println(NewController.heros.get(0).getTranslateY());

        }
    }
    public static void jump(){

        if(canjump){
            velocity = velocity.add(0,-30);
            canjump=false;


        }
    }
    public static void upDown(){
        if(NewController.heros.get(0).getTranslateY()>=5) {
            jump();
        }
        if(velocity.getY()<10){
            System.out.println("grav");
            velocity=velocity.add(0,1);
            System.out.println("vely"+" "+velocity.getY());
        }
        System.out.println("vely"+" "+velocity.getY());
        moveY((int)velocity.getY());
    }

    public void openChest() {

        Random r = new Random();
        int x = r.nextInt(2);
//        System.out.println(x);
        for (ImageView i : chests) {
            if (x == 0) {

                //sword
                if (i.getLayoutX() + i.getFitWidth() / 2 >= heroImg.getLayoutX() && i.getLayoutX() - i.getFitWidth() / 2 <= heroImg.getLayoutX()) {
                    //            chestClosed.setVisible(false);
                    i.setImage(new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/ChestOpen.png"));
                    heroImg.setImage(new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/DangWillHero.png"));
                    hammer.setVisible(false);
                    sword1.setVisible(true);
                    weaponStat=true;
                    break;

                }
            } else {
                if (i.getLayoutX() + i.getFitWidth() / 2 >= heroImg.getLayoutX() && i.getLayoutX() - i.getFitWidth() / 2 <= heroImg.getLayoutX()) {
                    //            chestClosed.setVisible(false);
                    i.setImage(new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/ChestOpen.png"));
                    heroImg.setImage(new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/DangWillHero.png"));
                    sword1.setVisible(false);
                    hammer.setVisible(true);
                    weaponStat=true;
                    break;


                }

            }
        }

    }
    public void checkGravity(ImageView heroImg){


//        System.out.println(spaces);


    }
    public void addSpaces(){
        for (ImageView imageView : islandarr) {

            //spaces.add((int)(islandarr.get(i).getLayoutX()+islandarr.get(i).getFitWidth()/2));
//            System.out.println((int)islandarr.get(i).getBoundsInParent().getMinY());
            spacesleft.add(imageView.getBoundsInParent().getMinX());
            spacesright.add(imageView.getBoundsInParent().getMaxX());
//            System.out.println(islandarr.get(i).getBoundsInParent().getMaxX());
//            System.out.println((int)(islandarr.get(i).getLayoutX()+islandarr.get(i).getFitWidth()/2));
//            spacesleft.add( (imageView.getLayoutX()));
//            spacesright.add((imageView.getLayoutX() + imageView.getFitWidth()));
//            System.out.println((int)(islandarr.get(i).getLayoutX()+islandarr.get(i).getFitWidth()/2));
//
//            System.out.println((int)(islandarr.get(i+1).getLayoutX()-islandarr.get(i+1).getFitWidth()/2));
        }
//        System.out.println(spacesleft);
//        System.out.println(spacesright);

    }
    public static void collide(){
        for(ImageView i : orcs1){

            if(i.getLayoutX()+i.getFitWidth() / 2 >=NewController.heros.get(0).getLayoutX()&&i.getLayoutX() - i.getFitWidth() / 2 <= NewController.heros.get(0).getLayoutX()){
//                System.out.println(i.getLayoutX()+" "+NewController.heros.get(0).getLayoutX());
                i.setLayoutX(i.getLayoutX()+75);
                i.setTranslateY(i.getTranslateY()+10);

            }
//            if(i.getBoundsInParent().intersects(NewController.heros.get(0).getBoundsInParent())){
//                i.setLayoutX(i.getLayoutX()+60);
//            }
        }

    }
    public static void kill(){
        for(ImageView i : orcs1){

            if(i.getBoundsInParent().intersects(NewController.weapons.get(0).getBoundsInParent())){
//                System.out.println("kill");
                if(weaponStat) {
                    FadeTransition f = new FadeTransition();
                    f.setNode(i);
                    f.setDuration(Duration.millis(1000));


                    f.setFromValue(10);
                    f.setToValue(0);
                    f.play();
                    NewController.anch.get(0).getChildren().remove(i);
//                    for(ImageView z : weapons){
//                        z.setVisible(false);
//                    }

                }

            }
        }
    }




}
