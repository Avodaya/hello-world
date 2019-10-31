package sample;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.chart.LineChart;
        import javafx.scene.chart.NumberAxis;
        import javafx.scene.chart.XYChart;
        import javafx.scene.control.Button;
        import javafx.collections.FXCollections;

public class Controller {

    @FXML
    private LineChart<Number, Number> chart;

    @FXML
    private Button btn;

    XYChart.Series series = new XYChart.Series();

    @FXML
    private void initialize() {
        NumberAxis xAxis=new NumberAxis();
        xAxis.setLabel("x");
        NumberAxis yAxis =new NumberAxis();
        yAxis.setLabel("y");

        chart=new LineChart<>(xAxis,yAxis);

        series.setName("Random Chart");

    }
    @FXML
    void click(ActionEvent event) {
        if (chart.getData() == null) {
            chart.setData(FXCollections.<XYChart.Series<String, Number>>observableArrayList());
        }
        if (chart.getData().isEmpty()) {
            chart.getData().add(new XYChart.Series<String, Number>());
        }

        int sIndex = (int) (Math.random() * chart.getData().size());
        XYChart.Series<Number, Number> series = chart.getData().get(sIndex);

        if (chart.getData().isEmpty()) {
            series.getData().add(new XYChart.Data<Number, Number>(1970, 15));
            series.getData().add(new XYChart.Data<Number, Number>(1980, 30));
            series.getData().add(new XYChart.Data<Number, Number>(1990, 60));
            series.getData().add(new XYChart.Data<Number, Number>(2000, 120));
            series.getData().add(new XYChart.Data<Number, Number>(2013, 240));
            series.getData().add(new XYChart.Data<Number, Number>(2014, 300));
        }

        chart.getData().add(series);
    }
}

