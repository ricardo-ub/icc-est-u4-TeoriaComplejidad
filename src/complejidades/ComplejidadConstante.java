package complejidades;

/*
     * Complejidad: O(1)
     * Razón: Siempre se ejecutan las mismas instrucciones,
     * no importa el tamaño de los datos.
*/

public class ComplejidadConstante {
    public void ejemplo() {
        System.out.println("Ejemplo O(1):");

        int a = 10;
        int b = 20;
        int suma = a + b;

        System.out.println("La suma es: " + suma);
    }
}