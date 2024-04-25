package ex1;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimaryController {

    private ObservableList<String> listaDeComputadores = FXCollections.observableArrayList();

    @FXML
    private TextField ramField;

    @FXML
    private TextField processadorField;

    @FXML
    private TextField placaDeVideoField;

    @FXML
    private TextField txtAnoCarro;

    @FXML
    private TextField txtCorCadeira;

    @FXML
    private TextField txtCorCarro;

    @FXML
    private TextField txtMarcaCadeira;

    @FXML
    private TextField txtMarcaCarro;

    @FXML
    private TextField txtMaterialCadeira;


    @FXML
    void handleComputador(){
        String ram = ramField.getText();
        String processador = processadorField.getText();
        String placaDeVideo = placaDeVideoField.getText();

        listaDeComputadores.addAll(ram, processador, placaDeVideo);
    }

    public void showComputadores() {
        Stage stage = new Stage();
        stage.setTitle("Computadores");

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        for (int i = 0; i < listaDeComputadores.size(); i += 3) {
            String ram = listaDeComputadores.get(i);
            String processador = listaDeComputadores.get(i + 1);
            String placaDeVideo = listaDeComputadores.get(i + 2);

            Label label = new Label("RAM: " + ram + ", Processador: " + processador + ", Placa de vídeo: " + placaDeVideo);
            vbox.getChildren().add(label);
        }

        Scene scene = new Scene(vbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void handleCadeira(ActionEvent event) {

    }
    @FXML
    void showCadeiras(ActionEvent event) {

    }
    @FXML
    void handleCarro(ActionEvent event) {

    }
    @FXML
    void showCarros(ActionEvent event) {

    }
}