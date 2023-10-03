/**
 * Clase Celular
 */
public class Celular {
    /*****************/
    /******* Atributos *******/
    /*****************/
    String marca;
    String modelo;
    String numeroDeSerie;

    /*****************/
    /******* Métodos *******/
    /*****************/

    /**
     * Constructor de la clase Carro: Inicializa los atributos de mi clase
     * @param marca
     * @param modelo
     * @param numeroDeSerie
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Celular(String marca, String modelo, String numeroDeSerie){
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;

    }

    /**
     * Método que prende el celular
     * @return boolean: Indica si el celular prendió
     *
     * Complejidad temporal: O(1) Constante
     */
    boolean prender(){
        System.out.println("Celular prendiendo... Celular prendido!");
        return true;
    }

    /**
     * Método que reinicia el celular
     * @return boolean: Indica si el celular se reinició
     *
     * Complejidad temporal: O(1)  Constante
     */
    boolean reiniciar(){
        System.out.println("El celular se está reiniciando");
        return true;
    }
}