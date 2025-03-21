#include <iostream>
#include <vector>
using namespace std;

// Función que imprime un texto
void mostrarTexto() {
    cout << "Hola" << endl;
}

// Función que multiplica 5 por 8 e imprime el resultado
void multiplicar() {
    int a = 5;
    int b = 8;
    cout << a * b << endl;
}

// Función que usa variables globales y las imprime
void multiplicarConVariablesGlobales(int a, int b) {
    cout << a * b << endl;
}

// Función que devuelve el resultado de la multiplicación
int multiplicarConReturn() {
    int a = 5;
    int b = 8;
    return a * b;
}

// Función que valida si el valor de a es igual a 5
bool validarDato(int a) {
    return a == 5;
}

int main() {
    // Ejemplo de multiplicación de elementos de dos arreglos
    int a[] = {1, 2, 3, 4, 5};
    int b[] = {6, 7, 8, 9, 10};
    vector<int> c;

    // Multiplicar los elementos correspondientes de a y b y almacenarlos en c
    for (int i = 0; i < 5; i++) {
        c.push_back(a[i] * b[i]);
    }

    // Imprimir el vector resultante
    for (int val : c) {
        cout << val << " ";
    }
    cout << endl;

    // Función 1: Definición y llamada
    mostrarTexto();

    // Función 2: Multiplicar 5 y 8 e imprimir el resultado
    multiplicar();

    // Función 3: Multiplicar con variables globales
    int aGlobal = 5;
    int bGlobal = 8;
    multiplicarConVariablesGlobales(aGlobal, bGlobal);

    // Función 4: Multiplicar con return y usar el resultado fuera de la función
    int resultado = multiplicarConReturn();
    cout << resultado + 5 << endl;

    // Función 5: Validar si el valor de a es 5
    bool dato = validarDato(aGlobal);
    cout << dato << endl;

    return 0;
}