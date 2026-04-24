package complejidades;

/* Complejidad Lineal-Logarítmica: O(n log n)
    Razón: Combina un recorrido completo (n) con una división constante 
    del problema (log n). Es el estándar de eficiencia para algoritmos 
    de ordenamiento modernos, logrando un equilibrio ideal entre 
    velocidad y cantidad de datos.
*/

public class ComplejidadNLogN {
    public void ejemploNLogN() {
        System.out.println("Ejemplo O(n log n):");
        int n = 8; 

        // Bucle externo Complejidad Lineal
        for (int i = 0; i < n; i++) {

            // Bucle interno Complejidad Logarítmica
            for (int j = n; j > 1; j = j / 2) {
                System.out.println("i=" + i + " | Dividiendo... ahora quedan: " + j);
            }
            System.out.println("-----------------");
        }
    }
}