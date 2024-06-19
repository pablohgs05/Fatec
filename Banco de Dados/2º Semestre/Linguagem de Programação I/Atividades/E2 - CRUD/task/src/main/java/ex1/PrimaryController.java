package ex1;

import java.util.Optional;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
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
    private TableView<Cadeira> tableCadeiras;

    @FXML
    private TableColumn<Cadeira, String> columnMarca;

    @FXML
    private TableColumn<Cadeira, String> columnCor;

    @FXML
    private TableColumn<Cadeira, String> columnMaterial;

    private Cadeirabd cadeiraBD = new Cadeirabd();

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
        cadeiraBD.criar(cadeira);
        carregarCadeiras();
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

    @FXML
    private void initialize() {
        columnMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        columnCor.setCellValueFactory(new PropertyValueFactory<>("cor"));
        columnMaterial.setCellValueFactory(new PropertyValueFactory<>("material"));

        //Configura a tabela
        tableCadeiras.setItems(listaDeCadeiras);
        carregarCadeiras();
    }

    private void carregarCadeiras() {
        listaDeCadeiras.clear();
        listaDeCadeiras.addAll(cadeiraBD.readAll());
    }

    @FXML
    void editCadeira(ActionEvent event) {
        Cadeira selectedCadeira = tableCadeiras.getSelectionModel().getSelectedItem();
        if (selectedCadeira != null) {
            //mostrando caixinha para editar cadeira
            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.setTitle("Editar Cadeira");
            dialog.setHeaderText("Modifique os detalhes da cadeira selecionada:");

            //instanciando entradas de texto
            DialogPane dialogPane = dialog.getDialogPane();
            TextField marcaField = new TextField(selectedCadeira.getMarca());
            TextField corField = new TextField(selectedCadeira.getCor());
            TextField materialField = new TextField(selectedCadeira.getMaterial());
            dialogPane.getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

            //criando grid para organizar as entradas de texto
            GridPane grid = new GridPane();
            grid.setHgap(10);
            grid.setVgap(10);
            grid.add(new Label("Marca:"), 0, 0);
            grid.add(marcaField, 1, 0);
            grid.add(new Label("Cor:"), 0, 1);
            grid.add(corField, 1, 1);
            grid.add(new Label("Material:"), 0, 2);
            grid.add(materialField, 1, 2);
            dialogPane.setContent(grid);

            //mostrando a caixinha e atualizando a cadeira
            Optional<ButtonType> result = dialog.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                try {
                    selectedCadeira.setMarca(marcaField.getText());
                    selectedCadeira.setCor(corField.getText());
                    selectedCadeira.setMaterial(materialField.getText());

                    cadeiraBD.atualizar(selectedCadeira);
                    tableCadeiras.refresh(); //atualiza a tabela
                    carregarCadeiras();  //atualiza a lista no banco
                } catch (Exception e) {
                    //exception caso ocorra erro ao atualizar
                    e.printStackTrace(); 
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Erro ao atualizar");
                    alert.setHeaderText(null);
                    alert.setContentText("Ocorreu um erro ao atualizar a cadeira.");
                    alert.showAndWait();
                }
            } 
        } else {
            //por fim, caso não tenha nenhuma cadeira selecionada:
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Nenhuma seleção");
            alert.setHeaderText(null); 
            alert.setContentText("Por favor, selecione uma cadeira na tabela.");
            alert.showAndWait();
        }
    }

    @FXML
    void updateCadeira(ActionEvent event) {
        Cadeira selectedCadeira = tableCadeiras.getSelectionModel().getSelectedItem();
        if (selectedCadeira != null) {
            selectedCadeira.setMarca(txtMarcaCadeira.getText());
            selectedCadeira.setCor(txtCorCadeira.getText());
            selectedCadeira.setMaterial(txtMaterialCadeira.getText());

            cadeiraBD.atualizar(selectedCadeira);
            tableCadeiras.refresh();
            carregarCadeiras();
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Nenhuma seleção");
            alert.setHeaderText("Nenhuma cadeira selecionada");
            alert.setContentText("Por favor, selecione uma cadeira na tabela.");
            alert.showAndWait();
        }
    }

    @FXML
    void deleteCadeira(ActionEvent event) {
        Cadeira selectedCadeira = tableCadeiras.getSelectionModel().getSelectedItem();
        if (selectedCadeira != null) {
            listaDeCadeiras.remove(selectedCadeira);
            cadeiraBD.deletar(selectedCadeira);
            carregarCadeiras();
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Nenhuma seleção");
            alert.setHeaderText("Nenhuma cadeira selecionada");
            alert.setContentText("Por favor, selecione uma cadeira na tabela.");
            alert.showAndWait();
        }
    }
}
