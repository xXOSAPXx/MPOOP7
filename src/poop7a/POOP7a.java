/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7a;
import Color.Color;
import Animales.Ballena;
import Animales.Perro;
import Animales.Pajaro;
/**
 *
 * @author Galba
 */
public class POOP7a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Color color1= new Color("Amarillo", "#321238");
        Color colorCollar1= new Color("Rojo", "#162054");
        
        Ballena ballena1= new Ballena(15, 2, "Aimp3", "Pacifico", color1, "Prrr");
        
        ballena1.comer();
        System.out.println(ballena1.toString());
        ballena1.nadar();
        ballena1.hacerSonido(ballena1.getSonido());
        System.out.println("--------------------");
        
        Perro perro1= new Perro(colorCollar1, 4, "Firulais", "Perrera", color1, "Guau");
        perro1.comer();
        System.out.println(perro1.toString());
        perro1.correr();
        perro1.hacerSonido(perro1.getSonido());
        System.out.println("--------------------");
        
        Pajaro pajaro1= new Pajaro("Pico Ancho", 2, "Piolin", "Veterinaria", color1, "Pirru" );
        pajaro1.comer();
        System.out.println(pajaro1.toString());
        pajaro1.recolectarRamas();
        pajaro1.hacerSonido(pajaro1.getSonido());
        
        
        
        
    }
    
}
