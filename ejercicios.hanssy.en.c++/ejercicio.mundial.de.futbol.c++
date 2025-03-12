#include <iostream>
#include <vector>
#include <unordered_map>
#include <sstream>
#include <string>
using namespace std;

// Método para obtener el ganador del partido
string ganadoresOctavos(const string& marcador, const string& equipo1, const string& equipo2) {
    stringstream ss(marcador);
    string golesStr;
    int goles1, goles2;

    // Dividir el marcador por " - " y convertir los goles a enteros
    getline(ss, golesStr, '-');
    goles1 = stoi(golesStr);
    getline(ss, golesStr);
    goles2 = stoi(golesStr);

    return goles1 > goles2 ? equipo1 : equipo2;
}

int main() {
    // Lista de partidos
    vector<string> equipos = {
        "1. Países Bajos vs. Estados Unidos.",
        "2. Argentina vs. Australia.",
        "3. Francia vs. Polonia.",
        "4. Inglaterra vs. Senegal.",
        "5. Japón vs. Croacia.",
        "6. Brasil vs. Corea del Sur.",
        "7. Marruecos vs. España.",
        "8. Portugal vs. Suiza."
    };

    // Mapa de resultados
    unordered_map<string, string> resultados;

    // Imprimir el encabezado
    cout << "Mundial Qatar 2022\n\nOctavos de final\n" << endl;

    // Crear objeto Scanner para leer la entrada
    string marcador;
    
    // Pedir marcadores y almacenar resultados
    for (const auto& partido : equipos) {
        cout << partido << endl;
        cout << "Ingrese el marcador final (Formato: 2-1): ";
        getline(cin, marcador);  // Usamos getline para permitir espacios en el marcador
        resultados[partido] = marcador;
    }

    // Imprimir los ganadores
    cout << "\nGanadores de la fase de octavos:" << endl;
    for (const auto& partido : resultados) {
        string marcador = partido.second;
        stringstream ss(partido.first);
        string equipo1, equipo2;
        
        // Extraer los equipos del partido
        ss.ignore(5, ' ');  // Ignoramos el número del partido (ej: "1.")
        getline(ss, equipo1, ' ');  // Obtener el primer equipo
        ss.ignore(4, ' ');  // Ignorar "vs."
        getline(ss, equipo2, '.');  // Obtener el segundo equipo

        string ganador = ganadoresOctavos(marcador, equipo1, equipo2);
        cout << "Ganador de " << partido.first << " es: " << ganador << endl;
    }

    return 0;
}