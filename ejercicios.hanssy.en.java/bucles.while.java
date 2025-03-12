import java.util.Scanner;

public class ContadorYValidacion {
    public static void main(String[] args) {
        
        // Primer bloque: Contador con while
        int contador = 0;
        while (contador < 30) {
            contador++;
            System.out.println("Iteración " + contador);
        }
        
        // Segundo bloque: Combinado con if-else
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Introduzca un valor mayor a 10:");
            int a = scanner.nextInt();
            
            if (a > 10) {
                System.out.println("Es correcto");
            } else {
                System.out.println("Es incorrecto, pruebe de nuevo");
                break;  // Sale del ciclo while si el valor ingresado es incorrecto
            }
        }
        
        scanner.close();  // Cierra el scanner al final
    }
}