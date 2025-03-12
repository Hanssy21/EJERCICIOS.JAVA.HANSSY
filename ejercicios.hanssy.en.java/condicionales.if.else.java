public class Condiciones {
    public static void main(String[] args) {
        // Primer bloque: Verificar si 'a' es igual a 2
        int a = 2;
        if (a == 2) {
            System.out.println("a vale 2");
        } else {
            System.out.println("a es diferente de 2");
        }

        // Segundo bloque: Concatenar condiciones con 'and' y 'not'
        String nombre = "Esteban";
        int edad = 28;
        String pais = "Colombia";

        if (nombre.equals("Esteban") && edad == 28 && pais.equals("Colombia")) {
            System.out.println("Su nombre es " + nombre + ", tiene " + edad + " y es de " + pais);
        } else if (nombre.equals("Esteban") && edad != 28) {
            System.out.println("Su nombre es Esteban y no tiene 28 años");
        } else if (!nombre.equals("Esteban") && edad == 28) {
            System.out.println("Su nombre no es Esteban y tiene 28 años");
        } else {
            System.out.println("No se llama Esteban ni tiene 28 años");
        }
    }
}