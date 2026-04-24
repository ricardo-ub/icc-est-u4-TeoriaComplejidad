package complejidades;

/* Peor Caso de NlogN: O(n log n)
    Razón: En algoritmos estables como Merge Sort, el peor escenario 
    requiere la misma cantidad de divisiones que el promedio. Esto 
    garantiza que el programa nunca se vuelva lento, incluso con 
    los datos en el peor orden posible.
*/

public class ComplejidadPeorCaso {
    public void ejemploNLogN() {
        System.out.println("Ejemplo O(n log n):");
        int n = 8;
        
        
        for (int i = 0; i < n; i++) {
            int j = n;
            // Bucle lineal (n)
            
            
            while (j > 1) {
                System.out.println("i=" + i + " | Dividiendo... ahora quedan: " + j);
                j = j / 2;
                // Bucle logarítmico (log n)
            }
        }
    }
}