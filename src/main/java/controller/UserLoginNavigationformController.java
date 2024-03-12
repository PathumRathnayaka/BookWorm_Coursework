package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class UserLoginNavigationformController {
    @FXML
    private AnchorPane SubAnchorPane;
    public void initialize() throws IOException {
        InitializeUserLogin();
    }

    public void InitializeUserLogin() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserLoginform.fxml"));
        this.SubAnchorPane.getChildren().clear();
        this.SubAnchorPane.getChildren().add(node);
    }

    @FXML
    void AdminClickOnAction(MouseEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminLoginform.fxml"));
        this.SubAnchorPane.getChildren().clear();
        this.SubAnchorPane.getChildren().add(node);
    }

    @FXML
    void UserClickOnAction(MouseEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserLoginform.fxml"));
        this.SubAnchorPane.getChildren().clear();
        this.SubAnchorPane.getChildren().add(node);
    }
}
