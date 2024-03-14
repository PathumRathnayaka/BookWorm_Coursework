package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdminBookformController {
    @FXML
    private TableColumn<?, ?> clmnAuthor;

    @FXML
    private TableColumn<?, ?> clmnBookId;

    @FXML
    private TableColumn<?, ?> clmnRemove;

    @FXML
    private TableColumn<?, ?> clmnStatus;

    @FXML
    private TableView<?> tblBookManage;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtBookID;

    @FXML
    private TextField txtRemove;

    @FXML
    private TextField txtStatus;

    @FXML
    void btnAddBookOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void txtAuthorOnAction(ActionEvent event) {

    }

    @FXML
    void txtBookIDOnAction(ActionEvent event) {

    }

    @FXML
    void txtRemoveOnAction(ActionEvent event) {

    }

    @FXML
    void txtStatusOnAction(ActionEvent event) {

    }
}
