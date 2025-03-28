/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;
import Color.Color;

/**
 * La clase AnimalAcuatico representa un animal que vive en el agua.
 * Extiende la clase Animal, heredando sus atributos y métodos.
 * 
 * Incluye información adicional sobre el número de aletas que posee
 * y métodos específicos como la capacidad de nadar.
 * 
 * Este paquete forma parte del paquete Animales e importa la clase Color
 * desde el paquete Color.
 * 
 * @author Galba
 */
public class AnimalAcuatico extends Animal {

    /**
     * Número de aletas que tiene el animal acuático.
     */
    private int numAletas;

    /**
     * Constructor vacío que inicializa un objeto de la clase AnimalAcuatico
     * sin valores específicos.
     */
    public AnimalAcuatico() {
    }

    /**
     * Constructor que inicializa un objeto de la clase AnimalAcuatico con
     * valores específicos, incluyendo los atributos heredados.
     * 
     * @param numAletas Número de aletas del animal acuático.
     * @param nombre Nombre del animal.
     * @param lugarOrigen Lugar de origen del animal.
     * @param color Color del animal.
     * @param sonido Sonido característico del animal.
     */
    public AnimalAcuatico(int numAletas, String nombre, String lugarOrigen, Color color, String sonido) {
        super(nombre, lugarOrigen, color, sonido);
        this.numAletas = numAletas;
    }

    /**
     * Obtiene el número de aletas del animal acuático.
     * 
     * @return El número de aletas del animal acuático.
     */
    public int getNumAletas() {
        return numAletas;
    }

    /**
     * Establece el número de aletas del animal acuático.
     * 
     * @param numAletas El número de aletas del animal acuático.
     */
    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    /**
     * Método que simula el acto de nadar del animal acuático.
     * Produce una salida en consola indicando que está nadando.
     */
    public void nadar() {
        System.out.println("Está nadando.");
    }

    /**
     * Devuelve una representación en cadena de los atributos del animal acuático,
     * incluyendo los heredados de la clase Animal.
     * 
     * @return Cadena con la información del animal acuático.
     */
    @Override
    public String toString() {
        return "AnimalAcuatico{" + "numAletas=" + numAletas + '}' + super.toString();
    }
}
