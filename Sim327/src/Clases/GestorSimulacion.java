/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Eventos.ColocacionMoneda;
import Eventos.Evento;
import Eventos.FinOcupacion;
import Eventos.FinParquimetro;
import Eventos.LlegadaAutomovil;
import Eventos.TiempoEstacionamiento;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

/**
 *
 * @author aleex
 */
public class GestorSimulacion {
    private double reloj;
    private Estacionamiento est1;
    private Estacionamiento est2;
    private Estacionamiento est3;
    private Estacionamiento est4;
    private Estacionamiento est5;
    private Estacionamiento est6;
    private Estacionamiento est7;
    private Estacionamiento est8;
    private Estacionamiento est9;
    private Estacionamiento est10;
    private Estacionamiento est11;
    private Estacionamiento est12;
    private LlegadaAutomovil llegadaAutomovil;
    private ColocacionMoneda colocacionMoneda;
    private TiempoEstacionamiento tiempoEstacionamiento;
    private int contadorVehiculosSinLugar;
    private int contadorVehiculos;
    private int contadorInfraccion;
    private double acumTiempoInfracciones;

    private ArrayList<Evento> eventos;
    private ArrayList<Estacionamiento> estacionamientos;
    //Atributo para alamacenar los vectores estados que se van a mostrar en la tabla
    private ObservableList<VectorEstadoView> vectoresEstados;
    private VectorEstado vectorEstadoActual;
    //Atributos para saber desde y hasta que fila mostrar
    private double horaDesdeVER;
    private double horaHastaVER;
    //Atributo que se utiliza para cortar la simulacion en una hora determinada
    private double horaHasta;

    public GestorSimulacion(double horaDesde, double horaHasta, double horasSimulacion) {
        this.vectoresEstados = FXCollections.observableArrayList();;
        this.horaHasta = horaHasta;
        this.horaDesdeVER = horaDesde;
        this.horaHastaVER = horaHasta;
        this.reloj = 0.0;
        this.llegadaAutomovil = new LlegadaAutomovil();
        this.colocacionMoneda = new ColocacionMoneda();
        this.tiempoEstacionamiento = new TiempoEstacionamiento();
        this.est1 = new Estacionamiento(1);
        this.est2 = new Estacionamiento(2);
        this.est3 = new Estacionamiento(3);
        this.est4 = new Estacionamiento(4);
        this.est5 = new Estacionamiento(5);
        this.est6 = new Estacionamiento(6);
        this.est7 = new Estacionamiento(7);
        this.est8 = new Estacionamiento(8);
        this.est9 = new Estacionamiento(9);
        this.est10 = new Estacionamiento(10);
        this.est11 = new Estacionamiento(11);
        this.est12 = new Estacionamiento(12);
        this.contadorVehiculosSinLugar = 0;
        this.contadorVehiculos = 0;
        this.contadorInfraccion = 0;
        this.eventos = new ArrayList();
        this.eventos.add(llegadaAutomovil);
        this.eventos.add(est1.getFinOcupacion());
        this.eventos.add(est1.getFinParquimetro());
        this.eventos.add(est2.getFinOcupacion());
        this.eventos.add(est2.getFinParquimetro());
        this.eventos.add(est3.getFinOcupacion());
        this.eventos.add(est3.getFinParquimetro());
        this.eventos.add(est4.getFinOcupacion());
        this.eventos.add(est4.getFinParquimetro());
        this.eventos.add(est5.getFinOcupacion());
        this.eventos.add(est5.getFinParquimetro());
        this.eventos.add(est6.getFinOcupacion());
        this.eventos.add(est6.getFinParquimetro());
        this.eventos.add(est7.getFinOcupacion());
        this.eventos.add(est7.getFinParquimetro());
        this.eventos.add(est8.getFinOcupacion());
        this.eventos.add(est8.getFinParquimetro());
        this.eventos.add(est9.getFinOcupacion());
        this.eventos.add(est9.getFinParquimetro());
        this.eventos.add(est10.getFinOcupacion());
        this.eventos.add(est10.getFinParquimetro());
        this.eventos.add(est11.getFinOcupacion());
        this.eventos.add(est11.getFinParquimetro());
        this.eventos.add(est12.getFinOcupacion());
        this.eventos.add(est12.getFinParquimetro());
        this.estacionamientos = new ArrayList<>();
        this.estacionamientos.add(est1);
        this.estacionamientos.add(est2);
        this.estacionamientos.add(est3);
        this.estacionamientos.add(est4);
        this.estacionamientos.add(est5);
        this.estacionamientos.add(est6);
        this.estacionamientos.add(est7);
        this.estacionamientos.add(est8);
        this.estacionamientos.add(est9);
        this.estacionamientos.add(est10);
        this.estacionamientos.add(est11);
        this.estacionamientos.add(est12);
    }

    public ObservableList<VectorEstadoView> inicarSimulacion() {
        //Seteo de condiciones iniciales
        this.llegadaAutomovil.generarProxLlegada(this.reloj);
        if (this.horaDesdeVER == 0.0){
            this.actualizarVectorEstadoActual();
        }
        //Comienzo formal de la simulacion
        while (this.reloj <= this.horaHasta) {
            if (this.horaHasta != 0){
                String proxEvento = this.buscarProximoEvento(); 
                if (proxEvento == this.llegadaAutomovil.getEvento()){
                    this.simularLlegadaAutomovil();
                }
                if (proxEvento == this.est1.getFinOcupacion().getEvento()){
                    this.simularFinTiempoOcupacion();
                }
                if (proxEvento == this.est1.getFinParquimetro().getEvento()){
                    this.simularFinParquimetro();
                }
            }
            //Almaceno los datos que se deben mostrar
            if ( this.reloj >= this.horaDesdeVER && this.reloj<= this.horaHastaVER) {
                this.actualizarVectorEstadoActual();
            }
        }
        
        
        return vectoresEstados;
    }
    


    public void simularLlegadaAutomovil(){
        this.reloj = this.llegadaAutomovil.getHoraEvento();
        this.llegadaAutomovil.generarProxLlegada(this.reloj);
        boolean encontroLugar = false;
        this.ordenarEstacionamiento();
        double remanente = 0.0;
        for (int i  = 0 ; i < this.estacionamientos.size(); i++){
            Estacionamiento estActual = this.estacionamientos.get(i);
            if (estActual.estaLibre() || estActual.tieneRemanente()) {
                encontroLugar = true;
                //Controlo que el estacionamiento tenga remanente
                if (estActual.tieneRemanente()){
                    remanente = estActual.getFinParquimetro().getHoraEvento() 
                              - this.reloj;
                }
                //Colcacion de la moneda
                if (this.colocacionMoneda.decideColocar()){ 
                   this.tiempoEstacionamiento.generarTiempoParquimetro();
                   estActual.getFinParquimetro().setHoraEvento(
                           this.tiempoEstacionamiento.getTiempoParquimetro() 
                         + this.reloj + remanente
                    );
                }
                else {
                    estActual.getFinParquimetro().setHoraEvento(
                           remanente == 0.0 ? -1 : remanente + this.reloj
                    );
                }
                this.tiempoEstacionamiento.generarTiempoOcupacion();
                estActual.getFinOcupacion().setHoraEvento(
                    this.tiempoEstacionamiento.getFinOcupacion() 
                  + this.reloj
                );
                estActual.ponerOcupado();
                break;
            }
        }
        // Actualizacion de contadores
        if (!encontroLugar) {
          this.colocacionMoneda.limpiarColocaMonedas();
          this.contadorVehiculosSinLugar += 1;
        }
        this.contadorVehiculos += 1;
    }

    public void simularFinTiempoOcupacion(){
      FinOcupacion finOcup = (FinOcupacion) this.eventos.get(0);
      this.reloj = finOcup.getHoraEvento();
      Estacionamiento estActual = finOcup.getEst();
      estActual.verificaRemanente();
      if (estActual.tieneRemanente()){
          this.acumTiempoInfracciones += estActual.getRemanente();
      }
      else {
          estActual.ponerLibre(this.reloj);
      }
      this.colocacionMoneda.limpiarColocaMonedas();
      this.tiempoEstacionamiento.limpiarTiempoEstacionamiento();
    }

    public void simularFinParquimetro(){
      FinParquimetro finParquimetro = (FinParquimetro) this.eventos.get(0);
      this.reloj = finParquimetro.getHoraEvento();
      Estacionamiento estActual = finParquimetro.getEst();
      if (estActual.verificaInfraccion()){
          //Significa que va a cometer una infraccion 
          this.contadorInfraccion += 1;
          estActual.ponerOcupadoConInfraccion();
      }
      estActual.ponerLibre(this.reloj);
      this.tiempoEstacionamiento.limpiarTiempoEstacionamiento();
      this.colocacionMoneda.limpiarColocaMonedas();
    }

    public String buscarProximoEvento(){
        Collections.sort(this.eventos);
        this.reloj = this.eventos.get(0).getHoraEvento();
        return this.eventos.get(0).getEvento();
    }

    private void ordenarEstacionamiento() {
        Collections.sort(this.estacionamientos);
    }
    
    public void actualizarVectorEstadoActual(){
        this.vectorEstadoActual = new VectorEstado(reloj, 
                //Llegada automovil
                this.llegadaAutomovil.getRndActual(), this.llegadaAutomovil.getTmpLlegada(), 
                this.llegadaAutomovil.getHoraEvento(),
                //Tiempo Parquimetro
                this.tiempoEstacionamiento.getRndParq(),this.tiempoEstacionamiento.getTiempoParquimetro(),
                //tiempo Ocupacion
                this.tiempoEstacionamiento.getRndOcu(), this.tiempoEstacionamiento.getTiempoOcupacion1(), 
                this.tiempoEstacionamiento.getTiempoOcupacion2(), 
                this.tiempoEstacionamiento.getTiempoOcupacion3(),
                //Coloca monedas
                this.colocacionMoneda.getRndActual(), this.colocacionMoneda.getDecision(), 
                //Estacionamientos
                est1.getEstado(), est1.getFinOcupacion().getHoraEvento(), est1.getFinParquimetro().getHoraEvento(),
                est2.getEstado(), est2.getFinOcupacion().getHoraEvento(), est2.getFinParquimetro().getHoraEvento(), 
                est3.getEstado(), est3.getFinOcupacion().getHoraEvento(), est3.getFinParquimetro().getHoraEvento(), 
                est4.getEstado(), est4.getFinOcupacion().getHoraEvento(), est4.getFinParquimetro().getHoraEvento(), 
                est5.getEstado(), est5.getFinOcupacion().getHoraEvento(), est5.getFinParquimetro().getHoraEvento(), 
                est6.getEstado(), est6.getFinOcupacion().getHoraEvento(), est6.getFinParquimetro().getHoraEvento(), 
                est7.getEstado(), est7.getFinOcupacion().getHoraEvento(), est7.getFinParquimetro().getHoraEvento(), 
                est8.getEstado(), est8.getFinOcupacion().getHoraEvento(), est8.getFinParquimetro().getHoraEvento(), 
                est9.getEstado(), est9.getFinOcupacion().getHoraEvento(), est9.getFinParquimetro().getHoraEvento(), 
                est10.getEstado(), est10.getFinOcupacion().getHoraEvento(), est10.getFinParquimetro().getHoraEvento(), 
                est11.getEstado(), est11.getFinOcupacion().getHoraEvento(), est11.getFinParquimetro().getHoraEvento(), 
                est12.getEstado(), est12.getFinOcupacion().getHoraEvento(), est12.getFinParquimetro().getHoraEvento(), 
                //Variables de conteo
                this.contadorVehiculosSinLugar, 
                this.contadorVehiculos, 
                this.contadorInfraccion, 
                this.acumTiempoInfracciones);
        VectorEstadoView v = new VectorEstadoView(this.vectorEstadoActual);
        this.vectoresEstados.add(v);
    }
    
    public void mostrarValores(){
        System.out.println("Reloj: " + this.reloj );
        System.out.print("RND: " + this.llegadaAutomovil.getRndActual() );
        System.out.println("Tmp: " + this.llegadaAutomovil.getHoraEvento());
        System.out.print("rndparq: " + this.tiempoEstacionamiento.getRndParq());
        System.out.print("tmpparq: " + this.tiempoEstacionamiento.getTiempoParquimetro());
        System.out.print("rndocu: " + this.tiempoEstacionamiento.getRndOcu());
        System.out.print("tmpOc1: " + this.tiempoEstacionamiento.getTiempoOcupacion1());
        System.out.print("tmpOc2: " + this.tiempoEstacionamiento.getTiempoOcupacion2());
        System.out.print("tmpOc3: " + this.tiempoEstacionamiento.getTiempoOcupacion3() );
        System.out.println("Rnd moneda: " + this.colocacionMoneda.getRndActual());
        System.out.println("decision moneda: " + this.colocacionMoneda.getDecision());
        System.out.println("Estado1: " + this.est1.getEstado());
        System.out.println("Estado2: " + this.est2.getEstado());
        
    }

    private void mostrarOrdenEventos() {
        System.out.println("1: " + this.eventos.get(0).getEvento() + " " + this.eventos.get(0).getHoraEvento());
        System.out.println("2: " + this.eventos.get(1).getEvento() + " " + this.eventos.get(1).getHoraEvento());
        System.out.println("3: " + this.eventos.get(2).getEvento() + " " + this.eventos.get(2).getHoraEvento());
        System.out.println("4: " + this.eventos.get(3).getEvento() + " " + this.eventos.get(3).getHoraEvento());
        System.out.println("5: " + this.eventos.get(4).getEvento() + " " + this.eventos.get(4).getHoraEvento());
        System.out.println("6: " + this.eventos.get(5).getEvento() + " " + this.eventos.get(5).getHoraEvento());
        System.out.println("7: " + this.eventos.get(6).getEvento() + " " + this.eventos.get(6).getHoraEvento());
        System.out.println("8: " + this.eventos.get(7).getEvento() + " " + this.eventos.get(7).getHoraEvento());
        System.out.println("9: " + this.eventos.get(8).getEvento() + " " + this.eventos.get(8).getHoraEvento());
        System.out.println("10: " + this.eventos.get(9).getEvento() + " " + this.eventos.get(9).getHoraEvento());
        System.out.println("11: " + this.eventos.get(10).getEvento() + " " + this.eventos.get(10).getHoraEvento());
        System.out.println("12: " + this.eventos.get(11).getEvento() + " " + this.eventos.get(11).getHoraEvento());
        System.out.println("13: " + this.eventos.get(12).getEvento() + " " + this.eventos.get(12).getHoraEvento());
    }

    public int getContadorVehiculosSinLugar() {
        return contadorVehiculosSinLugar;
    }

    public int getContadorVehiculos() {
        return contadorVehiculos;
    }

    public int getContadorInfraccion() {
        return contadorInfraccion;
    }

    public double getAcumTiempoInfracciones() {
        return acumTiempoInfracciones;
    }

    public double getPorcentajeInfraccion() {
        return this.contadorInfraccion *100 / this.contadorVehiculos;
    }

    public double getRecaudacion() {
        return 0;
    }

    public Object getPerdidaPorInfraccion() {
        return 0;
    }
    
}
