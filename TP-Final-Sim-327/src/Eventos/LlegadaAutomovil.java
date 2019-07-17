/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import distribuciones.Exponencial;
import java.util.Random;


/**
 *
 * @author aleex
 */
public class LlegadaAutomovil extends Evento{
    private Random rnd;
    private double rndActual; 
    private double tmpLlegada;
    private double horaLlegada;
    private static double media = 5; //Expresado en minutos
    private Exponencial exp;
    
    public LlegadaAutomovil() {
        super();
        this.exp = new Exponencial(5);
        this.rnd = new Random();
    }
    
    public void generarProxLlegada(double horaActual){
        this.rndActual = rnd.nextDouble();
        this.tmpLlegada = exp.generarNumero(this.rndActual);
        this.setHoraEvento(horaActual + this.tmpLlegada);
    }
    
    public Random getRnd() {
        return rnd;
    }

    public double getTmpLlegada() {
        return tmpLlegada;
    }


    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }

    public void setTmpLlegada(double tmpLlegada) {
        this.tmpLlegada = tmpLlegada;
    }
    
}
