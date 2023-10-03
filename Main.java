/**
 * Primera clase que es ejecutada
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Primer método que se ejecuta en mi aplicación
         * @param args
         *
         * Complejidad temporal: O(1) Constante
         */

        Celular miCelular = new Celular("Samsung", "Galaxy", "72");
        miCelular.prender();
        miCelular.reiniciar();



    }
}