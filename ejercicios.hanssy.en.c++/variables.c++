#include <iostream>
#include <cmath>
using namespace std;

int main() {
    // Definición de las variables
    int a = 10;
    int b = 4;
    int c;

    // Multiplicación
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: *" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a * b;
    cout << "El resultado es: " << c << endl;
    cout << "El tipo de c es: int" << endl;

    // División
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: /" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a / b;
    cout << "El resultado es: " << c << endl;
    cout << "El tipo de c es: int" << endl;

    // Suma
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: +" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a + b;
    cout << "El resultado es: " << c << endl;
    cout << "El tipo de c es: int" << endl;

    // Resta
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: -" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a - b;
    cout << "El resultado es: " << c << endl;
    cout << "El tipo de c es: int" << endl;

    // Potencia
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: **" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = (int)pow(a, b); // Uso de pow() para calcular la potencia
    cout << "El resultado es: " << c << endl;
    cout << "El tipo de c es: int" << endl;

    // Módulo
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: %" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a % b;
    cout << "El resultado es: " << c << endl;
    cout << "El tipo de c es: int" << endl;

    return 0;
}