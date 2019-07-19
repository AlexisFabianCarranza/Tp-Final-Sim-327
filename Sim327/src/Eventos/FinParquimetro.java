/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import Clases.Estacionamiento;

/**
 *
 * @author aleex
 */
public class FinParquimetro extends Evento{
    private Estacionamiento est;
 
    public FinParquimetro(Estacionamiento est) {
        this.est = est;
    }

    public Estacionamiento getEst() {
        return est;
    }

    public void setEst(Estacionamiento est) {
        this.est = est;
    }
    
    public String getEvento(){
      return "FTP";
    }
}
