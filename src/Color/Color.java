/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Color;
/**
 * La clase Color representa un color, incluyendo su nombre y su código asociado.
 * 
 * Esta clase permite gestionar información básica de un color, como el nombre
 * descriptivo y un código (por ejemplo, un código hexadecimal).
 * 
 * Este paquete forma parte del paquete Color.
 * 
 * @author Galba
 */
public class Color {

    /**
     * Nombre descriptivo del color (por ejemplo, "Rojo").
     */
    private String colorName;

    /**
     * Código representativo del color (por ejemplo, código hexadecimal "#FF0000").
     */
    private String colorCode;

    /**
     * Constructor vacío que inicializa un objeto de la clase Color sin valores específicos.
     */
    public Color() {
    }

    /**
     * Constructor que inicializa un objeto de la clase Color con valores específicos.
     * 
     * @param colorName Nombre del color.
     * @param colorCode Código representativo del color.
     */
    public Color(String colorName, String colorCode) {
        this.colorName = colorName;
        this.colorCode = colorCode;
    }

    /**
     * Obtiene el nombre descriptivo del color.
     * 
     * @return El nombre del color.
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Obtiene el código representativo del color.
     * 
     * @return El código del color.
     */
    public String getColorCode() {
        return colorCode;
    }

    /**
     * Establece el nombre descriptivo del color.
     * 
     * @param colorName El nombre del color.
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    /**
     * Establece el código representativo del color.
     * 
     * @param colorCode El código del color.
     */
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
}
