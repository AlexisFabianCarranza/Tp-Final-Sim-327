/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim327;

import Clases.GestorSimulacion;
import Clases.VectorEstadoView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author aleex
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<VectorEstadoView> tableVectorEstado;
    @FXML
    private TableColumn<?, ?> relojColumn;
    @FXML
    private TableColumn<?, ?> rndLlegadaColumn;
    @FXML
    private TableColumn<?, ?> tiempoLlegadaColumn;
    @FXML
    private TableColumn<?, ?> proximaLlegadaColumn;
    @FXML
    private TableColumn<?, ?> rndLlegadaColumn1;
    @FXML
    private TableColumn<?, ?> rndParColumn;
    @FXML
    private TableColumn<?, ?> tmpParqColumn;
    @FXML
    private TableColumn<?, ?> tiempoLlegadaColumn11;
    @FXML
    private TableColumn<?, ?> rndOcupColumn;
    @FXML
    private TableColumn<?, ?> rndLlegadaColumn111;
    @FXML
    private TableColumn<?, ?> tmpOcup1Column;
    @FXML
    private TableColumn<?, ?> rndLlegadaColumn1111;
    @FXML
    private TableColumn<?, ?> tmpOcup2Column;
    @FXML
    private TableColumn<?, ?> rndLlegadaColumn11112;
    @FXML
    private TableColumn<?, ?> tmpOcup3Column;
    @FXML
    private TableColumn<?, ?> rndMonedaColumn;
    @FXML
    private TableColumn<?, ?> colocaMonedaColumn;
    @FXML
    private TableColumn<?, ?> est1Column;
    @FXML
    private TableColumn<?, ?> finOcup1Column;
    @FXML
    private TableColumn<?, ?> finParq1Column;
    @FXML
    private TableColumn<?, ?> est2Column;
    @FXML
    private TableColumn<?, ?> finOcup2Column;
    @FXML
    private TableColumn<?, ?> finParq2Column;
    @FXML
    private TableColumn<?, ?> est3Column;
    @FXML
    private TableColumn<?, ?> finOcup3Column;
    @FXML
    private TableColumn<?, ?> finParq3Column;
    @FXML
    private TableColumn<?, ?> est4Column;
    @FXML
    private TableColumn<?, ?> finOcup4Column;
    @FXML
    private TableColumn<?, ?> finParq4Column;
    @FXML
    private TableColumn<?, ?> est5Column;
    @FXML
    private TableColumn<?, ?> finOcup5Column;
    @FXML
    private TableColumn<?, ?> finParq5Column;
    @FXML
    private TableColumn<?, ?> est6Column;
    @FXML
    private TableColumn<?, ?> finOcup6Column;
    @FXML
    private TableColumn<?, ?> finParq6Column;
    @FXML
    private TableColumn<?, ?> est7Column;
    @FXML
    private TableColumn<?, ?> finOcup7Column;
    @FXML
    private TableColumn<?, ?> finParq7Column;
    @FXML
    private TableColumn<?, ?> est8Column;
    @FXML
    private TableColumn<?, ?> finOcup8Column;
    @FXML
    private TableColumn<?, ?> finParq8Column;
    @FXML
    private TableColumn<?, ?> est9Column;
    @FXML
    private TableColumn<?, ?> finOcup9Column;
    @FXML
    private TableColumn<?, ?> finParq9Column;
    @FXML
    private TableColumn<?, ?> est10Column;
    @FXML
    private TableColumn<?, ?> finOcup10Column;
    @FXML
    private TableColumn<?, ?> finParq10Column;
    @FXML
    private TableColumn<?, ?> est11Column;
    @FXML
    private TableColumn<?, ?> finOcup11Column;
    @FXML
    private TableColumn<?, ?> finParq11Column;
    @FXML
    private TableColumn<?, ?> est12Column;
    @FXML
    private TableColumn<?, ?> finOcup12Column;
    @FXML
    private TableColumn<?, ?> finParq12Column;
    @FXML
    private TableColumn<?, ?> contSLugarColumn;
    @FXML
    private TableColumn<?, ?> contVehiculosColumn;
    @FXML
    private TableColumn<?, ?> contInfraColumn;
    @FXML
    private TableColumn<?, ?> contInfraColumn1;
    @FXML
    private TextField txtHorasSimulacion;
    @FXML
    private Button btnSimular;
    @FXML
    private TextField txtHoraDesde;
    @FXML
    private TextField txtHoraHasta;
    
    private double horasSimulacion, horaHasta, horaDesde;
    private GestorSimulacion simulador;
    private ObservableList<VectorEstadoView> estados;
    @FXML
    private TextField txtCantVehiculosSinLugar;
    @FXML
    private TextField txtPorcentajeInfraccion;
    @FXML
    private TextField txtRecaudacion;
    @FXML
    private TextField txtCantidadVehiculos;
    @FXML
    private TextField txtPerdidaPorInfraccion;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.relojColumn.setCellValueFactory(new PropertyValueFactory("reloj"));
        //Llegada automovil
        this.rndLlegadaColumn.setCellValueFactory(new PropertyValueFactory("rndLlegadaAutomovil"));
        this.tiempoLlegadaColumn.setCellValueFactory(new PropertyValueFactory("tiempoLlegadaAutomovil"));
        this.proximaLlegadaColumn.setCellValueFactory(new PropertyValueFactory("proximaLlegada"));
        //Tiempo estacionamiento vehiculo
        this.rndParColumn.setCellValueFactory(new PropertyValueFactory("rndParq"));
        this.tmpParqColumn.setCellValueFactory(new PropertyValueFactory("tiempoParquimetro"));
        this.rndOcupColumn.setCellValueFactory(new PropertyValueFactory("rndOcup"));
        this.tmpOcup1Column.setCellValueFactory(new PropertyValueFactory("tiempoOcupacion1"));
        this.tmpOcup2Column.setCellValueFactory(new PropertyValueFactory("tiempoOcupacion2"));
        this.tmpOcup3Column.setCellValueFactory(new PropertyValueFactory("tiempoOcupacion3"));
        //Coloca monedas
        this.rndMonedaColumn.setCellValueFactory(new PropertyValueFactory("rndMonedas"));
        this.colocaMonedaColumn.setCellValueFactory(new PropertyValueFactory("colocaMonedas"));
        //Estacionamientos
        this.est1Column.setCellValueFactory(new PropertyValueFactory("est1"));
        this.finOcup1Column.setCellValueFactory(new PropertyValueFactory("finOcupacion1"));
        this.finParq1Column.setCellValueFactory(new PropertyValueFactory("finParquimetro1"));
        this.est2Column.setCellValueFactory(new PropertyValueFactory("est2"));
        this.finOcup2Column.setCellValueFactory(new PropertyValueFactory("finOcupacion2"));
        this.finParq2Column.setCellValueFactory(new PropertyValueFactory("finParquimetro2"));
        this.est3Column.setCellValueFactory(new PropertyValueFactory("est3"));
        this.finOcup3Column.setCellValueFactory(new PropertyValueFactory("finOcupacion3"));
        this.finParq3Column.setCellValueFactory(new PropertyValueFactory("finParquimetro3"));
        this.est4Column.setCellValueFactory(new PropertyValueFactory("est4"));
        this.finOcup4Column.setCellValueFactory(new PropertyValueFactory("finOcupacion4"));
        this.finParq4Column.setCellValueFactory(new PropertyValueFactory("finParquimetro4"));
        this.est5Column.setCellValueFactory(new PropertyValueFactory("est5"));
        this.finOcup5Column.setCellValueFactory(new PropertyValueFactory("finOcupacion5"));
        this.finParq5Column.setCellValueFactory(new PropertyValueFactory("finParquimetro5"));
        this.est6Column.setCellValueFactory(new PropertyValueFactory("est6"));
        this.finOcup6Column.setCellValueFactory(new PropertyValueFactory("finOcupacion6"));
        this.finParq6Column.setCellValueFactory(new PropertyValueFactory("finParquimetro6"));
        this.est7Column.setCellValueFactory(new PropertyValueFactory("est7"));
        this.finOcup7Column.setCellValueFactory(new PropertyValueFactory("finOcupacion7"));
        this.finParq7Column.setCellValueFactory(new PropertyValueFactory("finParquimetro7"));
        this.est8Column.setCellValueFactory(new PropertyValueFactory("est8"));
        this.finOcup8Column.setCellValueFactory(new PropertyValueFactory("finOcupacion8"));
        this.finParq8Column.setCellValueFactory(new PropertyValueFactory("finParquimetro8"));
        this.est9Column.setCellValueFactory(new PropertyValueFactory("est9"));
        this.finOcup9Column.setCellValueFactory(new PropertyValueFactory("finOcupacion9"));
        this.finParq9Column.setCellValueFactory(new PropertyValueFactory("finParquimetro9"));
        this.est10Column.setCellValueFactory(new PropertyValueFactory("est10"));
        this.finOcup10Column.setCellValueFactory(new PropertyValueFactory("finOcupacion10"));
        this.finParq10Column.setCellValueFactory(new PropertyValueFactory("finParquimetro10"));
        this.est11Column.setCellValueFactory(new PropertyValueFactory("est11"));
        this.finOcup11Column.setCellValueFactory(new PropertyValueFactory("finOcupacion11"));
        this.finParq11Column.setCellValueFactory(new PropertyValueFactory("finParquimetro11"));
        this.est12Column.setCellValueFactory(new PropertyValueFactory("est12"));
        this.finOcup12Column.setCellValueFactory(new PropertyValueFactory("finOcupacion12"));
        this.finParq12Column.setCellValueFactory(new PropertyValueFactory("finParquimetro12"));
        //Variables
        this.contSLugarColumn.setCellValueFactory(new PropertyValueFactory("contVehiSinLugar"));
        this.contVehiculosColumn.setCellValueFactory(new PropertyValueFactory("contVehiculos"));
        this.contInfraColumn.setCellValueFactory(new PropertyValueFactory("contInfracciones"));
        this.contInfraColumn1.setCellValueFactory(new PropertyValueFactory("acumTiempoInfracciones"));
    }    

    @FXML
    private void clickBtnSimular(MouseEvent event) {
        if (validarDatos()) {
           simulador = new GestorSimulacion(this.horaDesde, this.horaHasta, this.horasSimulacion);
           this.estados = simulador.inicarSimulacion(); 
           tableVectorEstado.setItems(estados);
           this.txtCantidadVehiculos.setText(String.valueOf(simulador.getContadorVehiculos()));
           this.txtCantVehiculosSinLugar.setText(String.valueOf(simulador.getContadorVehiculosSinLugar()));
           this.txtPorcentajeInfraccion.setText(String.format("%.0f", simulador.getPorcentajeInfraccion()) + " %");
           this.txtRecaudacion.setText(String.valueOf(simulador.getRecaudacion()));
           this.txtPerdidaPorInfraccion.setText(String.valueOf(simulador.getPerdidaPorInfraccion()));
           Alert dialog = new Alert(Alert.AlertType.INFORMATION);
           dialog.setTitle("Éxito");
           dialog.setHeaderText("Simulacion");
           dialog.showAndWait();
        }
    }
    private boolean validarDatos(){
        Alert dialog = new Alert(Alert.AlertType.INFORMATION);
        dialog.setTitle("ERROR");
        try{
            horasSimulacion = Double.parseDouble(txtHorasSimulacion.textProperty().get());
            horaDesde = Double.parseDouble(txtHoraDesde.textProperty().get());
            horaHasta = Double.parseDouble(txtHoraHasta.textProperty().get());
        }
        catch (NumberFormatException e){
            dialog.setHeaderText("Debe cargar números");
            dialog.showAndWait();
            return false;
        }
        
        if (horasSimulacion < 0 || horaDesde < 0 || horaHasta < 0) {
            dialog.setHeaderText("Los números deben ser superiores a 0");
            dialog.showAndWait();
            return false;
        }
        
        if (horaDesde >= horaHasta) {
            dialog.setHeaderText("Intervalo invalido");
            dialog.showAndWait();
            return false;
        }
        return true;
    }
}