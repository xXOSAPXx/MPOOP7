/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import Color.Color;

/**
 * La clase AnimalAereo representa un animal con la capacidad de volar.
 * Extiende la clase Animal, heredando sus atributos y métodos principales.
 * 
 * Además, agrega una característica específica como el número de alas.
 * 
 * Este paquete forma parte del paquete Animales e importa la clase Color
 * desde el paquete Color.
 * 
 * @author Galba
 */
public class AnimalAereo extends Animal {

    /**
     * Número de alas del animal aéreo.
     */
    private int numAlas;

    /**
     * Constructor vacío que inicializa un objeto de la clase AnimalAereo
     * sin valores específicos.
     */
    public AnimalAereo() {
    }

    /**
     * Constructor que inicializa un objeto de la clase AnimalAereo con
     * valores específicos, incluyendo atributos heredados.
     * 
     * @param numAlas Número de alas del animal aéreo.
     * @param nombre Nombre del animal.
     * @param lugarOrigen Lugar de origen del animal.
     * @param color Color del animal.
     * @param sonido Sonido característico del animal.
     */
    public AnimalAereo(int numAlas, String nombre, String lugarOrigen, Color color, String sonido) {
        super(nombre, lugarOrigen, color, sonido);
        this.numAlas = numAlas;
    }

    /**
     * Obtiene el número de alas del animal aéreo.
     * 
     * @return El número de alas del animal aéreo.
     */
    public int getNumAlas() {
        return numAlas;
    }

    /**
     * Establece el número de alas del animal aéreo.
     * 
     * @param numAlas El número de alas del animal aéreo.
     */
    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }

    /**
     * Método que simula el acto de volar del animal aéreo.
     * Produce una salida en consola indicando que está volando.
     */
    public void volar() {
        System.out.println("Está volando.");
    }

    /**
     * Devuelve una representación en cadena de los atributos del animal aéreo,
     * incluyendo los atributos heredados de la clase Animal.
     * 
     * @return Cadena con la información del animal aéreo.
     */
    @Override
    public String toString() {
        return "AnimalAereo{" + "numAlas=" + numAlas + '}' + super.toString();
    }
}
