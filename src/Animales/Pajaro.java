/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import Color.Color;
/**
 * La clase Pajaro representa un pájaro como un animal aéreo con
 * características específicas, como el tipo de pico.
 * Extiende la clase AnimalAereo, heredando sus atributos y métodos principales.
 * 
 * Además, incluye comportamientos únicos como la capacidad de recolectar ramas.
 * 
 * Este paquete forma parte del paquete Animales e importa la clase Color
 * desde el paquete Color.
 * 
 * @author Galba
 */
public class Pajaro extends AnimalAereo {

    /**
     * Tipo de pico del pájaro, como "curvo", "recto", etc.
     */
    private String tipoPico;

    /**
     * Constructor vacío que inicializa un objeto de la clase Pajaro sin valores específicos.
     */
    public Pajaro() {
    }

    /**
     * Constructor que inicializa un objeto de la clase Pajaro con valores específicos,
     * incluyendo atributos heredados de AnimalAereo.
     * 
     * @param tipoPico Tipo de pico del pájaro.
     * @param numAlas Número de alas del pájaro.
     * @param nombre Nombre del pájaro.
     * @param lugarOrigen Lugar de origen del pájaro.
     * @param color Color del pájaro.
     * @param sonido Sonido característico del pájaro.
     */
    public Pajaro(String tipoPico, int numAlas, String nombre, String lugarOrigen, Color color, String sonido) {
        super(numAlas, nombre, lugarOrigen, color, sonido);
        this.tipoPico = tipoPico;
    }

    /**
     * Obtiene el tipo de pico del pájaro.
     * 
     * @return El tipo de pico del pájaro.
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * Establece el tipo de pico del pájaro.
     * 
     * @param tipoPico El tipo de pico del pájaro.
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    /**
     * Método que simula el acto de recolectar ramas por parte del pájaro.
     * Produce una salida en consola indicando que está recolectando ramas.
     */
    public void recolectarRamas() {
        System.out.println("Está recolectando ramas.");
    }

    /**
     * Devuelve una representación en cadena de los atributos del pájaro,
     * incluyendo los heredados de AnimalAereo.
     * 
     * @return Cadena con la información del pájaro.
     */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + '}' + super.toString();
    }
}
