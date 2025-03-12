import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el primer valor
        System.out.println("Ingrese el primer valor (base): ");
        int A = scanner.nextInt();
        
        // Inicializar el valor de B (en el código original no se usa, pero se podría mantener si lo deseas)
        int B = 0;
        
        // Solicitar el segundo valor (exponente)
        System.out.println("Ingrese el segundo valor (exponente): ");
        int C = scanner.nextInt();
        
        // Calcular la potencia
        int valor = (int) Math.pow(A, C);  // Usamos Math.pow para calcular la potencia
        System.out.println("La potencia de " + A + " sobre " + C + " es: " + valor);
        
        scanner.close(); // Cerrar el scanner al finalizar
    }
}