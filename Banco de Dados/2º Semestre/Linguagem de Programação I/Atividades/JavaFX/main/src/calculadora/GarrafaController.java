import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GarrafaController {
    @FXML
    private TextField volumeField;
    @FXML
    private TextField materialField;
    @FXML
    private TextField conteudoField;
    @FXML
    private Label volumeLitrosLabel;

    public void calcularVolumeEmLitros() {
        double volume = Double.parseDouble(volumeField.getText());
        Garrafa garrafa = new Garrafa(volume, materialField.getText(), conteudoField.getText());
        double volumeLitros = garrafa.calcularVolumeEmLitros();
        volumeLitrosLabel.setText("Volume em litros: " + volumeLitros);
    }
}