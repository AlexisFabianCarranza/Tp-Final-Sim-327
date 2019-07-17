/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author aleex
 */
public class Estacionamiento{
    private int numeroEstacionamiento; //12estacionamientos
    private String estado; // Libre("L") Con remanente ("CR") Ocupado ("O") 
    private double finTmpOcupacion;
    private double finTmpParquimetro;

    
    public Estacionamiento(int numeroEstacionamiennto) {
        this.numeroEstacionamiento = numeroEstacionamiennto;
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

    public double getFinTmpOcupacion() {
        return finTmpOcupacion;
    }

    public double getFinTmpParquimetro() {
        return finTmpParquimetro;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFinTmpOcupacion(double finTmpOcupacion) {
        this.finTmpOcupacion = finTmpOcupacion;
    }

    public void setFinTmpParquimetro(double finTmpParquimetro) {
        this.finTmpParquimetro = finTmpParquimetro;
    }

    public void ponerLibre() {
        this.estado = "L";
    }
    
    public void ponerConRemanente(){
        this.estado = "CR";
    }
    
    public void ponerOcupado(){
        this.estado = "O";
    }
    
    
    
    
}
