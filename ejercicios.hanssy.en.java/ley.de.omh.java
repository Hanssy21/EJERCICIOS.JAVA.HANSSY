import java.util.Scanner;

public class Circuito {
    public static void main(String[] args) {
        
        // Crear el objeto Scanner para recibir entradas desde el usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los valores de voltaje y resistencia
        System.out.print("Ingrese el valor del voltaje del circuito: ");
        int Voltaje = scanner.nextInt();  // Lee el valor del voltaje
        
        System.out.print("Ingrese el valor de la resistencia del circuito: ");
        int Resistencia = scanner.nextInt();  // Lee el valor de la resistencia
        
        // Calcular la intensidad (amperaje)
        double Intensidad = (double) Voltaje / Resistencia;
        
        // Mostrar el resultado
        System.out.println("Al conectar un resistor de R " + Resistencia + " ohm a una fuente de V " + Voltaje + 
                           " voltaje circulara una corriente de " + Intensidad + " amperios");
        
        // Cerrar el scanner
        scanner.close();
    }
}