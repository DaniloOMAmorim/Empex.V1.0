package Controle;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class ParticipantesController implements Initializable {

    @FXML private JFXTextField txtRaCadastro;
    @FXML private JFXTextField txtNomeCadastro;
    @FXML private JFXDatePicker txtDataNCadastro;
    @FXML private JFXTextField txtCelularCadastro;
    @FXML private JFXTextField txtEmailCadastro;
    @FXML private JFXTextField txtCursoCadastro;
    @FXML private ImageView imgParticipanteCadastro;
    @FXML private Tab TabelaAlterar;
    @FXML private ImageView imgParticipanteAlterar;
    @FXML private JFXTextField txtRaAlterar;
    @FXML private JFXTextField txtNomeAlterar;
    @FXML private JFXDatePicker txtDataNAlterar;
    @FXML private JFXTextField txtCelularAlterar;
    @FXML private JFXTextField txtEmailAlterar;
    @FXML private JFXTextField txtCursoAlterar;
    @FXML private ImageView imgParticipanteAlterar1;
    @FXML private JFXTextField txtRaAlterar1;
    @FXML private JFXTextField txtNomeAlterar1;
    @FXML private JFXDatePicker txtDataNAlterar1;
    @FXML private JFXTextField txtCelularAlterar1;
    @FXML private JFXTextField txtEmailAlterar1;
    @FXML private JFXTextField txtCursoAlterar1;
    
    @FXML private TableView tabela;
    @FXML private TableColumn ConsultarTabelaRa;
    @FXML private TableColumn ConsultarTabelaNome;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void SalvarCadastrar(ActionEvent event) {
        
    }

    @FXML
    private void SalvarAlterar(ActionEvent event) {
        
    }
    
}
