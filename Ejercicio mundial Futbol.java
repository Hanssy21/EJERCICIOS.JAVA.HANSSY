import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MundialQatar2022 {

    // Método para obtener el ganador del partido
    public static String ganadoresOctavos(String marcador, String equipo1, String equipo2) {
        String[] goles = marcador.split(" - ");
        int goles1 = Integer.parseInt(goles[0]);
        int goles2 = Integer.parseInt(goles[1]);
        return goles1 > goles2 ? equipo1 : equipo2;
    }

    public static void main(String[] args) {
        // Lista de partidos
        ArrayList<String> equipos = new ArrayList<>();
        equipos.add("1. Países Bajos vs. Estados Unidos.");
        equipos.add("2. Argentina vs. Australia.");
        equipos.add("3. Francia vs. Polonia.");
        equipos.add("4. Inglaterra vs. Senegal.");
        equipos.add("5. Japón vs. Croacia.");
        equipos.add("6. Brasil vs. Corea del Sur.");
        equipos.add("7. Marruecos vs. España.");
        equipos.add("8. Portugal vs. Suiza.");
        
        // Mapa de resultados
        HashMap<String, String> resultados = new HashMap<>();
        
        // Imprimir el encabezado
        System.out.println("Mundial Qatar 2022\n\nOctavos de final\n");
        
        // Crear objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);
        
        // Pedir marcadores y almacenar resultados
        for (String partido : equipos) {
            System.out.println(partido);
            System.out.print("Ingrese el marcador final (Formato: 2-1): ");
            String marcador = scanner.nextLine();
            resultados.put(partido, marcador);
        }
        
        // Imprimir los ganadores
        System.out.println("\nGanadores de la fase de octavos:");
        for (String partido : resultados.keySet()) {
            String marcador = resultados.get(partido);
            String[] equiposPartido = partido.split(" vs. ");
            String equipo1 = equiposPartido[0].split(" ")[1];  // Obtener el primer equipo
            String equipo2 = equiposPartido[1].split(" ")[0];  // Obtener el segundo equipo
            String ganador = ganadoresOctavos(marcador, equipo1, equipo2);
            System.out.println("Ganador de " + partido + " es: " + ganador);
        }

        scanner.close();
    }
}



    
