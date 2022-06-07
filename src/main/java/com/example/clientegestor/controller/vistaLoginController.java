package com.example.clientegestor.controller;

import com.example.clientegestor.model.dao.LoginClienteDAO;
import com.example.clientegestor.personalScene;
import com.example.clientegestor.utils.AlertasInf;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class vistaLoginController implements Initializable {


    @javafx.fxml.FXML
    private Button btnLogin;
    @javafx.fxml.FXML
    private MenuItem MIClose;
    @javafx.fxml.FXML
    private TextField tfIdUsuario;
    @javafx.fxml.FXML
    private Button btnSignIn;
    @javafx.fxml.FXML
    private TextField tfIDPassword;

    LoginClienteDAO loginClienteDAO = new LoginClienteDAO();
    personalScene ps;
    private static int UserID;



    public vistaLoginController() throws Exception {;
        UserID = getUserID();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @javafx.fxml.FXML
    public void onLogin(ActionEvent actionEvent) throws Exception {
        String User = tfIdUsuario.getText();
        String Pass = tfIDPassword.getText();
        setUserID(loginClienteDAO.findID(User));


        if (loginClienteDAO.find(User).equals(Pass)){
            ps = new personalScene("view/vistaCliente","Cliente");
            ps.start();
        }else {
            AlertasInf.alertaError("La contraseña no es correcta");
        }

    }

    @javafx.fxml.FXML
    public void onClose(ActionEvent actionEvent) {
        System.exit(0);
    }

    @javafx.fxml.FXML
    public void OnSignIn(ActionEvent actionEvent) throws Exception {
        ps = new personalScene("view/vistaSignIn","Sign In");
        ps.start();
    }

    public int getUserID() {
        return UserID;
    }
    public void setUserID(int userID) {
        UserID = userID;
    }
}
