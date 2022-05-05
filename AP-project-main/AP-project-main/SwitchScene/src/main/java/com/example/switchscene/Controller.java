package com.example.switchscene;

import javafx.animation.TranslateTransition;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements  Initializable{
    private Scene scene;
    private Stage stage;
    private Stage stage1;
    private Parent root;
    static ArrayList<Node> imgview = new ArrayList<Node>();

    @FXML
    private AnchorPane scenePane;
    @FXML
    private AnchorPane scene1;




    @FXML
    private ImageView heroImg;
    @FXML
    private ImageView island;
    @FXML
    private ImageView isl4;
    @FXML
    private AnchorPane isl5;
    @FXML
    private ImageView islass;
    @FXML
    private  ImageView isl6;
    @FXML
    private ImageView isl7;
    @FXML
    private ImageView orc;




    @Override
    public void initialize(URL arg0, ResourceBundle arg1){

        //up down
        TranslateTransition tr = new TranslateTransition();
        tr.setNode(heroImg);
        tr.setDuration(Duration.millis(600));
        tr.setCycleCount(TranslateTransition.INDEFINITE);
        tr.setByY(-60);
        tr.setAutoReverse(true);
        tr.play();
        //up down 2
        TranslateTransition tra = new TranslateTransition();
        tra.setNode(orc);
        tra.setDuration(Duration.millis(500));
        tra.setCycleCount(TranslateTransition.INDEFINITE);
        tra.setByY(-50);
        tra.setAutoReverse(true);
        tra.play();
        //island float
//        TranslateTransition tra1 = new TranslateTransition();
//        tra1.setNode(fisl);
//        tra1.setDuration(Duration.millis(975));
//        tra1.setCycleCount(TranslateTransition.INDEFINITE);
//        tra1.setByY(-15);
//        tra1.setAutoReverse(true);
//////        tra1.setNode(fisl);
//////        tra1.setDuration(Duration.millis(5000));
//////        tra1.setCycleCount(TranslateTransition.INDEFINITE);
////        tra1.setByY(+50);
////        tra1.setAutoReverse(true);
//        tra1.play();
//        TranslateTransition tra2 = new TranslateTransition();
//        tra2.setNode(fisl1);
//        tra2.setDuration(Duration.millis(975));
//        tra2.setCycleCount(TranslateTransition.INDEFINITE);
//        tra2.setByY(-12);
//        tra2.setAutoReverse(true);
//        tra2.play();





    }





    public void HOMESCREEN(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Scene1.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();

    }
    public void ENTERGAME(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Saveve.fxml"));
        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
        Parent root = loader.load();
        Controller controller = loader.getController();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,500, 400);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.RIGHT) {
                    controller.hello();
                }
            }


        });
        for(Node child : scenePane.getChildren()){
            if(child instanceof ImageView){
                imgview.add(child);
//                System.out.println(((ImageView) child).getX());
//                System.out.println(((ImageView) child).getX());



            }

            System.out.println(child);
        }

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
    public void LOADGAME(ActionEvent event) throws IOException{
        heroImg.setX(heroImg.getX()+1);

    }
//    public void SCOREBOARD(ActionEvent event) throws IOException{
//        heroImg.setX(10);
//
//    }
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
        heroImg.setX(heroImg.getX()+30);
//        island.setX(island.getX()-30);
//        islass.setX(island.getX()-30);
//        isl4.setX(island.getX()-30);
        //imp
//        for(Node child : imgview){
//            if(child instanceof ImageView){
//                System.out.println(child.getId());
//                ((ImageView) child).setX(((ImageView) child).getX()-30);
//
//
//            }
//        }



    }







}
