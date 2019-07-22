/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import distribuciones.Uniforme;
import java.util.Random;

/**
 *
 * @author aleex
 */
public class TiempoEstacionamiento {
    private Random rnd;
    //Parquimetro
    private double rndParq;
    private double tiempoParquimetro;
    
    //Ocupacion Real
    private double rndOcu;
    private double tiempoOcupacion1;
    private double tiempoOcupacion2;
    private double tiempoOcupacion3;
    
    
    
    private double porcentajeMediaHora = 0.45;
    private Uniforme distUniforme;
    
    public TiempoEstacionamiento() {
        this.rnd = new Random();
        this.tiempoOcupacion1 = -1;
        this.tiempoOcupacion2 = -1;
        this.tiempoOcupacion3 = -1;
        this.tiempoParquimetro = -1;
        this.rndOcu = -1;
        this.rndParq = -1;
    }
    
    public void generarTiempoParquimetro(){
        this.rndParq = this.rnd.nextDouble();
        this.tiempoParquimetro = this.rndParq < this.porcentajeMediaHora ? 30.0 : 60.0; 
    }
    
    public void generarTiempoOcupacion(){
        this.tiempoOcupacion1 = -1;
        this.tiempoOcupacion2 = -1;
        this.tiempoOcupacion3 = -1;
        if (tiempoParquimetro >= 0){
            this.rndOcu = this.rnd.nextDouble(); 
            if (this.rndOcu < 0.4) {
                this.distUniforme = new Uniforme(0.5 * tiempoParquimetro , 0.9 * tiempoParquimetro);
                this.tiempoOcupacion1 = (double) this.distUniforme.generarNumeros(1).get(0);
            }
            else if (this.rndOcu < 0.65) {
                this.tiempoOcupacion2 = tiempoParquimetro;
            }
            else {
                this.distUniforme = new Uniforme(1.05 * tiempoParquimetro , 1.2 * tiempoParquimetro);
                this.tiempoOcupacion3 = (double) this.distUniforme.generarNumeros(1).get(0);
            }
        }
        else{
            double rndAux  = this.rnd.nextDouble();
            double tiempoOcupacionAux = rndAux < this.porcentajeMediaHora ? 30.0 : 60.0;
            if (rndAux < 40) {
                this.distUniforme = new Uniforme(0.5 * tiempoOcupacionAux , 0.9 * tiempoOcupacionAux);
                this.tiempoOcupacion1 = (double) this.distUniforme.generarNumeros(1).get(0);
            }
            else if (this.rndOcu < 65) {
                this.tiempoOcupacion2 = tiempoOcupacionAux;
            }
            else {
                this.distUniforme = new Uniforme(1.05 * tiempoOcupacionAux , 1.2 * tiempoOcupacionAux);
                this.tiempoOcupacion3 = (double) this.distUniforme.generarNumeros(1).get(0);
            }
        }
        
    }

    public Random getRnd() {
        return rnd;
    }

    public double getRndParq() {
        return rndParq;
    }

    public double getTiempoParquimetro() {
        return tiempoParquimetro;
    }

    public double getRndOcu() {
        return rndOcu;
    }

    public double getTiempoOcupacion1() {
        return tiempoOcupacion1;
    }

    public double getTiempoOcupacion2() {
        return tiempoOcupacion2;
    }

    public double getTiempoOcupacion3() {
        return tiempoOcupacion3;
    }

    public double getPorcentajeMediaHora() {
        return porcentajeMediaHora;
    }

    public Uniforme getDistUniforme() {
        return distUniforme;
    }

    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }

    public void setRndParq(double rndParq) {
        this.rndParq = rndParq;
    }

    public void setTiempoParquimetro(double tiempoParquimetro) {
        this.tiempoParquimetro = tiempoParquimetro;
    }

    public void setRndOcu(double rndOcu) {
        this.rndOcu = rndOcu;
    }

    public void setTiempoOcupacion1(double tiempoOcupacion1) {
        this.tiempoOcupacion1 = tiempoOcupacion1;
    }

    public void setTiempoOcupacion2(double tiempoOcupacion2) {
        this.tiempoOcupacion2 = tiempoOcupacion2;
    }

    public void setTiempoOcupacion3(double tiempoOcupacion3) {
        this.tiempoOcupacion3 = tiempoOcupacion3;
    }

    public void setPorcentajeMediaHora(double porcentajeMediaHora) {
        this.porcentajeMediaHora = porcentajeMediaHora;
    }

    public void setDistUniforme(Uniforme distUniforme) {
        this.distUniforme = distUniforme;
    }
    
    public double getFinOcupacion(){
        if (this.tiempoOcupacion1 > 0){
            return this.tiempoOcupacion1;
        }
        if (this.tiempoOcupacion2 > 0){
            return this.tiempoOcupacion2;
        }
        if (this.tiempoOcupacion3 > 0){
            return this.tiempoOcupacion3;
        }
        return -1;
    }

    public void limpiarTiempoEstacionamiento() {
        this.rndOcu = -1;
        this.rndParq = -1;
        this.tiempoOcupacion1 = -1;
        this.tiempoOcupacion2 = -1;
        this.tiempoOcupacion3 = -1;
        this.tiempoParquimetro = -1;
    }
    
    
    
}
