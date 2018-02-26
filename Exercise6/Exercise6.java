/*
My name is Bibata Rabba and this is my own work
*/
package exercise6;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Exercise6 extends Application {
	
    /**
     *
     * @param primaryStage
     */
    @Override
	public void start(Stage primaryStage) {
		VBox root = new VBox();
		root.setMaxWidth(400);
		root.setMaxHeight(400);
		
		for (int i = 0; i < 8; i++) {
			HBox row = new HBox();
			for (int j = 0; j < 4; j++) {
				if (i % 2 == 0) {
					row.getChildren().add(new Rectangle(50, 50, Color.BLACK));
					row.getChildren().add(new Rectangle(50, 50, Color.WHITE));
				} else {
					row.getChildren().add(new Rectangle(50, 50, Color.WHITE));
					row.getChildren().add(new Rectangle(50, 50, Color.BLACK));
				}
			}
			root.getChildren().add(row);
		}
		
		
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise 14.6");
                primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}