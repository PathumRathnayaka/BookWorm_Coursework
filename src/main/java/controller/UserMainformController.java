package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserMainformController {
    @FXML
    private AnchorPane root;
    @FXML
    private AnchorPane NavigationBar;
    @FXML
    private AnchorPane DashBoardPane;
    @FXML
    private AnchorPane widgetsPane;


    public void initialize() throws IOException {


    }



    public void UserNavigationBar() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserNavigationBarform.fxml"));
        this.NavigationBar.getChildren().clear();
        this.NavigationBar.getChildren().add(node);
    }
    public void UserDashBoard() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserDashBoardform.fxml"));
        this.DashBoardPane.getChildren().clear();
        this.DashBoardPane.getChildren().add(node);
    }
    public void UserWidgets() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserWidgetsform.fxml"));
        this.widgetsPane.getChildren().clear();
        this.widgetsPane.getChildren().add(node);
    }
    public void AdminNavigationBar() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminNavigationbarform.fxml"));
        this.NavigationBar.getChildren().clear();
        this.NavigationBar.getChildren().add(node);
    }
    public void Bookload() throws IOException {
        /*Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminBookformController.fxml"));
        this.DashBoardPane.getChildren().clear();
        this.DashBoardPane.getChildren().add(node);*/

        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/AdminBookformController.fxml"));
        Parent node = fxmlLoader.load();

        // Set the CSS stylesheet to the loaded scene
        Scene scene = new Scene(node);
        scene.getStylesheets().add(getClass().getResource("/css/TableView.css").toExternalForm());

        // Clear and add the loaded node to the DashBoardPane
        DashBoardPane.getChildren().clear();
        DashBoardPane.getChildren().add(node);
    }

    @FXML
    void btnLogOutOnAction(ActionEvent event) throws IOException {
        Parent parent=FXMLLoader.load(this.getClass().getResource("/view/MainLoginform.fxml"));
        Scene scene=new Scene(parent);
        Stage stage= (Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
    }



}
