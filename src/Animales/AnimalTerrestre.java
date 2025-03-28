/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import Color.Color;
/**
 * La clase AnimalTerrestre representa un animal que vive en tierra.
 * Extiende la clase Animal, heredando sus atributos y métodos principales.
 * 
 * Incluye una característica específica como el número de patas del animal,
 * así como métodos para simular su comportamiento en tierra.
 * 
 * Este paquete forma parte del paquete Animales e importa la clase Color
 * desde el paquete Color.
 * 
 * @author Galba
 */
public class AnimalTerrestre extends Animal {

    /**
     * Número de patas que tiene el animal terrestre.
     */
    private int numPatas;

    /**
     * Constructor vacío que inicializa un objeto de la clase AnimalTerrestre
     * sin valores específicos.
     */
    public AnimalTerrestre() {
    }

    /**
     * Constructor que inicializa un objeto de la clase AnimalTerrestre con
     * valores específicos, incluyendo atributos heredados.
     * 
     * @param numPatas Número de patas del animal terrestre.
     * @param nombre Nombre del animal.
     * @param lugarOrigen Lugar de origen del animal.
     * @param color Color del animal.
     * @param sonido Sonido característico del animal.
     */
    public AnimalTerrestre(int numPatas, String nombre, String lugarOrigen, Color color, String sonido) {
        super(nombre, lugarOrigen, color, sonido);
        this.numPatas = numPatas;
    }

    /**
     * Obtiene el número de patas del animal terrestre.
     * 
     * @return El número de patas del animal terrestre.
     */
    public int getNumPatas() {
        return numPatas;
    }

    /**
     * Establece el número de patas del animal terrestre.
     * 
     * @param numPatas El número de patas del animal terrestre.
     */
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    /**
     * Método que simula el acto de correr del animal terrestre.
     * Produce una salida en consola indicando que está corriendo.
     */
    public void correr() {
        System.out.println("Está corriendo.");
    }

    /**
     * Devuelve una representación en cadena de los atributos del animal terrestre,
     * incluyendo los atributos heredados de la clase Animal.
     * 
     * @return Cadena con la información del animal terrestre.
     */
    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numPatas=" + numPatas + '}' + super.toString();
    }
}
