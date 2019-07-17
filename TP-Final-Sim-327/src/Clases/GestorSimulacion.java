/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Eventos.ColocacionMoneda;
import Eventos.Evento;
import Eventos.LlegadaAutomovil;
import Eventos.TiempoEstacionamiento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    
    private ArrayList<Evento> eventos;
    
    
    public GestorSimulacion() {
        this.llegadaAutomovil = new LlegadaAutomovil();
        this.colocacionMoneda = new ColocacionMoneda();
        this.tiempoEstacionamiento = new TiempoEstacionamiento();
        this.est1 = new Estacionamiento(1);
        this.est1 = new Estacionamiento(2);
        this.est1 = new Estacionamiento(3);
        this.est1 = new Estacionamiento(4);
        this.est1 = new Estacionamiento(5);
        this.est1 = new Estacionamiento(6);
        this.est1 = new Estacionamiento(7);
        this.est1 = new Estacionamiento(8);
        this.est1 = new Estacionamiento(9);
        this.est1 = new Estacionamiento(10);
        this.est1 = new Estacionamiento(11);
        this.est1 = new Estacionamiento(12);
        this.contadorVehiculosSinLugar = 0;
        this.contadorVehiculos = 0;
        this.contadorInfraccion = 0;
        this.eventos.add(llegadaAutomovil);
        /*
        this.eventos.add(est1);
        this.eventos.add(est2);
        this.eventos.add(est3);
        this.eventos.add(est4);
        this.eventos.add(est5);
        this.eventos.add(est6);
        this.eventos.add(est7);
        this.eventos.add(est8);
        this.eventos.add(est9);
        this.eventos.add(est10);
        this.eventos.add(est11);
        this.eventos.add(est12);
        */
    }
    
    public void inicarSimulacion(double horaFinSimulacion) {
        //Seteo de condiciones iniciales
        this.reloj = 0.0;
        this.llegadaAutomovil.generarProxLlegada(this.reloj);
        
        //Comienzo formal de la simulacion
        while (this.reloj <= horaFinSimulacion) {
            
            
        }
    }
    
    public void buscarProximoEvento(){

    }
}
