#include <iostream>
#include <string>
using namespace std;

int main() {
    // Primer bloque: Verificar si 'a' es igual a 2
    int a = 2;
    if (a == 2) {
        cout << "a vale 2" << endl;
    } else {
        cout << "a es diferente de 2" << endl;
    }

    // Segundo bloque: Concatenar condiciones con 'and' y 'not'
    string nombre = "Esteban";
    int edad = 28;
    string pais = "Colombia";

    if (nombre == "Esteban" && edad == 28 && pais == "Colombia") {
        cout << "Su nombre es " << nombre << ", tiene " << edad << " y es de " << pais << endl;
    } else if (nombre == "Esteban" && edad != 28) {
        cout << "Su nombre es Esteban y no tiene 28 años" << endl;
    } else if (nombre != "Esteban" && edad == 28) {
        cout << "Su nombre no es Esteban y tiene 28 años" << endl;
    } else {
        cout << "No se llama Esteban ni tiene 28 años" << endl;
    }

    return 0;
}