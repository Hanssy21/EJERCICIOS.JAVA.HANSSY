import java.util.HashMap;

public class Diccionario {
    public static void main(String[] args) {
        // Crear un "diccionario" utilizando HashMap en Java
        HashMap<String, String> coche = new HashMap<>();

        // Agregar elementos al HashMap
        coche.put("marca", "Ford");
        coche.put("color", "rojo");
        coche.put("modelo", "sedan");
        coche.put("placa", "ROS227");

        // Mostrar el valor de 'color'
        System.out.println(coche.get("color"));

        // Cambiar el valor de 'color'
        coche.put("color", "verde");
        System.out.println(coche.get("color"));

        // Mostrar el valor de 'marca'
        System.out.println(coche.get("marca"));

        // Cambiar el valor de 'marca'
        coche.put("marca", "Renault");
        System.out.println(coche.get("marca"));

        // Mostrar todo el HashMap
        System.out.println(coche);
    }
}