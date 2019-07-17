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
    }
    
    public void generarTiempoParquimetro(){
        this.rndParq = this.rnd.nextDouble();
        this.tiempoParquimetro = this.rndParq < this.porcentajeMediaHora ? 30.0 : 60.0; 
    }
    
    public void generarTiempoOcupacion(){
        this.rndOcu = this.rnd.nextDouble();  
        this.tiempoOcupacion1 = 0;
        this.tiempoOcupacion2 = 0;
        this.tiempoOcupacion3 = 0;
        if (this.rndOcu < 40) {
            this.distUniforme = new Uniforme(0.5 * tiempoParquimetro , 0.9 * tiempoParquimetro);
            this.tiempoOcupacion1 = (double) this.distUniforme.generarNumeros(1).get(0);
        }
        else if (this.rndOcu < 65) {
            this.tiempoOcupacion2 = tiempoParquimetro;
        }
        else {
            this.distUniforme = new Uniforme(1.05 * tiempoParquimetro , 1.2 * tiempoParquimetro);
            this.tiempoOcupacion3 = (double) this.distUniforme.generarNumeros(1).get(0);
        }
    }
    
    
    
    
}
