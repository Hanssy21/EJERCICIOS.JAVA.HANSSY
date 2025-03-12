#include <iostream>
#include <cmath>  // Incluir la librería cmath para la función pow
using namespace std;

int main() {
    // Solicitar el primer valor (base)
    cout << "Ingrese el primer valor (base): ";
    int A;
    cin >> A;
    
    // Inicializar el valor de B (aunque no se usa en este caso)
    int B = 0;

    // Solicitar el segundo valor (exponente)
    cout << "Ingrese el segundo valor (exponente): ";
    int C;
    cin >> C;

    // Calcular la potencia
    int valor = static_cast<int>(pow(A, C));  // Usamos la función pow de cmath para calcular la potencia
    cout << "La potencia de " << A << " sobre " << C << " es: " << valor << endl;

    return 0;  // No es necesario cerrar cin en C++
}