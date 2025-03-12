#include <iostream>
using namespace std;

int main() {
    // Primer bloque: Contador con while
    int contador = 0;
    while (contador < 30) {
        contador++;
        cout << "Iteración " << contador << endl;
    }

    // Segundo bloque: Combinado con if-else
    int a;
    while (true) {
        cout << "Introduzca un valor mayor a 10: ";
        cin >> a;

        if (a > 10) {
            cout << "Es correcto" << endl;
        } else {
            cout << "Es incorrecto, pruebe de nuevo" << endl;
            break;  // Sale del ciclo while si el valor ingresado es incorrecto
        }
    }

    return 0;  // No es necesario cerrar el "scanner" en C++
}