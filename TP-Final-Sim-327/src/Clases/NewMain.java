/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Eventos.Evento;
import Eventos.LlegadaAutomovil;
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
        LlegadaAutomovil l1 = new LlegadaAutomovil();
        l1.generarProxLlegada(0);
        
        LlegadaAutomovil l2 = new LlegadaAutomovil();
        l2.generarProxLlegada(200);
        
        ArrayList<Evento> eventos = new ArrayList();
        
        
        eventos.add(l2);
        eventos.add(l1);
        
        System.out.println("0 /" + eventos.get(0).getHoraEvento());
        System.out.println("1 /" + eventos.get(1).getHoraEvento());
        
        Collections.sort(eventos);
        
        System.out.println("0 / " + eventos.get(0).getHoraEvento());
        System.out.println("1 / " + eventos.get(1).getHoraEvento());
    }
    
}
