package complejidades;

public class ComplejidadConstante {
    
    /*
    Complejidad: O(1)
        Razón:
        - El número de operaciones es fijo.
        - No depende del tamaño de los datos.
        - Siempre se ejecutan las mismas instrucciones.
        - No hay ciclos ni estructuras repetitivas.
    */

    public void ejemplo() {
        System.out.println("Ejemplo O(1):");

        int a = 10;
        int b = 20;
        int suma = a + b;

        System.out.println("La suma es: " + suma);
    }
}