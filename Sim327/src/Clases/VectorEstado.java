/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author aleex
 */
public class VectorEstado {
    
    private double reloj;
    //Llegada de automovil
    private double rndLlegadaAutomovil;
    private double tiempoLlegadaAutomovil;
    private double proximaLlegada;
    //Tiempo Parquimetro
    private double rndParq;
    private double tiempoParquimetro;
    //Tiempo Parquimetro
    private double rndOcup;
    private double tiempoOcupacion1;
    private double tiempoOcupacion2;
    private double tiempoOcupacion3;
    //Coloca Monedas
    private double rndMonedas;
    private int colocaMonedas;
    //Estacionamientos
    private String est1;
    private double finOcupacion1;
    private double finParquimetro1;
    private String est2;
    private double finOcupacion2;
    private double finParquimetro2;
    private String est3;
    private double finOcupacion3;
    private double finParquimetro3;
    private String est4;
    private double finOcupacion4;
    private double finParquimetro4;
    private String est5;
    private double finOcupacion5;
    private double finParquimetro5;
    private String est6;
    private double finOcupacion6;
    private double finParquimetro6;
    private String est7;
    private double finOcupacion7;
    private double finParquimetro7;
    private String est8;
    private double finOcupacion8;
    private double finParquimetro8;
    private String est9;
    private double finOcupacion9;
    private double finParquimetro9;
    private String est10;
    private double finOcupacion10;
    private double finParquimetro10;
    private String est11;
    private double finOcupacion11;
    private double finParquimetro11;
    private String est12;
    private double finOcupacion12;
    private double finParquimetro12;
    //Contadores
    private double contVehiSinLugar;
    private double contVehiculos;
    private double contInfracciones;
    private double acumTiempoInfracciones;
    private double acumTiempoPaquimetro;
    private ArrayList<Double> doubles;
    
    public VectorEstado(double reloj, 
            double rndLlegadaAutomovil, double tiempoLlegadaAutomovil, double proximaLlegada, 
            double rndParq, double tiempoParquimetro, double rndOcup, double tiempoOcupacion1,
            double tiempoOcupacion2, double tiempoOcupacion3, 
            double rndMonedas, int colocaMonedas, 
            String est1, double finOcupacion1, double finParquimetro1, 
            String est2, double finOcupacion2, double finParquimetro2, 
            String est3, double finOcupacion3, double finParquimetro3, 
            String est4, double finOcupacion4, double finParquimetro4, 
            String est5, double finOcupacion5, double finParquimetro5, 
            String est6, double finOcupacion6, double finParquimetro6, 
            String est7, double finOcupacion7, double finParquimetro7, 
            String est8, double finOcupacion8, double finParquimetro8, 
            String est9, double finOcupacion9, double finParquimetro9, 
            String est10, double finOcupacion10, double finParquimetro10, 
            String est11, double finOcupacion11, double finParquimetro11, 
            String est12, double finOcupacion12, double finParquimetro12, 
            double contVehiSinLugar, double contVehiculos, 
            double contInfracciones, 
            double acumTiempoInfracciones,
            double acumTiempoPaquimetro) {
        this.reloj = reloj;
        this.rndLlegadaAutomovil = rndLlegadaAutomovil;
        this.tiempoLlegadaAutomovil = tiempoLlegadaAutomovil;
        this.proximaLlegada = proximaLlegada;
        this.rndParq = rndParq;
        this.tiempoParquimetro = tiempoParquimetro;
        this.rndOcup = rndOcup;
        this.tiempoOcupacion1 = tiempoOcupacion1;
        this.tiempoOcupacion2 = tiempoOcupacion2;
        this.tiempoOcupacion3 = tiempoOcupacion3;
        this.rndMonedas = rndMonedas;
        this.colocaMonedas = colocaMonedas;
        this.est1 = est1;
        this.finOcupacion1 = finOcupacion1;
        this.finParquimetro1 = finParquimetro1;
        this.est2 = est2;
        this.finOcupacion2 = finOcupacion2;
        this.finParquimetro2 = finParquimetro2;
        this.est3 = est3;
        this.finOcupacion3 = finOcupacion3;
        this.finParquimetro3 = finParquimetro3;
        this.est4 = est4;
        this.finOcupacion4 = finOcupacion4;
        this.finParquimetro4 = finParquimetro4;
        this.est5 = est5;
        this.finOcupacion5 = finOcupacion5;
        this.finParquimetro5 = finParquimetro5;
        this.est6 = est6;
        this.finOcupacion6 = finOcupacion6;
        this.finParquimetro6 = finParquimetro6;
        this.est7 = est7;
        this.finOcupacion7 = finOcupacion7;
        this.finParquimetro7 = finParquimetro7;
        this.est8 = est8;
        this.finOcupacion8 = finOcupacion8;
        this.finParquimetro8 = finParquimetro8;
        this.est9 = est9;
        this.finOcupacion9 = finOcupacion9;
        this.finParquimetro9 = finParquimetro9;
        this.est10 = est10;
        this.finOcupacion10 = finOcupacion10;
        this.finParquimetro10 = finParquimetro10;
        this.est11 = est11;
        this.finOcupacion11 = finOcupacion11;
        this.finParquimetro11 = finParquimetro11;
        this.est12 = est12;
        this.finOcupacion12 = finOcupacion12;
        this.finParquimetro12 = finParquimetro12;
        this.contVehiSinLugar = contVehiSinLugar;
        this.contVehiculos = contVehiculos;
        this.contInfracciones = contInfracciones;
        this.acumTiempoInfracciones = acumTiempoInfracciones;
        this.acumTiempoPaquimetro = acumTiempoPaquimetro;
    }

    public double getAcumTiempoPaquimetro() {
        return acumTiempoPaquimetro;
    }

    public void setReloj(double reloj) {
        this.reloj = reloj;
    }

    public void setRndLlegadaAutomovil(double rndLlegadaAutomovil) {
        this.rndLlegadaAutomovil = rndLlegadaAutomovil;
    }

    public void setTiempoLlegadaAutomovil(double tiempoLlegadaAutomovil) {
        this.tiempoLlegadaAutomovil = tiempoLlegadaAutomovil;
    }

    public void setFinOcupacion12(double finOcupacion12) {
        this.finOcupacion12 = finOcupacion12;
    }
    
    
    public void setProximaLlegada(double proximaLlegada) {
        this.proximaLlegada = proximaLlegada;
    }

    public void setRndParq(double rndParq) {
        this.rndParq = rndParq;
    }

    public void setTiempoParquimetro(double tiempoParquimetro) {
        this.tiempoParquimetro = tiempoParquimetro;
    }

    public void setRndOcup(double rndOcup) {
        this.rndOcup = rndOcup;
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

    public void setRndMonedas(double rndMonedas) {
        this.rndMonedas = rndMonedas;
    }


    public void setEst1(String est1) {
        this.est1 = est1;
    }

    public double getFinOcupacion12() {
        return finOcupacion12;
    }
    
    
    public void setFinOcupacion1(double finOcupacion1) {
        this.finOcupacion1 = finOcupacion1;
    }

    public void setFinParquimetro1(double finParquimetro1) {
        this.finParquimetro1 = finParquimetro1;
    }

    public void setEst2(String est2) {
        this.est2 = est2;
    }

    public void setFinOcupacion2(double finOcupacion2) {
        this.finOcupacion2 = finOcupacion2;
    }

    public void setFinParquimetro2(double finParquimetro2) {
        this.finParquimetro2 = finParquimetro2;
    }

    public void setEst3(String est3) {
        this.est3 = est3;
    }

    public void setFinOcupacion3(double finOcupacion3) {
        this.finOcupacion3 = finOcupacion3;
    }

    public void setFinParquimetro3(double finParquimetro3) {
        this.finParquimetro3 = finParquimetro3;
    }

    public void setEst4(String est4) {
        this.est4 = est4;
    }

    public void setFinOcupacion4(double finOcupacion4) {
        this.finOcupacion4 = finOcupacion4;
    }

    public void setFinParquimetro4(double finParquimetro4) {
        this.finParquimetro4 = finParquimetro4;
    }

    public void setEst5(String est5) {
        this.est5 = est5;
    }

    public void setFinOcupacion5(double finOcupacion5) {
        this.finOcupacion5 = finOcupacion5;
    }

    public void setFinParquimetro5(double finParquimetro5) {
        this.finParquimetro5 = finParquimetro5;
    }

    public void setEst6(String est6) {
        this.est6 = est6;
    }

    public void setFinOcupacion6(double finOcupacion6) {
        this.finOcupacion6 = finOcupacion6;
    }

    public void setFinParquimetro6(double finParquimetro6) {
        this.finParquimetro6 = finParquimetro6;
    }

    public void setEst7(String est7) {
        this.est7 = est7;
    }

    public void setFinOcupacion7(double finOcupacion7) {
        this.finOcupacion7 = finOcupacion7;
    }

    public void setFinParquimetro7(double finParquimetro7) {
        this.finParquimetro7 = finParquimetro7;
    }

    public void setEst8(String est8) {
        this.est8 = est8;
    }

    public void setFinOcupacion8(double finOcupacion8) {
        this.finOcupacion8 = finOcupacion8;
    }

    public void setFinParquimetro8(double finParquimetro8) {
        this.finParquimetro8 = finParquimetro8;
    }

    public void setEst9(String est9) {
        this.est9 = est9;
    }

    public void setFinOcupacion9(double finOcupacion9) {
        this.finOcupacion9 = finOcupacion9;
    }

    public void setFinParquimetro9(double finParquimetro9) {
        this.finParquimetro9 = finParquimetro9;
    }

    public void setEst10(String est10) {
        this.est10 = est10;
    }

    public void setFinOcupacion10(double finOcupacion10) {
        this.finOcupacion10 = finOcupacion10;
    }

    public void setFinParquimetro10(double finParquimetro10) {
        this.finParquimetro10 = finParquimetro10;
    }

    public void setEst11(String est11) {
        this.est11 = est11;
    }

    public void setFinOcupacion11(double finOcupacion11) {
        this.finOcupacion11 = finOcupacion11;
    }

    public void setFinParquimetro11(double finParquimetro11) {
        this.finParquimetro11 = finParquimetro11;
    }

    public void setEst12(String est12) {
        this.est12 = est12;
    }



    public void setFinParquimetro12(double finParquimetro12) {
        this.finParquimetro12 = finParquimetro12;
    }

    public void setContVehiSinLugar(double contVehiSinLugar) {
        this.contVehiSinLugar = contVehiSinLugar;
    }

    public void setContVehiculos(double contVehiculos) {
        this.contVehiculos = contVehiculos;
    }

    public void setContInfracciones(double contInfracciones) {
        this.contInfracciones = contInfracciones;
    }

    public void setAcumTiempoInfracciones(double acumTiempoInfracciones) {
        this.acumTiempoInfracciones = acumTiempoInfracciones;
    }
    
    public double getReloj() {
        return reloj;
    }

    public double getRndLlegadaAutomovil() {
        return rndLlegadaAutomovil;
    }

    public double getTiempoLlegadaAutomovil() {
        return tiempoLlegadaAutomovil;
    }

    public double getProximaLlegada() {
        return proximaLlegada;
    }

    public double getRndParq() {
        return rndParq;
    }

    public double getTiempoParquimetro() {
        return tiempoParquimetro;
    }

    public double getRndOcup() {
        return rndOcup;
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

    public double getRndMonedas() {
        return rndMonedas;
    }

    public int getColocaMonedas() {
        return colocaMonedas;
    }

    public void setColocaMonedas(int colocaMonedas) {
        this.colocaMonedas = colocaMonedas;
    }


    

    public String getEst1() {
        return est1;
    }

    public double getFinOcupacion1() {
        return finOcupacion1;
    }

    public double getFinParquimetro1() {
        return finParquimetro1;
    }

    public String getEst2() {
        return est2;
    }

    public double getFinOcupacion2() {
        return finOcupacion2;
    }

    public double getFinParquimetro2() {
        return finParquimetro2;
    }

    public String getEst3() {
        return est3;
    }

    public double getFinOcupacion3() {
        return finOcupacion3;
    }

    public double getFinParquimetro3() {
        return finParquimetro3;
    }

    public String getEst4() {
        return est4;
    }

    public double getFinOcupacion4() {
        return finOcupacion4;
    }

    public double getFinParquimetro4() {
        return finParquimetro4;
    }

    public String getEst5() {
        return est5;
    }

    public double getFinOcupacion5() {
        return finOcupacion5;
    }

    public double getFinParquimetro5() {
        return finParquimetro5;
    }

    public String getEst6() {
        return est6;
    }

    public double getFinOcupacion6() {
        return finOcupacion6;
    }

    public double getFinParquimetro6() {
        return finParquimetro6;
    }

    public String getEst7() {
        return est7;
    }

    public double getFinOcupacion7() {
        return finOcupacion7;
    }

    public double getFinParquimetro7() {
        return finParquimetro7;
    }

    public String getEst8() {
        return est8;
    }

    public double getFinOcupacion8() {
        return finOcupacion8;
    }

    public double getFinParquimetro8() {
        return finParquimetro8;
    }

    public String getEst9() {
        return est9;
    }

    public double getFinOcupacion9() {
        return finOcupacion9;
    }

    public double getFinParquimetro9() {
        return finParquimetro9;
    }

    public String getEst10() {
        return est10;
    }

    public double getFinOcupacion10() {
        return finOcupacion10;
    }

    public double getFinParquimetro10() {
        return finParquimetro10;
    }

    public String getEst11() {
        return est11;
    }

    public double getFinOcupacion11() {
        return finOcupacion11;
    }

    public double getFinParquimetro11() {
        return finParquimetro11;
    }

    public String getEst12() {
        return est12;
    }

    public double getFinParquimetro12() {
        return finParquimetro12;
    }

    public double getContVehiSinLugar() {
        return contVehiSinLugar;
    }

    public double getContVehiculos() {
        return contVehiculos;
    }

    public double getContInfracciones() {
        return contInfracciones;
    }

    public double getAcumTiempoInfracciones() {
        return acumTiempoInfracciones;
    }

    
   
    
    
 
}

