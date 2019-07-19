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
    }
    
}
