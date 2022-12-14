package javagui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //remove code from here 
	Button btn = new Button();
        btn.setText("Say 'OOP'");
        btn.setLayoutX(0);
        btn.setLayoutY(100);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello Object Oriented!");                
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Ina");
        btn2.setLayoutX(500);
        btn2.setLayoutY(400);
        
        
//        
        Group root = new Group();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
//        TilePane root = new TilePane();
        HBox root2 = new HBox();
        for(int i=0;i<5;i++){
            Button b = new Button(" tombol " + i);
            root2.getChildren().add(b);
        }
        root2.setLayoutX(0);
        root2.setLayoutY(400);
        root.getChildren().add(root2);
        
        Scene scene = new Scene(root, 640, 480);
        
        primaryStage.setTitle("Hello OOP!");
        primaryStage.setScene(scene);
        primaryStage.show();
	//to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}
