package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainLoginformController {
    public AnchorPane root;
    @FXML
    private AnchorPane SubAnchorPane;

    public void initialize() throws IOException {
        InitializeLogin();
    }
    public void InitializeLogin() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/LoginNavigationform.fxml"));
        this.SubAnchorPane.getChildren().clear();
        this.SubAnchorPane.getChildren().add(node);
    }
    public void InitilizeUserLogin(){

    }

}

