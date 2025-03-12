#include <iostream>
#include <vector>
#include <variant>
using namespace std;

// Usar std::variant para manejar listas mixtas
using ListaMixta = vector<variant<string, int, double, bool, vector<variant<string, double, bool>>>>;

int main() {
    // Crear la lista de días
    vector<string> Lista = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    
    // Imprimir el elemento en la posición 4 (comienza en 0)
    cout << Lista[4] << endl;  // Trae el dato según posición en la lista comenzando desde cero
    
    // Imprimir la lista completa
    for (const auto& dia : Lista) {
        cout << dia << " ";
    }
    cout << endl;

    // Sublista: Elementos desde la posición 0 hasta la 3
    for (int i = 0; i < 3; ++i) {
        cout << Lista[i] << " ";
    }
    cout << endl;

    // Lista mixta
    ListaMixta listaMixta = {
        "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", 
        1, 2, 3
    };
    
    // Crear una lista interna dentro de la lista principal
    vector<variant<string, double, bool>> datosEsteban = {
        "Esteban", 0.2, 2.25, true
    };

    // Agregar la lista interna a la lista mixta
    listaMixta.push_back(datosEsteban);

    // Imprimir la sublista (primeros 4 elementos) de la lista mixta
    for (int i = 0; i < 4; ++i) {
        cout << get<string>(listaMixta[i]) << " ";  // Accede a los primeros 4 elementos que son strings
    }
    cout << endl;

    // Imprimir los primeros 3 elementos de la lista interna
    auto& sublist = get<vector<variant<string, double, bool>>>(listaMixta[9]);
    for (int i = 0; i < 3; ++i) {
        cout << get<string>(sublist[i]) << " ";  // Accede al primer elemento de tipo string
    }
    cout << endl;

    return 0;
}