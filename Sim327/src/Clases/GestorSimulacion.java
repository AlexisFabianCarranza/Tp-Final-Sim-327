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
import java.util.Collections;
import java.util.Comparator;
import javafx.collections.ObservableList;

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
        this.horaHasta = horaHasta;
        this.horaDesdeVER = horaDesde;
        this.horaHastaVER = horaHasta;
        this.reloj = 0.0;
        this.llegadaAutomovil = new LlegadaAutomovil();
        this.colocacionMoneda = new ColocacionMoneda();
        this.tiempoEstacionamiento = new TiempoEstacionamiento();
        this.est1 = new Estacionamiento(1);
        this.est2 = new Estacionamiento(2);
        /*this.est3 = new Estacionamiento(3);
        this.est4 = new Estacionamiento(4);
        this.est5 = new Estacionamiento(5);
        this.est6 = new Estacionamiento(6);
        this.est7 = new Estacionamiento(7);
        this.est8 = new Estacionamiento(8);
        this.est9 = new Estacionamiento(9);
        this.est10 = new Estacionamiento(10);
        this.est11 = new Estacionamiento(11);
        this.est12 = new Estacionamiento(12);*/
        this.contadorVehiculosSinLugar = 0;
        this.contadorVehiculos = 0;
        this.contadorInfraccion = 0;
        this.eventos = new ArrayList();
        this.eventos.add(llegadaAutomovil);
        this.eventos.add(est1.getFinOcupacion());
        this.eventos.add(est1.getFinParquimetro());
        /*this.eventos.add(est2.getFinOcupacion());
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
        this.eventos.add(est12.getFinParquimetro());*/
        this.estacionamientos = new ArrayList<>();
        this.estacionamientos.add(est1);
        this.estacionamientos.add(est2);
        /*this.estacionamientos.add(est3);
        this.estacionamientos.add(est4);
        this.estacionamientos.add(est5);
        this.estacionamientos.add(est6);
        this.estacionamientos.add(est7);
        this.estacionamientos.add(est8);
        this.estacionamientos.add(est9);
        this.estacionamientos.add(est10);
        this.estacionamientos.add(est11);
        this.estacionamientos.add(est12);*/
    }

    public ObservableList<VectorEstadoView> inicarSimulacion() {
        //Seteo de condiciones iniciales
        //this.mostrarValores();
        this.llegadaAutomovil.generarProxLlegada(this.reloj);
        this.reloj = this.llegadaAutomovil.getHoraEvento();
        //this.mostrarValores();
        //Comienzo formal de la simulacion
        while (this.reloj <= this.horaHasta) {
            System.out.println("Reloj: " + this.reloj);
            System.out.println("Accion: " + this.buscarProximoEvento() +"\n");
            if (this.reloj != 0){
                switch (this.buscarProximoEvento())  {
                    case "LLA":
                        this.simularLlegadaAutomovil();
                    case "FTO":
                        this.simularFinTiempoOcupacion();
                    case "FTP":
                        this.simularFinParquimetro();
                }
            }
            
            //Almaceno los datos que se deben mostrar
            if ( this.reloj >= this.horaDesdeVER && this.reloj<= this.horaHastaVER) {
                this.actualizarVectorEstadoActual();
                VectorEstadoView v = new VectorEstadoView(this.vectorEstadoActual);
                this.vectoresEstados.add(v);
            }
        }
        
        
        return vectoresEstados;
    }
    


    public void simularLlegadaAutomovil(){
        this.reloj = this.llegadaAutomovil.getHoraEvento();
        this.llegadaAutomovil.generarProxLlegada(this.reloj);
        boolean encontroLugar = false;
        this.ordenarEstacionamiento();
        for (int i  = 0 ; i < this.estacionamientos.size(); i++){
            Estacionamiento estActual = this.estacionamientos.get(i);
            if (estActual.estaLibre()) {
                encontroLugar = true;
                this.tiempoEstacionamiento.generarTiempoParquimetro();
                this.tiempoEstacionamiento.generarTiempoOcupacion();
                estActual.getFinOcupacion().setHoraEvento(
                    this.tiempoEstacionamiento.getFinOcupacion() + this.reloj
                );
                estActual.getFinParquimetro().setHoraEvento(
                    this.tiempoEstacionamiento.getTiempoParquimetro() + this.reloj
                );
                estActual.ponerOcupado();
                break;
            }
        }
        // Actualizacion de contadores
        if (!encontroLugar) {
          this.contadorVehiculosSinLugar += 1;
        }
        this.contadorVehiculos = 0;
    }

    public void simularFinTiempoOcupacion(){
      FinOcupacion finOcup = (FinOcupacion) this.eventos.get(0);
      this.reloj = finOcup.getHoraEvento();
      Estacionamiento estActual = finOcup.getEst();
      estActual.ponerLibre();
    }

    public void simularFinParquimetro(){
      FinParquimetro finParquimetro = (FinParquimetro) this.eventos.get(0);
      this.reloj = finParquimetro.getHoraEvento();
      Estacionamiento estActual = finParquimetro.getEst();
      if (estActual.getFinOcupacion().getHoraEvento() > estActual.getFinParquimetro().getHoraEvento()){
          //Significa que va a cometer una infraccion 
          this.contadorInfraccion += 1;
          estActual.ponerOcupadoConInfraccion();
      }
    }

    public String buscarProximoEvento(){
        Collections.sort(this.eventos);
        this.mostrarOrdernEventos();
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
    }
    
    public void mostrarValores(){
        System.out.println("Reloj: " + this.reloj );
        System.out.println("RND: " + this.llegadaAutomovil.getRndActual() );
        System.out.println("Tmp: " + this.llegadaAutomovil.getHoraEvento());
        System.out.println("rndparq: " + this.tiempoEstacionamiento.getRndParq());
        System.out.println("tmpparq: " + this.tiempoEstacionamiento.getTiempoParquimetro());
        System.out.println("rndocu: " + this.tiempoEstacionamiento.getRndOcu());
        System.out.println("tmpOc1: " + this.tiempoEstacionamiento.getTiempoOcupacion1());
        System.out.println("tmpOc2: " + this.tiempoEstacionamiento.getTiempoOcupacion2());
        System.out.println("tmpOc3: " + this.tiempoEstacionamiento.getTiempoOcupacion3() );
        System.out.println("Rnd moneda: " + this.colocacionMoneda.getRndActual());
        System.out.println("decision moneda: " + this.colocacionMoneda.getDecision());
        System.out.println("Estado1: " + this.est1.getEstado());
        System.out.println("Estado2: " + this.est2.getEstado());
        
    }

    private void mostrarOrdernEventos() {
        System.out.println("1: " + this.eventos.get(0).getEvento() + " " + this.eventos.get(0).getHoraEvento());
        System.out.println("2: " + this.eventos.get(1).getEvento() + " " + this.eventos.get(1).getHoraEvento());
        System.out.println("3: " + this.eventos.get(2).getEvento() + " " + this.eventos.get(2).getHoraEvento());
    }
}
