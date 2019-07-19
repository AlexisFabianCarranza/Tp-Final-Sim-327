/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Eventos.Evento;
import java.util.ArrayList;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author aleex
 */
public class VectorEstadoView {
    private ArrayList<String> strings;
    private String reloj;
    //Llegada de automovil
    private String rndLlegadaAutomovil;
    private String tiempoLlegadaAutomovil;
    private String proximaLlegada;
    //Tiempo Parquimetro
    private String rndParq;
    private String tiempoParquimetro;
    //Tiempo Parquimetro
    private String rndOcup;
    private String tiempoOcupacion1;
    private String tiempoOcupacion2;
    private String tiempoOcupacion3;
    //Coloca Monedas
    private String rndMonedas;
    private String colocaMonedas;
    //Estacionamientos
    private String est1;
    private String finOcupacion1;
    private String finParquimetro1;
    private String est2;
    private String finOcupacion2;
    private String finParquimetro2;
    private String est3;
    private String finOcupacion3;
    private String finParquimetro3;
    private String est4;
    private String finOcupacion4;
    private String finParquimetro4;
    private String est5;
    private String finOcupacion5;
    private String finParquimetro5;
    private String est6;
    private String finOcupacion6;
    private String finParquimetro6;
    private String est7;
    private String finOcupacion7;
    private String finParquimetro7;
    private String est8;
    private String finOcupacion8;
    private String finParquimetro8;
    private String est9;
    private String finOcupacion9;
    private String finParquimetro9;
    private String est10;
    private String finOcupacion10;
    private String finParquimetro10;
    private String est11;
    private String finOcupacion11;
    private String finParquimetro11;
    private String est12;
    private String finOcupacion12;
    private String finParquimetro12;
    //Contadores
    private String contVehiSinLugar;
    private String contVehiculos;
    private String contInfracciones;
    private String acumTiempoInfracciones;

    public VectorEstadoView(VectorEstado v) {
        this.reloj = String.format("%.2f", v.getReloj());
        this.rndLlegadaAutomovil = String.format("%.2f", v.getRndLlegadaAutomovil());
        this.tiempoLlegadaAutomovil = String.format("%.2f", v.getTiempoLlegadaAutomovil());
        this.proximaLlegada = String.format("%.2f", v.getProximaLlegada());
        this.rndParq = String.format("%.2f", v.getRndParq());
        this.tiempoParquimetro = String.format("%.2f", v.getTiempoParquimetro());
        this.rndOcup = String.format("%.2f", v.getRndOcup());
        this.tiempoOcupacion1 = String.format("%.2f", v.getTiempoOcupacion1());
        this.tiempoOcupacion2 = String.format("%.2f", v.getTiempoOcupacion2());
        this.tiempoOcupacion3 = String.format("%.2f", v.getTiempoOcupacion3());
        this.rndMonedas = String.format("%.2f", v.getRndMonedas());
        this.colocaMonedas = v.getColocaMonedas() == 1 ? "SI": "NO";
        this.est1 = v.getEst1();
        this.finOcupacion1 = String.format("%.2f", v.getFinOcupacion1());
        this.finParquimetro1 = String.format("%.2f", v.getFinParquimetro1());
        this.est2 = v.getEst2();
        this.finOcupacion2 = String.format("%.2f", v.getFinOcupacion2());
        this.finParquimetro2 = String.format("%.2f", v.getFinParquimetro2());
        this.est3 = v.getEst3();
        this.finOcupacion3 = String.format("%.2f", v.getFinOcupacion3());
        this.finParquimetro3 = String.format("%.2f", v.getFinParquimetro3());
        this.est4 = v.getEst4();
        this.finOcupacion4 = String.format("%.2f", v.getFinOcupacion4());
        this.finParquimetro4 = String.format("%.2f", v.getFinParquimetro4());
        this.est5 = v.getEst5();
        this.finOcupacion5 = String.format("%.2f", v.getFinOcupacion5());
        this.finParquimetro5 = String.format("%.2f", v.getFinParquimetro5());
        this.est6 = v.getEst6();
        this.finOcupacion6 = String.format("%.2f", v.getFinOcupacion6());
        this.finParquimetro6 = String.format("%.2f", v.getFinParquimetro6());
        this.est7 = v.getEst7();
        this.finOcupacion7 = String.format("%.2f", v.getFinOcupacion7());
        this.finParquimetro7 = String.format("%.2f", v.getFinParquimetro7());
        this.est8 = v.getEst8();
        this.finOcupacion8 = String.format("%.2f", v.getFinOcupacion8());
        this.finParquimetro8 = String.format("%.2f", v.getFinParquimetro8());
        this.est9 = v.getEst9();
        this.finOcupacion9 = String.format("%.2f", v.getFinOcupacion9());
        this.finParquimetro9 = String.format("%.2f", v.getFinParquimetro9());
        this.est10 = v.getEst10();
        this.finOcupacion10 = String.format("%.2f", v.getFinOcupacion10());
        this.finParquimetro10 = String.format("%.2f", v.getFinParquimetro10());
        this.est11 = v.getEst11();
        this.finOcupacion11 = String.format("%.2f", v.getFinOcupacion11());
        this.finParquimetro11 = String.format("%.2f", v.getFinParquimetro11());
        this.est12 = v.getEst12();
        this.finOcupacion12 = String.format("%.2f", v.getFinOcupacion12());
        this.finParquimetro12 = String.format("%.2f", v.getFinParquimetro12());
        this.contVehiSinLugar = String.valueOf(v.getContVehiSinLugar());
        this.contVehiculos = String.valueOf(v.getContVehiculos());
        this.contInfracciones = String.valueOf(v.getContInfracciones());
        this.acumTiempoInfracciones = String.format("%.2f", v.getAcumTiempoInfracciones());
        /*this.strings = new ArrayList<>();
        this.strings.add(this.acumTiempoInfracciones);
        this.strings.add(this.colocaMonedas);
        this.strings.add(this.contInfracciones);
        this.strings.add(this.contVehiSinLugar);
        this.strings.add(this.contVehiculos);
        this.strings.add(this.est1);
        this.strings.add(this.est10);
        this.strings.add(this.est11);
        this.strings.add(this.est12);
        this.strings.add(this.est2);
        this.strings.add(this.est3);
        this.strings.add(this.est4);
        this.strings.add(this.est5);
        this.strings.add(this.est6);
        this.strings.add(this.est7);
        this.strings.add(this.est8);
        this.strings.add(this.est9);
        this.strings.add(this.finOcupacion1);
        this.strings.add(this.finOcupacion2);
        this.strings.add(this.finOcupacion3);
        this.strings.add(this.finOcupacion4);
        this.strings.add(this.finOcupacion5);
        this.strings.add(this.finOcupacion6);
        this.strings.add(this.finOcupacion7);
        this.strings.add(this.finOcupacion8);
        this.strings.add(this.finOcupacion9);
        this.strings.add(this.finOcupacion10);
        this.strings.add(this.finOcupacion11);
        this.strings.add(this.finOcupacion12);
        this.strings.add(this.finParquimetro1);
        this.strings.add(this.finParquimetro2);
        this.strings.add(this.finParquimetro3);
        this.strings.add(this.finParquimetro4);
        this.strings.add(this.finParquimetro5);
        this.strings.add(this.finParquimetro6);
        this.strings.add(this.finParquimetro7);
        this.strings.add(this.finParquimetro8);
        this.strings.add(this.finParquimetro9);
        this.strings.add(this.finParquimetro10);
        this.strings.add(this.finParquimetro11);
        this.strings.add(this.finParquimetro12);
        this.strings.add(this.proximaLlegada);
        this.strings.add(this.rndLlegadaAutomovil);
        this.strings.add(this.rndMonedas);
        this.strings.add(this.rndOcup);
        this.strings.add(this.rndParq);
        this.strings.add(this.tiempoLlegadaAutomovil);
        this.strings.add(this.tiempoOcupacion1);
        this.strings.add(this.tiempoOcupacion2);
        this.strings.add(this.tiempoOcupacion3);
        this.strings.add(this.tiempoParquimetro);*/
 
    }
    
    public String getReloj() {
        return reloj;
    }

    public void setReloj(String reloj) {
        this.reloj = reloj;
    }

    public void setRndLlegadaAutomovil(String rndLlegadaAutomovil) {
        this.rndLlegadaAutomovil = rndLlegadaAutomovil;
    }

    public void setTiempoLlegadaAutomovil(String tiempoLlegadaAutomovil) {
        this.tiempoLlegadaAutomovil = tiempoLlegadaAutomovil;
    }

    public void setProximaLlegada(String proximaLlegada) {
        this.proximaLlegada = proximaLlegada;
    }

    public void setRndParq(String rndParq) {
        this.rndParq = rndParq;
    }

    public void setTiempoParquimetro(String tiempoParquimetro) {
        this.tiempoParquimetro = tiempoParquimetro;
    }

    public void setRndOcup(String rndOcup) {
        this.rndOcup = rndOcup;
    }

    public void setTiempoOcupacion1(String tiempoOcupacion1) {
        this.tiempoOcupacion1 = tiempoOcupacion1;
    }

    public void setTiempoOcupacion2(String tiempoOcupacion2) {
        this.tiempoOcupacion2 = tiempoOcupacion2;
    }

    public void setTiempoOcupacion3(String tiempoOcupacion3) {
        this.tiempoOcupacion3 = tiempoOcupacion3;
    }

    public void setRndMonedas(String rndMonedas) {
        this.rndMonedas = rndMonedas;
    }

    public void setColocaMonedas(String colocaMonedas) {
        this.colocaMonedas = colocaMonedas;
    }

    public void setEst1(String est1) {
        this.est1 = est1;
    }

    public void setFinOcupacion1(String finOcupacion1) {
        this.finOcupacion1 = finOcupacion1;
    }

    public void setFinParquimetro1(String finParquimetro1) {
        this.finParquimetro1 = finParquimetro1;
    }

    public void setEst2(String est2) {
        this.est2 = est2;
    }

    public void setFinOcupacion2(String finOcupacion2) {
        this.finOcupacion2 = finOcupacion2;
    }

    public void setFinParquimetro2(String finParquimetro2) {
        this.finParquimetro2 = finParquimetro2;
    }

    public void setEst3(String est3) {
        this.est3 = est3;
    }

    public void setFinOcupacion3(String finOcupacion3) {
        this.finOcupacion3 = finOcupacion3;
    }

    public void setFinParquimetro3(String finParquimetro3) {
        this.finParquimetro3 = finParquimetro3;
    }

    public void setEst4(String est4) {
        this.est4 = est4;
    }

    public void setFinOcupacion4(String finOcupacion4) {
        this.finOcupacion4 = finOcupacion4;
    }

    public void setFinParquimetro4(String finParquimetro4) {
        this.finParquimetro4 = finParquimetro4;
    }

    public void setEst5(String est5) {
        this.est5 = est5;
    }

    public void setFinOcupacion5(String finOcupacion5) {
        this.finOcupacion5 = finOcupacion5;
    }

    public void setFinParquimetro5(String finParquimetro5) {
        this.finParquimetro5 = finParquimetro5;
    }

    public void setEst6(String est6) {
        this.est6 = est6;
    }

    public void setFinOcupacion6(String finOcupacion6) {
        this.finOcupacion6 = finOcupacion6;
    }

    public void setFinParquimetro6(String finParquimetro6) {
        this.finParquimetro6 = finParquimetro6;
    }

    public void setEst7(String est7) {
        this.est7 = est7;
    }

    public void setFinOcupacion7(String finOcupacion7) {
        this.finOcupacion7 = finOcupacion7;
    }

    public void setFinParquimetro7(String finParquimetro7) {
        this.finParquimetro7 = finParquimetro7;
    }

    public void setEst8(String est8) {
        this.est8 = est8;
    }

    public void setFinOcupacion8(String finOcupacion8) {
        this.finOcupacion8 = finOcupacion8;
    }

    public void setFinParquimetro8(String finParquimetro8) {
        this.finParquimetro8 = finParquimetro8;
    }

    public void setEst9(String est9) {
        this.est9 = est9;
    }

    public void setFinOcupacion9(String finOcupacion9) {
        this.finOcupacion9 = finOcupacion9;
    }

    public void setFinParquimetro9(String finParquimetro9) {
        this.finParquimetro9 = finParquimetro9;
    }

    public void setEst10(String est10) {
        this.est10 = est10;
    }

    public void setFinOcupacion10(String finOcupacion10) {
        this.finOcupacion10 = finOcupacion10;
    }

    public void setFinParquimetro10(String finParquimetro10) {
        this.finParquimetro10 = finParquimetro10;
    }

    public void setEst11(String est11) {
        this.est11 = est11;
    }

    public void setFinOcupacion11(String finOcupacion11) {
        this.finOcupacion11 = finOcupacion11;
    }

    public void setFinParquimetro11(String finParquimetro11) {
        this.finParquimetro11 = finParquimetro11;
    }

    public void setEst12(String est12) {
        this.est12 = est12;
    }

    public void setFinOcupacion12(String finOcupacion12) {
        this.finOcupacion12 = finOcupacion12;
    }

    public void setFinParquimetro12(String finParquimetro12) {
        this.finParquimetro12 = finParquimetro12;
    }

    public void setContVehiSinLugar(String contVehiSinLugar) {
        this.contVehiSinLugar = contVehiSinLugar;
    }

    public void setContVehiculos(String contVehiculos) {
        this.contVehiculos = contVehiculos;
    }

    public void setContInfracciones(String contInfracciones) {
        this.contInfracciones = contInfracciones;
    }

    public void setAcumTiempoInfracciones(String acumTiempoInfracciones) {
        this.acumTiempoInfracciones = acumTiempoInfracciones;
    }
    
    public String getRndLlegadaAutomovil() {
        return rndLlegadaAutomovil;
    }

    public String getTiempoLlegadaAutomovil() {
        return tiempoLlegadaAutomovil;
    }

    public String getProximaLlegada() {
        return proximaLlegada;
    }

    public String getRndParq() {
        return rndParq;
    }

    public String getTiempoParquimetro() {
        return tiempoParquimetro;
    }

    public String getRndOcup() {
        return rndOcup;
    }

    public String getTiempoOcupacion1() {
        return tiempoOcupacion1;
    }

    public String getTiempoOcupacion2() {
        return tiempoOcupacion2;
    }

    public String getTiempoOcupacion3() {
        return tiempoOcupacion3;
    }

    public String getRndMonedas() {
        return rndMonedas;
    }

    public String getColocaMonedas() {
        return colocaMonedas;
    }

    public String getEst1() {
        return est1;
    }

    public String getFinOcupacion1() {
        return finOcupacion1;
    }

    public String getFinParquimetro1() {
        return finParquimetro1;
    }

    public String getEst2() {
        return est2;
    }

    public String getFinOcupacion2() {
        return finOcupacion2;
    }

    public String getFinParquimetro2() {
        return finParquimetro2;
    }

    public String getEst3() {
        return est3;
    }

    public String getFinOcupacion3() {
        return finOcupacion3;
    }

    public String getFinParquimetro3() {
        return finParquimetro3;
    }

    public String getEst4() {
        return est4;
    }

    public String getFinOcupacion4() {
        return finOcupacion4;
    }

    public String getFinParquimetro4() {
        return finParquimetro4;
    }

    public String getEst5() {
        return est5;
    }

    public String getFinOcupacion5() {
        return finOcupacion5;
    }

    public String getFinParquimetro5() {
        return finParquimetro5;
    }

    public String getEst6() {
        return est6;
    }

    public String getFinOcupacion6() {
        return finOcupacion6;
    }

    public String getFinParquimetro6() {
        return finParquimetro6;
    }

    public String getEst7() {
        return est7;
    }

    public String getFinOcupacion7() {
        return finOcupacion7;
    }

    public String getFinParquimetro7() {
        return finParquimetro7;
    }

    public String getEst8() {
        return est8;
    }

    public String getFinOcupacion8() {
        return finOcupacion8;
    }

    public String getFinParquimetro8() {
        return finParquimetro8;
    }

    public String getEst9() {
        return est9;
    }

    public String getFinOcupacion9() {
        return finOcupacion9;
    }

    public String getFinParquimetro9() {
        return finParquimetro9;
    }

    public String getEst10() {
        return est10;
    }

    public String getFinOcupacion10() {
        return finOcupacion10;
    }

    public String getFinParquimetro10() {
        return finParquimetro10;
    }

    public String getEst11() {
        return est11;
    }

    public String getFinOcupacion11() {
        return finOcupacion11;
    }

    public String getFinParquimetro11() {
        return finParquimetro11;
    }

    public String getEst12() {
        return est12;
    }

    public String getFinOcupacion12() {
        return finOcupacion12;
    }

    public String getFinParquimetro12() {
        return finParquimetro12;
    }

    public String getContVehiSinLugar() {
        return contVehiSinLugar;
    }

    public String getContVehiculos() {
        return contVehiculos;
    }

    public String getContInfracciones() {
        return contInfracciones;
    }

    public String getAcumTiempoInfracciones() {
        return acumTiempoInfracciones;
    }
    
    
}