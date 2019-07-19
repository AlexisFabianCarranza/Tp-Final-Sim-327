/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Eventos.Evento;
import Eventos.FinOcupacion;
import Eventos.FinParquimetro;

/**
 *
 * @author aleex
 */
public class Estacionamiento implements Comparable{
    private int numeroEstacionamiento; //12 estacionamientos
    private String estado; // Libre("L") Con remanente ("CR") Ocupado ("O") OcupadoConInfraccion ("OI")
    private FinOcupacion finOcupacion;
    private FinParquimetro finParquimetro;


    public Estacionamiento(int numeroEstacionamiennto) {
        this.numeroEstacionamiento = numeroEstacionamiennto;
        this.finOcupacion = new FinOcupacion(this);
        this.finParquimetro = new FinParquimetro(this);
        this.ponerLibre();
    }

    public int getNumeroEstacionamiento() {
        return numeroEstacionamiento;
    }

    public void setNumeroEstacionamiento(int numeroEstacionamiento) {
        this.numeroEstacionamiento = numeroEstacionamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void ponerLibre() {
        this.estado = "L";
        if (this.finOcupacion.getHoraEvento() == this.finParquimetro.getHoraEvento()){
          this.finParquimetro.setHoraEvento(-1);
        }
        this.finOcupacion.setHoraEvento(-1);
    }

    public void ponerConRemanente(){
        this.estado = "CR";
    }

    public void ponerOcupado(){
        this.estado = "O";
    }

        public FinOcupacion getFinOcupacion() {
        return finOcupacion;
    }

    public FinParquimetro getFinParquimetro() {
        return finParquimetro;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFinOcupacion(FinOcupacion finOcupacion) {
        this.finOcupacion = finOcupacion;
    }

    public void setFinParquimetro(FinParquimetro finParquimetro) {
        this.finParquimetro = finParquimetro;
    }
    
    @Override
    public int compareTo(Object t) {
        Estacionamiento otro = (Estacionamiento) t;
        if (this.tieneRemanente() && otro.tieneRemanente()){
            return 0;
        }
        else if (this.tieneRemanente()){
            return 1;
        }
        else {
            return -1;
        }
    }
    
    public void ponerOcupadoConInfraccion(){
        this.estado = "OI";
    }
    public boolean estaLibre() {
        return (this.estado == "L") ? true : false;
    }
    
    public boolean estaOcupado() {
        return (this.estado == "O") ? true : false;
    }
    
    public boolean tieneRemanente() {
        return (this.estado == "CR") ? true : false;
    }
    
    public boolean estaOcupadoConInfraccion(){
        return (this.estado == "OI") ? true : false;
    }
    
}
