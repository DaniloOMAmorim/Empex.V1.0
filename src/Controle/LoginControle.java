package Controle;

import Empex.Login;
import Empex.MenuPrincipal;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class LoginControle implements Initializable {

    @FXML
    private JFXTextField TxtUser;
    @FXML
    private JFXPasswordField TxtSenha;
    @FXML
    private JFXButton btnentar;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
       btnentar.setOnKeyPressed((KeyEvent e) -> {
         if(e.getCode() == KeyCode.ENTER){
            logar();
         }
        });
              TxtSenha.setOnKeyPressed((KeyEvent e) -> {
         if(e.getCode() == KeyCode.ENTER){
            logar();
         }
        });
    }

    @FXML
    private void feixar(MouseEvent event) {
        sair();
    }
    
    @FXML
    private void entrar(ActionEvent event) {
        logar();
    }
   

    @FXML
    private void logar() {
        if(TxtUser.getText().equals("root") && TxtSenha.getText().equals("1234")){
           MenuPrincipal menu = new MenuPrincipal();
           try {
               menu.start(new Stage());
               sair();
           } catch (Exception ex) {
               Logger.getLogger(LoginControle.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }else{
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setHeaderText("Erro");
           alert.setTitle("Login inválido");
           alert.setContentText("USuário ou senha incrretos.");
           alert.show();
           
    }

    }

    private void sair() {
        Login.getStage().close();
    }
}