import java.util.ArrayList;

public class FuncionesYTuplas {

    public static void main(String[] args) {
        
        // Ejemplo de multiplicación de elementos de dos arrays (equivalente a la tupla en Python)
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        ArrayList<Integer> c = new ArrayList<>();
        
        // Multiplicar los elementos correspondientes de a y b y almacenarlos en c
        for (int i = 0; i < a.length; i++) {
            c.add(a[i] * b[i]);
        }
        System.out.println(c);

        // Función 1: Definición y llamada
        mostrarTexto();

        // Función 2: Multiplicar 5 y 8 e imprimir el resultado
        multiplicar();

        // Función 3: Multiplicar con variables globales
        int aGlobal = 5;
        int bGlobal = 8;
        multiplicarConVariablesGlobales(aGlobal, bGlobal);

        // Función 4: Multiplicar con return y usar el resultado fuera de la función
        int resultado = multiplicarConReturn();
        System.out.println(resultado + 5);

        // Función 5: Validar si el valor de a es 5
        boolean dato = validarDato(aGlobal);
        System.out.println(dato);
    }

    // Función que imprime un texto
    public static void mostrarTexto() {
        System.out.println("Hola");
    }

    // Función que multiplica 5 por 8 e imprime el resultado
    public static void multiplicar() {
        int a = 5;
        int b = 8;
        System.out.println(a * b);
    }

    // Función que usa variables globales y las imprime
    public static void multiplicarConVariablesGlobales(int a, int b) {
        System.out.println(a * b);
    }

    // Función que devuelve el resultado de la multiplicación
    public static int multiplicarConReturn() {
        int a = 5;
        int b = 8;
        return a * b;
    }

    // Función que valida si el valor de a es igual a 5
    public static boolean validarDato(int a) {
        if (a == 5) {
            return true;
        } else {
            return false;
        }
    }
}



