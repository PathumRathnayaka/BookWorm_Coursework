package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;

public class BorrowBookformController {
    @FXML
    private TableColumn<?, ?> clmnBookID;

    @FXML
    private TableColumn<?, ?> clmnDate;

    @FXML
    private TableColumn<?, ?> clmnReturnDate;

    @FXML
    private TableColumn<?, ?> clmnTitle;

    @FXML
    private TableView<?> tblBorrowBook;

    @FXML
    private JFXTextField txtSearch;

    @FXML
    void imgKeyOnPress(KeyEvent event) {

    }

    @FXML
    void txtSearchOnAction(ActionEvent event) {

    }
}
