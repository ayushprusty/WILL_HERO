package com.example.switchscene;

import javafx.animation.TranslateTransition;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ScreenController implements  Initializable{
    private Scene scene;
    private Stage stage;
    private Stage stage1;
    private Parent root;
    @FXML
    private AnchorPane scenePane;



    @FXML
    private ImageView heroImg;
    @FXML
    private Button sett;
    @FXML
    private ImageView orc;
    @FXML
    private ImageView fisl;
    @FXML
    private ImageView fisl1;
    private double x;
    private double y;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        //up down
        TranslateTransition tr = new TranslateTransition();
        tr.setNode(heroImg);
        tr.setDuration(Duration.millis(700));
        tr.setCycleCount(TranslateTransition.INDEFINITE);
        tr.setByY(-75);
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
        TranslateTransition tra1 = new TranslateTransition();
        tra1.setNode(fisl);
        tra1.setDuration(Duration.millis(975));
        tra1.setCycleCount(TranslateTransition.INDEFINITE);
        tra1.setByY(-15);
        tra1.setAutoReverse(true);
////        tra1.setNode(fisl);
////        tra1.setDuration(Duration.millis(5000));
////        tra1.setCycleCount(TranslateTransition.INDEFINITE);
//        tra1.setByY(+50);
//        tra1.setAutoReverse(true);
        tra1.play();
        TranslateTransition tra2 = new TranslateTransition();
        tra2.setNode(fisl1);
        tra2.setDuration(Duration.millis(975));
        tra2.setCycleCount(TranslateTransition.INDEFINITE);
        tra2.setByY(-12);
        tra2.setAutoReverse(true);
        tra2.play();



    }





//    public void left(javafx.event.ActionEvent actionEvent) {
//        heroImg.setCenterX(x-=10);
//    }
//
//    public void down(javafx.event.ActionEvent actionEvent) {
//        heroImg.setCenterY(y+=10);
//    }
//
//    public void right(javafx.event.ActionEvent actionEvent) {
//        heroImg.setCenterX(x+=10);
//    }



    public void HOMESCREEN(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Scene1.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();

    }
    public void ENTERGAME(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("SceneGame.fxml"))));
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

    public void SCOREBOARD(ActionEvent event) throws IOException{
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Scene2.fxml"))));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene((scene));
//        stage.show();


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





}
