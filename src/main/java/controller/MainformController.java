package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainformController {
    @FXML
    private AnchorPane NavigationBar;
    @FXML
    private AnchorPane DashBoardPane;
    @FXML
    private AnchorPane widgetsPane;
    public void initialize() throws IOException {
        InitializeNavigationBar();
        InitializeUserDashBoard();
        InitializeUserWidgets();
    }
    public void InitializeNavigationBar() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserNavigationBarform.fxml"));
        this.NavigationBar.getChildren().clear();
        this.NavigationBar.getChildren().add(node);
    }
    public void InitializeUserDashBoard() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserDashBoardform.fxml"));
        this.DashBoardPane.getChildren().clear();
        this.DashBoardPane.getChildren().add(node);
    }
    public void InitializeUserWidgets() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserWidgetsform.fxml"));
        this.widgetsPane.getChildren().clear();
        this.widgetsPane.getChildren().add(node);
    }

}
