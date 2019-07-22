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
        this.estado = "L";
    }
    
    public boolean verificaInfraccion(){
        if (this.finOcupacion.getHoraEvento() > this.finParquimetro.getHoraEvento()){
            return true;
        }
        return false;
    }
    public double getRemanente(){
        return this.tieneRemanente() ? this.finParquimetro.getHoraEvento() -this.finOcupacion.getHoraEvento() : 0;
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

    public void ponerLibre(double relojActual) {
        this.estado = "L";
        if (relojActual >= this.finParquimetro.getHoraEvento()|| this.finOcupacion.getHoraEvento() == this.finParquimetro.getHoraEvento()){
            this.finParquimetro.setHoraEvento(-1);
        }
        this.finOcupacion.setHoraEvento(-1);
    }

    public void ponerConRemanente(){
        this.estado = "CR";
        this.finOcupacion.setHoraEvento(-1);
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

    void verificaRemanente() {
        if (this.finOcupacion.getHoraEvento() < this.finParquimetro.getHoraEvento()){
            this.ponerConRemanente();
        }
    }
    @Override
    public int compareTo(Object t) {
        Estacionamiento otro = (Estacionamiento) t;
        return this.tieneRemanente() ? -1 : otro.tieneRemanente() ? 1 : 0; 
    }
    /*@Override
    public int compareTo(Object t) {
        Estacionamiento otro = (Estacionamiento) t;
        return this.tieneRemanente() ? 1 : otro.tieneRemanente() ? -1 : 0; 
    }*
    

    /*@Override
    public int compareTo(Object t) {
        Estacionamiento otro = (Estacionamiento) t;
        return this.numeroEstacionamiento < otro.numeroEstacionamiento ? 1 : -1;
    }*/
    
}
