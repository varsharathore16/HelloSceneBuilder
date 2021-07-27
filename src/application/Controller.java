package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    // the following section is for the event handling section

    @FXML

    private Circle myCircle;
    private double x;
    private double y;

    public void up(ActionEvent e) {
        System.out.println("UP");
        myCircle.setCenterY(y-=10);
    }

    public void down(ActionEvent e) {
        System.out.println("DOWN");
        myCircle.setCenterY(y+=10);
    }

    public void left(ActionEvent e) {
        System.out.println("LEFT");
        myCircle.setCenterX(x-=10);
    }

    public void right(ActionEvent e) {
        System.out.println("RIGHT");
        myCircle.setCenterX(x+=10);
    }

    // the following section adds onto this project
    // but it is for the switching scenes demo

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMainScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSecondScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("second.fxml"));
        // can omit the "Parent" here and in above code - will work fine
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
