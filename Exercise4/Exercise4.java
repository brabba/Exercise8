/*
 My name is Bibata Rabba and this is my own work
*/
package exercise4;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Exercise4 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setStyle("-fx-background-color: white");
		
		Label java1 = new Label("Java");
		Label java2 = new Label("Java");
		Label java3 = new Label("Java");
		Label java4 = new Label("Java");
		Label java5 = new Label("Java");
		java1.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		java1.setTextFill(Paint.valueOf("#3492B3"));
		java1.setOpacity(0.4);
		java2.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		java2.setTextFill(Paint.valueOf("#55AB77"));
		java2.setOpacity(0.8);
		java3.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		java3.setTextFill(Paint.valueOf("#2C9E0F"));
		java3.setOpacity(1.0);
		java4.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		java4.setTextFill(Paint.valueOf("#658244"));
		java4.setOpacity(0.3);
		java5.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		java5.setTextFill(Paint.valueOf("#1D78A9"));
		java5.setOpacity(0.5);
                root.getChildren().addAll(java1, java2, java3, java4, java5);
		root.setRotate(90);
		
		Scene scene = new Scene(root, 130, 110);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise 14.4");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}