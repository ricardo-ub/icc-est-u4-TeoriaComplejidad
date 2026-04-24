package complejidades;

/* Complejidad Cuadrática: O(n^2)
    Razón: Ocurre cuando el tiempo de ejecución crece al cuadrado del 
    tamaño de la entrada. Esto sucede principalmente cuando hay bucles 
    anidados (un ciclo dentro de otro). Se vuelve ineficiente con muchos 
    datos porque el número de tareas aumenta drásticamente.
 */

public class ComplejidadCuadratica {
    public void ejemploCuadratico() {
        System.out.println("Ejemplo O(n^2):");
        int n = 3; // Tamaño de la entrada
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }   
}