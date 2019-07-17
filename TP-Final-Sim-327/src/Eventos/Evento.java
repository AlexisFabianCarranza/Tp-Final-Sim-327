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

    public double getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(double horaEvento) {
        this.horaEvento = horaEvento;
    }

    @Override
    public int compareTo(Object t) {
        Evento otro = (Evento) t;
        return Double.compare(otro.getHoraEvento(), this.horaEvento);
    }

    public String getEvento(){
      return "";
    }



}
