/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Omar Ake Bellos
 */
public class Jugador {

    String club;
    String nombre;
    int dorsal;
    public static void main(String[] args) {
        Jugador jugador1=new Jugador();
        jugador1.club="Guadalajara";
        jugador1.nombre= "Fernando Beltrán";
        jugador1.dorsal=26;
        
        System.out.println("El jugador pertenece al "+jugador1.club);
        System.out.println("Se llama "+jugador1.nombre);
        System.out.println("Tiene el dorsal "+jugador1.dorsal);
    }
    
}
