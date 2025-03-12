import java.util.ArrayList;

public class ListaExample {
    public static void main(String[] args) {
        
        // Crear la lista
        ArrayList<String> Lista = new ArrayList<>();
        
        // Agregar elementos a la lista
        Lista.add("Lunes");
        Lista.add("Martes");
        Lista.add("Miercoles");
        Lista.add("Jueves");
        Lista.add("viernes");
        Lista.add("sabado");
        
        // Imprimir el elemento en la posición 4 (comienza en 0)
        System.out.println(Lista.get(4));  // Trae el dato según posición en la lista comenzando desde cero
        
        // Imprimir la lista completa
        System.out.println(Lista);  // Trae la lista completa de datos
        
        // Sublista: Elementos desde la posición 0 hasta la 3
        System.out.println(Lista.subList(0, 3));  // Trae la sublista desde la posición 0 hasta la 3 (sin incluir la 3)
        
        // Lista con diferentes tipos de datos
        ArrayList<Object> ListaMixta = new ArrayList<>();
        ListaMixta.add("Lunes");
        ListaMixta.add("Martes");
        ListaMixta.add("Miercoles");
        ListaMixta.add("Jueves");
        ListaMixta.add("viernes");
        ListaMixta.add("sabado");
        ListaMixta.add(1);
        ListaMixta.add(2);
        ListaMixta.add(3);
        
        // Crear una lista interna dentro de la lista principal
        ArrayList<Object> datosEsteban = new ArrayList<>();
        datosEsteban.add("Esteban");
        datosEsteban.add(0.2);
        datosEsteban.add(2.25);
        datosEsteban.add(true);
        
        // Agregar la lista interna a la lista principal
        ListaMixta.add(datosEsteban);
        
        // Imprimir la sublista (primeros 4 elementos) y los primeros 3 elementos de la lista interna
        System.out.println(ListaMixta.subList(0, 4));  // Imprime los primeros 4 elementos de la lista principal
        System.out.println(((ArrayList<Object>) ListaMixta.get(9)).subList(0, 3));  // Imprime los primeros 3 elementos de la lista interna
        
    }
}