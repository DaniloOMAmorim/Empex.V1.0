package Controle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuPrincipalControle implements Initializable {

    @FXML
    private BorderPane painelbase;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       loadUI("/TelasSecundarias/Menu.fxml");
    }    
    
    @FXML
    void Menup(MouseEvent event) {
        loadUI("/TelasSecundarias/Menu.fxml");
    }

    @FXML
    void TelaParticipante(MouseEvent event) {
        loadUI("/TelasSecundarias/Participantes.fxml");
    }

    @FXML
    void TelaTrabalho(MouseEvent event) {
        loadUI("/TelasSecundarias/Trabalhos.fxml");
    }

    @FXML
    void TelaOrientador(MouseEvent event) {
        loadUI("/TelasSecundarias/Orientador.fxml");
    }

    @FXML
    void TelaExaminador(MouseEvent event) {
        loadUI("/TelasSecundarias/Examinador.fxml");
    }

    @FXML
    void TelaRelatorio(MouseEvent event) {
        loadUI("/TelasSecundarias/RelatorioEmpex.fxml");
    }
    
    private void loadUI(String ui){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(ui));
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       painelbase.setCenter(root);
        
    }

    @FXML
    private void close(MouseEvent event) {
        Stage stage = (Stage) painelbase.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void sair(MouseEvent event) {
        Stage stage = (Stage) painelbase.getScene().getWindow();
        stage.close();
    }
}
//
