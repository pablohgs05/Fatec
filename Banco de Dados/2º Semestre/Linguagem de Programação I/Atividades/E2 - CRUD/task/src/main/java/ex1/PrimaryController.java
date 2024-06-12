package ex1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimaryController {

    private ObservableList<String> listaDeComputadores = FXCollections.observableArrayList();
    private ObservableList<Cadeira> listaDeCadeiras = FXCollections.observableArrayList();
    private ObservableList<Carro> listaDeCarros = FXCollections.observableArrayList();

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
    void handleComputador() {
        String ram = ramField.getText();
        String processador = processadorField.getText();
        String placaDeVideo = placaDeVideoField.getText();

        listaDeComputadores.addAll(ram, processador, placaDeVideo);
    }

@FXML
void showComputadores() {
    Stage stage = new Stage();
    stage.setTitle("Computadores");

    VBox vbox = new VBox();
    vbox.setSpacing(10);
    vbox.setPadding(new Insets(10, 10, 10, 10));

    for (int i = 0; i < listaDeComputadores.size(); i += 3) {
        String ram = listaDeComputadores.get(i);
        String processador = listaDeComputadores.get(i + 1);
        String placaDeVideo = listaDeComputadores.get(i + 2);

        Label ramLabel = new Label("RAM: " + ram);
        Label processadorLabel = new Label("Processador: " + processador);
        Label placaDeVideoLabel = new Label("Placa de vídeo: " + placaDeVideo);

        vbox.getChildren().addAll(ramLabel, processadorLabel, placaDeVideoLabel);
    }

    ScrollPane scrollPane = new ScrollPane();
    scrollPane.setContent(vbox);

    Scene scene = new Scene(scrollPane, 400, 300);
    stage.setScene(scene);
    stage.show();
}


    @FXML
    void handleCadeira(ActionEvent event) {
        String marca = txtMarcaCadeira.getText();
        String cor = txtCorCadeira.getText();
        String material = txtMaterialCadeira.getText();

        Cadeira cadeira = new Cadeira(marca, cor, material);
        listaDeCadeiras.add(cadeira);
        Cadeirabd banana = new Cadeirabd();
        banana.criar(cadeira); 
    }

    @FXML
    void showCadeiras(ActionEvent event) {
        Stage stage = new Stage();
        stage.setTitle("Cadeiras");
    
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));
    
        for (Cadeira cadeira : listaDeCadeiras) {
            Label marcaLabel = new Label("Marca: " + cadeira.getMarca());
            Label corLabel = new Label("Cor: " + cadeira.getCor());
            Label materialLabel = new Label("Material: " + cadeira.getMaterial());
    
            vbox.getChildren().addAll(marcaLabel, corLabel, materialLabel);
        }
    
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vbox);
    
        Scene scene = new Scene(scrollPane, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void handleCarro(ActionEvent event) {
        String cor = txtCorCarro.getText();
        int ano = Integer.parseInt(txtAnoCarro.getText());
        String marca = txtMarcaCarro.getText();

        Carro carro = new Carro(cor, ano, marca);
        listaDeCarros.add(carro);
    }

    @FXML
    void showCarros(ActionEvent event) {
        Stage stage = new Stage();
        stage.setTitle("Carros");
    
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));
    
        for (Carro carro : listaDeCarros) {
            Label marcaLabel = new Label("Marca: " + carro.getMarca());
            Label corLabel = new Label("Cor: " + carro.getCor());
            Label anoLabel = new Label("Ano: " + carro.getAno());
    
            vbox.getChildren().addAll(marcaLabel, corLabel, anoLabel);
        }
    
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vbox);
    
        Scene scene = new Scene(scrollPane, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}
