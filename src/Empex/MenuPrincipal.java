
package Empex;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MenuPrincipal extends Application {

    private static Stage stage = new Stage();// é uma janela1
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/TelasPrincipal/MenuPrincipal.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        MenuPrincipal.stage = stage;
    }
}
