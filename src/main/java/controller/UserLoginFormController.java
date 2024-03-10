package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class UserLoginFormController {

    @FXML
    private JFXButton btnAdmin;

    @FXML
    private JFXButton btnUser;
    private AnchorPane SubAnchorPane;

    @FXML
    void btnAdminOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminLoginform.fxml"));
        this.SubAnchorPane.getChildren().clear();
        this.SubAnchorPane.getChildren().add(node);

    }

    @FXML
    void btnUserOnAction(ActionEvent event) {

    }
}
