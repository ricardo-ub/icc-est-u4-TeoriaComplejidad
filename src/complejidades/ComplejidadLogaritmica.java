package complejidades;

/* Complejidad Logarítmica: O(log n)
    Razón: Ocurre cuando el algoritmo divide el problema a la mitad 
    en cada paso. Es muy eficiente porque, a medida que aumentan los 
    datos, el número de operaciones crece muy poco, permitiendo manejar 
    grandes volúmenes de información rápidamente.
*/

public class ComplejidadLogaritmica {
    public void ejemploLogaritmico() {
        System.out.println("Ejemplo O(log n):");
        int n = 32; // Empezamos con 32 elementos
        
        //i se divide entre 2 en cada vuelta
        for (int i = n ; i>1 ; i = i/2) {
            System.out.println("Dividiendo... ahora quedan: " + i);
        }
    }
}