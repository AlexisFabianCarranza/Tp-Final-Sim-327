/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Eventos.Evento;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aleex
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ArrayList<Estacionamiento> ests = new ArrayList<>();
        Estacionamiento est1 = new Estacionamiento(1);
        Estacionamiento est2 = new Estacionamiento(2);
        Estacionamiento est3 = new Estacionamiento(3);
        Estacionamiento est4 = new Estacionamiento(4);
        Estacionamiento est5 = new Estacionamiento(5);
        est1.ponerLibre(0);
        est2.ponerLibre(0);
        est3.ponerConRemanente();
        est4.ponerOcupado();
        est5.ponerConRemanente();
        ests.add(est1);
        ests.add(est2);
        ests.add(est3);
        ests.add(est4);
        ests.add(est5);
        Collections.sort(ests);
        System.out.println(ests.get(0).getEstado() + " " + ests.get(0).getNumeroEstacionamiento());
        System.out.println(ests.get(1).getEstado() + " " + ests.get(1).getNumeroEstacionamiento());
        System.out.println(ests.get(2).getEstado() + " " + ests.get(2).getNumeroEstacionamiento());
        System.out.println(ests.get(3).getEstado() + " " + ests.get(3).getNumeroEstacionamiento());
        System.out.println(ests.get(4).getEstado() + " " + ests.get(4).getNumeroEstacionamiento());*/
        
        ArrayList<Evento> eventos = new ArrayList<>();
        Evento e1 = new Evento();
        Evento e2 = new Evento();
        Evento e3 = new Evento();
        Evento e4 = new Evento();
        e1.setHoraEvento(-1);
        e2.setHoraEvento(5);
        e3.setHoraEvento(7);
        e4.setHoraEvento(-1);
        eventos.add(e1);
        eventos.add(e2);
        eventos.add(e3);
        eventos.add(e4);
        
        Collections.sort(eventos);
        System.out.println("1: " + eventos.get(0).getHoraEvento());
        System.out.println("2: " + eventos.get(1).getHoraEvento());
        System.out.println("3: " + eventos.get(2).getHoraEvento());
        System.out.println("4: " + eventos.get(3).getHoraEvento());
        
        /*String s = "-1.00";
        ArrayList<String> strings = new ArrayList<String>();
        strings.add(s);
        if (strings.get(0) == "-1.00") {
            strings.get(0).replace("-1.00", "");
            strings.set(0, "");
            System.out.println(s);
            System.out.println(strings.get(0));
        }*/
    }
    
}
