/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import java.util.Random;

/**
 *
 * @author aleex
 */
public class ColocacionMoneda {
    private Random rnd;
    private double rndActual;
    private static double probabilidadNoColocacion = 0.15;
    private int decision;

    public ColocacionMoneda() {
        this.rnd = new Random();
        this.rndActual = -1;
    }
    
    public void generarColocacionMoneda(){
        this.rndActual = this.rnd.nextDouble();
        this.decision = this.rndActual < this.probabilidadNoColocacion ? 0 : 1;
    }
    public void limpiarColocaMonedas(){
        this.rndActual = -1;
    }
    
    public Random getRnd() {
        return rnd;
    }

    public double getRndActual() {
        return rndActual;
    }

    public void setRndActual(double rndActual) {
        this.rndActual = rndActual;
    }
    
    
    public static double getProbabilidadNoColocacion() {
        return probabilidadNoColocacion;
    }

    public int getDecision() {
        return decision;
    }

    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }

    public static void setProbabilidadNoColocacion(double probabilidadNoColocacion) {
        ColocacionMoneda.probabilidadNoColocacion = probabilidadNoColocacion;
    }

    public void setDecision(int decision) {
        this.decision = decision;
    }

    public boolean decideColocar() {
        this.generarColocacionMoneda();
        return this.decision == 1 ? true : false;
    }
    
    
}
