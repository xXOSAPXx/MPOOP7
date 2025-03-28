/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import Color.Color;
/**
 * La clase Ballena representa una ballena como un animal acuático con 
 * características específicas, como su longitud.
 * Extiende la clase AnimalAcuatico, heredando sus atributos y métodos principales.
 * 
 * Además, incluye comportamientos únicos como la interacción lúdica 
 * con el personaje "Pinocho".
 * 
 * Este paquete forma parte del paquete Animales e importa la clase Color
 * desde el paquete Color.
 * 
 * @author Galba
 */
public class Ballena extends AnimalAcuatico {

    /**
     * Longitud de la ballena en metros.
     */
    int largo;

    /**
     * Constructor vacío que inicializa un objeto de la clase Ballena sin valores específicos.
     */
    public Ballena() {
    }

    /**
     * Constructor que inicializa un objeto de la clase Ballena con valores específicos,
     * incluyendo atributos heredados de AnimalAcuatico.
     * 
     * @param largo Longitud de la ballena.
     * @param numAletas Número de aletas de la ballena.
     * @param nombre Nombre de la ballena.
     * @param lugarOrigen Lugar de origen de la ballena.
     * @param color Color de la ballena.
     * @param sonido Sonido característico de la ballena.
     */
    public Ballena(int largo, int numAletas, String nombre, String lugarOrigen, Color color, String sonido) {
        super(numAletas, nombre, lugarOrigen, color, sonido);
        this.largo = largo;
    }

    /**
     * Obtiene la longitud de la ballena.
     * 
     * @return La longitud de la ballena en metros.
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Establece la longitud de la ballena.
     * 
     * @param largo La longitud de la ballena en metros.
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    /**
     * Método que simula un evento donde la ballena interactúa 
     * con el personaje ficticio "Pinocho".
     * Produce una salida en consola relacionada con esta interacción.
     */
    public void pelearConPinocho() {
        System.out.println("Se papearon a Pinocho.");
    }

    /**
     * Devuelve una representación en cadena de los atributos de la ballena,
     * incluyendo los atributos heredados de AnimalAcuatico.
     * 
     * @return Cadena con la información de la ballena.
     */
    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + '}' + super.toString();
    }
}
