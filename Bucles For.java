import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bucles {  // La clase pública debe coincidir con el nombre del archivo
    public static void main(String[] args) {
        // Crear la lista de nombres
        List<String> nombres = new ArrayList<>();
        nombres.add("Esteban");
        nombres.add("Hans");
        nombres.add("Jhon");
        nombres.add("Juan Pablo");

        // Imprimir los nombres
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Crear la lista de personas (como lista de HashMaps)
        List<Map<String, Object>> personas = new ArrayList<>();

        // Crear los HashMap para cada persona
        Map<String, Object> a = new HashMap<>();
        a.put("nombre", "Esteban");
        a.put("Edad", 28);

        Map<String, Object> b = new HashMap<>();
        b.put("nombre", "Hans");
        b.put("Edad", 27);

        Map<String, Object> c = new HashMap<>();
        c.put("nombre", "Jhon");
        c.put("Edad", 41);

        Map<String, Object> d = new HashMap<>();
        d.put("nombre", "Juan Pablo");
        d.put("Edad", 23);

        // Agregar los HashMap a la lista
        personas.add(a);
        personas.add(b);
        personas.add(c);
        personas.add(d);

        // Imprimir los nombres y edades
        for (Map<String, Object> persona : personas) {
            System.out.println(persona.get("nombre") + " " + persona.get("Edad"));
        }
    }
}
