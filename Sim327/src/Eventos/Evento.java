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

    /*@Override
    public int compareTo(Object t) {
        Evento otro = (Evento) t;
        int result = -2000;
        if (this.getHoraEvento() > 0.0 && otro.getHoraEvento() > 0.0 ){
            result = Double.compare(this.getHoraEvento(), otro.getHoraEvento());
        }
        if (this.getHoraEvento() > 0.0 && otro.getHoraEvento() <= 0.0){
            result = 1;
        }
        else if (otro.getHoraEvento() > 0.0 && this.getHoraEvento() <= 0.0){
            result = -1;
        }
        System.out.println("1) " + this.getHoraEvento());
        System.out.println("2) " + otro.getHoraEvento());
        System.out.println("result " + result);
        return result;
    }*/
    @Override
    public int compareTo(Object t) {
        Evento otro = (Evento) t;
        double horaEvento1 = this.getHoraEvento();
        double horaEvento2 = otro.getHoraEvento();
        if (horaEvento1 <= 0) { 
            horaEvento1 += 99999999;
        }
        if (horaEvento2 <= 0) {
            horaEvento2 += 99999999;
        }
        return Double.compare(horaEvento1, horaEvento2);
    }

    public String getEvento(){
      return "";
    }



}
