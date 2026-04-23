package complejidades;

//     Razón: Ocurre cuando un algoritmo combina un proceso lineal (recorre todos los datos)
//     con uno logarítmico (divide el problema en partes más pequeñas). Es común en algoritmos
//     eficientes de ordenamiento como Merge Sort o Quick Sort, donde se recorren los elementos
//     mientras se los divide en mitades.

public class ComplejidadNLogN {
    public void ejemploNLogN() {
        System.out.println("Ejemplo O(n log n):");
        int n = 8; // Número de elementos
        
        
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