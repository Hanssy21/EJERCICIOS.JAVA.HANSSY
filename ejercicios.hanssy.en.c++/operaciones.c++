#include <iostream>
using namespace std;

int main() {
    // Variables para almacenar los valores de A y B
    int A, B;
    
    // Solicitar y leer los valores de A y B
    cout << "Ingrese valor para A: ";
    cin >> A;
    cout << "Ingrese valor para B: ";
    cin >> B;
    
    // Realizar las operaciones
    int suma = A + B;
    cout << "La suma de los números es: " << suma << endl;
    
    int res = A - B;
    cout << "La resta de los números es: " << res << endl;
    
    int multi = A * B;
    cout << "La multiplicación de los números es: " << multi << endl;
    
    // Se asume que la división debe manejarse para evitar división por 0
    if (B != 0) {
        double div = static_cast<double>(A) / B;
        cout << "La división de los números es: " << div << endl;
    } else {
        cout << "Error: División por cero no permitida" << endl;
    }
    
    // Comparaciones
    bool igual = (A == B);
    cout << "¿El número es igual? " << (igual ? "Sí" : "No") << endl;
    
    bool mayor = (A > B);
    cout << "¿El número mayor es A? " << (mayor ? "Sí" : "No") << endl;
    
    // Mostrar el número menor y mayor
    if (A > B) {
        cout << "El número mayor es: " << A << endl;
        cout << "El número menor es: " << B << endl;
    } else {
        cout << "El número mayor es: " << B << endl;
        cout << "El número menor es: " << A << endl;
    }
    
    return 0;
}