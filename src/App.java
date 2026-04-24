import complejidades.ComplejidadConstante;
import complejidades.ComplejidadLineal;
import complejidades.ComplejidadCuadratica;
import complejidades.ComplejidadLogaritmica;
import complejidades.ComplejidadNLogN;
import complejidades.ComplejidadPeorCaso;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TODAS LAS COMPLEJIDADES: ");
        System.out.println("");

        ComplejidadConstante c1 = new ComplejidadConstante();
        c1.ejemplo();

        ComplejidadLineal c2 = new ComplejidadLineal();
        c2.ejemplo();

        ComplejidadCuadratica c3 = new ComplejidadCuadratica();
        c3.ejemploCuadratico();

        ComplejidadLogaritmica c4 = new ComplejidadLogaritmica();
        c4.ejemploLogaritmico();

        ComplejidadNLogN c5 = new ComplejidadNLogN();
        c5.ejemploNLogN();

        ComplejidadPeorCaso c6 = new ComplejidadPeorCaso();
        c6.ejemploNLogN();
    }
}