/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

/**
 *
 * @author aleex
 */
public class Evento implements Comparable{

    private double horaEvento;

    public Evento() {
        this.horaEvento = -1;
    }

    
    public double getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(double horaEvento) {
        this.horaEvento = horaEvento;
    }

    @Override
    public int compareTo(Object t) {
        Evento otro = (Evento) t;
        double horaEvento1 = this.getHoraEvento();
        double horaEvento2 = otro.getHoraEvento();
        if (horaEvento1 <= 0) { 
            horaEvento1 += 999999999;
        }
        if (horaEvento2 <= 0) {
            horaEvento2 += 999999999;
        }
        return Double.compare(horaEvento1, horaEvento2);
    }
    
    public String getEvento(){
      return "";
    }



}
