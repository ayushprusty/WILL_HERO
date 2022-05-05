package com.example.switchscene;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
            //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
            Parent root = loader.load();
            NewController controller = loader.getController();
            Scene scene = new Scene(root);


            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent keyEvent) {
                    switch(keyEvent.getCode()){
                        case RIGHT:
                            controller.hello();
                            break;
                    }
                }
            });


            Image i = new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/iconpic.jpg");
            stage.getIcons().add(i);
            stage.setTitle("Will Hero Game");
            stage.setScene(scene);
            stage.show();


        }catch (Exception e){
            e.printStackTrace();

        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
