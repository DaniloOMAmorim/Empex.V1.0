package Controle;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;


public class MenuController implements Initializable {

    
    @FXML
    PieChart chart;
    
     @FXML
    private BarChart<?, ?> barchat;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        XYChart.Series setl = new XYChart.Series<>();
        
        setl.getData().add(new XYChart.Data("Aprovado" , 153));
        setl.getData().add(new XYChart.Data("Reprovado" , 93));
        
        barchat.getData().addAll(setl);
        
        ObservableList<PieChart.Data> pieChartData =
            FXCollections.observableArrayList(
            new PieChart.Data("Incompletos", 60),
            new PieChart.Data("Para aprovação", 25),
            new PieChart.Data("Finalizados", 15));
        
        
        chart.setData(pieChartData);
    }    
    
}
