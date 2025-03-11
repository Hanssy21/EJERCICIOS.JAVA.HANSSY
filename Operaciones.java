import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        // Crear el objeto Scanner para obtener entradas del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar y leer los valores de A y B
        System.out.print("Ingrese valor para A: ");
        int A = scanner.nextInt();
        System.out.print("Ingrese valor para B: ");
        int B = scanner.nextInt();
        
        // Realizar las operaciones
        int suma = A + B;
        System.out.println("La suma de los números es: " + suma);
        
        int res = A - B;
        System.out.println("La resta de los números es: " + res);
        
        int multi = A * B;
        System.out.println("La multiplicación de los números es: " + multi);
        
        // Se asume que la división debe manejarse para evitar división por 0
        if (B != 0) {
            double div = (double) A / B;
            System.out.println("La división de los números es: " + div);
        } else {
            System.out.println("Error: División por cero no permitida");
        }
        
        // Comparaciones
        boolean igual = (A == B);
        System.out.println("¿El número es igual? " + igual);
        
        boolean mayor = (A > B);
        System.out.println("¿El número mayor es A? " + mayor);
        
        // Mostrar el número menor y mayor
        if (A > B) {
            System.out.println("El número mayor es: " + A);
            System.out.println("El número menor es: " + B);
        } else {
            System.out.println("El número mayor es: " + B);
            System.out.println("El número menor es: " + A);
        }
        
        // Cerrar el objeto scanner
        scanner.close();
    }
}

