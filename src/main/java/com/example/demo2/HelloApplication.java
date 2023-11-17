package com.example.demo2;

import com.example.demo2.PizzaMenu.MenuApplication;
import com.example.demo2.Settings.SettingsPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import java.util.List;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

//        Group root = new Group();
//        Scene scene = new Scene(root, 500, 500, Color.rgb(245, 245, 245));
//
//        Image icon = new Image("pizza-box.png");
//        primaryStage.getIcons().add(icon);
//        primaryStage.setTitle("Whoa the effects!");
//
//        Text text  = new Text();
//        text.setText("WHOOOOA");
//        text.setX(50.0);
//        text.setY(50.0);
//        text.setFont(Font.font("Verdana", 50));
//        text.setFill(Color.gray(0.5));
//
//        root.getChildren().add(text);

//        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//        primaryStage.setTitle("Hello world");
//
//        primaryStage.getIcons().add(new Image("pizza-box.png"));
////        Must be at the end
//        primaryStage.setScene(new Scene(root));
//        primaryStage.show();

        SettingsPage settingsPage = new SettingsPage();
        MenuApplication menu = new MenuApplication();
        settingsPage.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}