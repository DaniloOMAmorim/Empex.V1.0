package Empex;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Login extends Application {

    private static Stage stage = new Stage();// é uma janela1
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root  = FXMLLoader.load(getClass().getResource("/TelasPrincipal/Login.fxml"));// carrega o FXML
        Scene scene = new Scene(root);//coloca o FXML em uma sena 
        stage.setScene(scene);//coloca a sena em uma janela2
        stage.initStyle(StageStyle.UNDECORATED);//Tira a borda do windows
        stage.show();//exibe a janela
        setStage(stage);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Login.stage = stage;
    }
}
