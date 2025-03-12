#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

int main() {
    // Crear un "diccionario" utilizando unordered_map en C++
    unordered_map<string, string> coche;

    // Agregar elementos al unordered_map
    coche["marca"] = "Ford";
    coche["color"] = "rojo";
    coche["modelo"] = "sedan";
    coche["placa"] = "ROS227";

    // Mostrar el valor de 'color'
    cout << coche["color"] << endl;

    // Cambiar el valor de 'color'
    coche["color"] = "verde";
    cout << coche["color"] << endl;

    // Mostrar el valor de 'marca'
    cout << coche["marca"] << endl;

    // Cambiar el valor de 'marca'
    coche["marca"] = "Renault";
    cout << coche["marca"] << endl;

    // Mostrar todo el unordered_map
    for (const auto& entry : coche) {
        cout << entry.first << ": " << entry.second << endl;
    }

    return 0;
}