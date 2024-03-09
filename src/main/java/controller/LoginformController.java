package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginformController {
    @FXML
    private AnchorPane SubAnchorPane;
    public void initialize() throws IOException {
        InitializeDashBoard();
    }

    public void InitializeDashBoard() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/initializeform.fxml"));
        this.SubAnchorPane.getChildren().clear();
        this.SubAnchorPane.getChildren().add(node);
    }
}
