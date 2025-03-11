public class OperacionesMatematicas {
    public static void main(String[] args) {
        // Definición de las variables
        int a = 10;
        int b = 4;
        
        // Multiplicación
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: *");
        System.out.println("La segunda variable es: " + b);
        int c = a * b;
        System.out.println("El resultado es: " + c);
        System.out.println("El tipo de c es: " + ((Object)c).getClass().getSimpleName());
        
        // División
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: /");
        System.out.println("La segunda variable es: " + b);
        c = a / b;
        System.out.println("El resultado es: " + c);
        System.out.println("El tipo de c es: " + ((Object)c).getClass().getSimpleName());
        
        // Suma
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: +");
        System.out.println("La segunda variable es: " + b);
        c = a + b;
        System.out.println("El resultado es: " + c);
        System.out.println("El tipo de c es: " + ((Object)c).getClass().getSimpleName());
        
        // Resta
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: -");
        System.out.println("La segunda variable es: " + b);
        c = a - b;
        System.out.println("El resultado es: " + c);
        System.out.println("El tipo de c es: " + ((Object)c).getClass().getSimpleName());
        
        // Potencia
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: **");
        System.out.println("La segunda variable es: " + b);
        c = (int) Math.pow(a, b); // Uso de Math.pow() para calcular la potencia
        System.out.println("El resultado es: " + c);
        System.out.println("El tipo de c es: " + ((Object)c).getClass().getSimpleName());
        
        // Módulo
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: %");
        System.out.println("La segunda variable es: " + b);
        c = a % b;
        System.out.println("El resultado es: " + c);
        System.out.println("El tipo de c es: " + ((Object)c).getClass().getSimpleName());
    }
}