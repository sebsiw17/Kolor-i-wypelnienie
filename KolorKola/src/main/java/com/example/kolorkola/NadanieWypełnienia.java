package com.example.kolorkola;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NadanieWypełnienia extends Application{
    @Override
    public void start(Stage stage){
        Circle circle = new Circle();
        circle.setCenterX(300.0f);
        circle.setCenterY(180.0f);
        circle.setRadius(90.0f);
        Text text = new Text("Przykład pokolorowanego koła");
        text.setFont(Font.font("Edwardian Script ITC", 50));
        text.setX(155);
        text.setY(50);
        Stop[] stops = new Stop[]{
                new Stop(0.0, Color.WHITE),
                new Stop(0.3, Color.RED),
                new Stop(1.0, Color.DARKRED)
        };
        RadialGradient radialGradient =new RadialGradient(0, 0, 300,178, 60, false, CycleMethod.NO_CYCLE, stops);
        circle.setFill(radialGradient);
        text.setFill(radialGradient);
        Group root = new Group(circle, text);
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Wypełnienie");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}