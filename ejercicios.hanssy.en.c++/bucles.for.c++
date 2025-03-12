#include <iostream>
#include <vector>
#include <map>
#include <string>

using namespace std;

int main() {
    // Crear el vector de nombres
    vector<string> nombres = {"Esteban", "Hans", "Jhon", "Juan Pablo"};

    // Imprimir los nombres
    for (const string& nombre : nombres) {
        cout << nombre << endl;
    }

    // Crear el vector de personas (como un vector de mapas)
    vector<map<string, string>> personas;

    // Crear el map para cada persona
    map<string, string> a;
    a["nombre"] = "Esteban";
    a["Edad"] = "28";

    map<string, string> b;
    b["nombre"] = "Hans";
    b["Edad"] = "27";

    map<string, string> c;
    c["nombre"] = "Jhon";
    c["Edad"] = "41";

    map<string, string> d;
    d["nombre"] = "Juan Pablo";
    d["Edad"] = "23";

    // Agregar los mapas al vector
    personas.push_back(a);
    personas.push_back(b);
    personas.push_back(c);
    personas.push_back(d);

    // Imprimir los nombres y edades
    for (const auto& persona : personas) {
        cout << persona.at("nombre") << " " << persona.at("Edad") << endl;
    }

    return 0;
}