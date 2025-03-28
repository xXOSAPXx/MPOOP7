/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;
import Color.Color;
/**
 * La clase Perro representa un perro como un animal terrestre con
 * características específicas, como el color de su collar.
 * Extiende la clase AnimalTerrestre, heredando sus atributos y métodos principales.
 * 
 * Además, incluye comportamientos únicos como la capacidad de hacer trucos.
 * 
 * Este paquete forma parte del paquete Animales e importa la clase Color
 * desde el paquete Color.
 * 
 * @author Galba
 */
public class Perro extends AnimalTerrestre {

    /**
     * Color del collar que lleva el perro.
     * Representado por una instancia de la clase Color.
     */
    private Color colorCollar;

    /**
     * Constructor vacío que inicializa un objeto de la clase Perro sin valores específicos.
     */
    public Perro() {
    }

    /**
     * Constructor que inicializa un objeto de la clase Perro con valores específicos,
     * incluyendo atributos heredados de AnimalTerrestre.
     * 
     * @param colorCollar Color del collar del perro.
     * @param numPatas Número de patas del perro.
     * @param nombre Nombre del perro.
     * @param lugarOrigen Lugar de origen del perro.
     * @param color Color del perro.
     * @param sonido Sonido característico del perro.
     */
    public Perro(Color colorCollar, int numPatas, String nombre, String lugarOrigen, Color color, String sonido) {
        super(numPatas, nombre, lugarOrigen, color, sonido);
        this.colorCollar = colorCollar;
    }

    /**
     * Obtiene el color del collar del perro.
     * 
     * @return El color del collar del perro.
     */
    public Color getColorCollar() {
        return colorCollar;
    }

    /**
     * Establece el color del collar del perro.
     * 
     * @param colorCollar El color del collar del perro.
     */
    public void setColorCollar(Color colorCollar) {
        this.colorCollar = colorCollar;
    }

    /**
     * Método que simula el acto de hacer trucos por parte del perro.
     * Produce una salida en consola indicando que el perro ha realizado un truco.
     */
    public void hacerTrucos() {
        System.out.println("Hizo un truco.");
    }

    /**
     * Devuelve una representación en cadena de los atributos del perro,
     * incluyendo el color del collar y los atributos heredados de AnimalTerrestre.
     * 
     * @return Cadena con la información del perro.
     */
    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar.getColorName() + '}' + super.toString();
    }
}