package complejidades;

public class ComplejidadLineal {

    /*
    Complejidad: O(n)
        Razón:
        - El número de operaciones depende del tamaño del arreglo.
        - Existe un ciclo que recorre todos los elementos.
        - Si aumenta n, aumentan las iteraciones.
        - El crecimiento es proporcional.
    */

    public void ejemplo() {
        System.out.println("Ejemplo O(n):");

        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }
    }
}