package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLoginformController {

    @FXML
    void btnSignInOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(this.getClass().getResource("/view/Mainform.fxml"));
        Scene scene=new Scene(parent);

        Stage primaryStage=new Stage();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Main Window");
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
}
