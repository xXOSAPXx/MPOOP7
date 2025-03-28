/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;
import Color.Color;
/**
 *
 * @author Galba
 */
/**
 * La clase Animal representa un animal con atributos básicos como nombre,
 * lugar de origen, color y sonido característico.
 * 
 * Este paquete forma parte del paquete Animales e importa la clase Color
 * desde el paquete Color.
 * 
 * @author Galba
 */
public class Animal {

    /**
     * Nombre del animal.
     */
    private String nombre;

    /**
     * Lugar de origen del animal.
     */
    private String lugarOrigen;

    /**
     * Color del animal, representado por la clase Color.
     */
    private Color color;

    /**
     * Sonido característico del animal.
     */
    private String sonido;

    /**
     * Constructor vacío que inicializa un objeto de la clase Animal sin
     * valores específicos.
     */
    public Animal() {
    }

    /**
     * Constructor que inicializa un objeto de la clase Animal con valores
     * específicos.
     * 
     * @param nombre Nombre del animal.
     * @param lugarOrigen Lugar de origen del animal.
     * @param color Color del animal.
     * @param sonido Sonido característico del animal.
     */
    public Animal(String nombre, String lugarOrigen, Color color, String sonido) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
        this.sonido = sonido;
    }

    /**
     * Obtiene el sonido característico del animal.
     * 
     * @return El sonido del animal.
     */
    public String getSonido() {
        return sonido;
    }

    /**
     * Establece el sonido característico del animal.
     * 
     * @param sonido El sonido del animal.
     */
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    /**
     * Obtiene el nombre del animal.
     * 
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del animal.
     * 
     * @param nombre El nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el lugar de origen del animal.
     * 
     * @return El lugar de origen del animal.
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * Establece el lugar de origen del animal.
     * 
     * @param lugarOrigen El lugar de origen del animal.
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Obtiene el color del animal.
     * 
     * @return El color del animal.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Establece el color del animal.
     * 
     * @param color El color del animal.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Realiza el sonido característico del animal.
     * 
     * @param sonido El sonido que se desea que el animal haga.
     */
    public void hacerSonido(String sonido) {
        System.out.println(sonido);
    }

    /**
     * Acción de alimentarse, con una salida descriptiva.
     */
    public void comer() {
        System.out.println(nombre + " está alimentándose...");
    }

    /**
     * Devuelve una representación en cadena de los atributos del animal.
     * 
     * @return Cadena con la información del animal.
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen
                + ", color=" + color.getColorName() + color.getColorCode()
                + ", sonido=" + sonido + '}';
    }
}