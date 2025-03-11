import java.util.Scanner;

public class DatosPersonales {
    public static void main(String[] args) {
        
        // Crear el objeto Scanner para recibir entradas desde el usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese sus datos
        System.out.print("Escriba sus nombres completos: ");
        String a = scanner.nextLine();  // Lee el nombre completo
        
        System.out.print("Escriba sus Apellidos completos: ");
        String b = scanner.nextLine();  // Lee los apellidos completos
        
        System.out.print("Escriba su profesion: ");
        String c = scanner.nextLine();  // Lee la profesión
        
        System.out.print("Escriba su año de nacimiento: ");
        int d = scanner.nextInt();  // Lee el año de nacimiento
        
        // Calcular la edad en base al año actual (2025)
        int e = 2025 - d; 
        
        // Mostrar el resultado
        System.out.println("El (La) " + c + " " + a + " " + b + " tiene " + e + " años");
        
        // Cerrar el scanner
        scanner.close();
    }
}