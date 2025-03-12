#include <iostream>
#include <string>
using namespace std;

int main() {
    // Variables para almacenar los datos ingresados por el usuario
    string nombres, apellidos, profesion;
    int añoNacimiento;

    // Pedir al usuario que ingrese sus datos
    cout << "Escriba sus nombres completos: ";
    getline(cin, nombres);  // Lee el nombre completo

    cout << "Escriba sus Apellidos completos: ";
    getline(cin, apellidos);  // Lee los apellidos completos

    cout << "Escriba su profesion: ";
    getline(cin, profesion);  // Lee la profesión

    cout << "Escriba su año de nacimiento: ";
    cin >> añoNacimiento;  // Lee el año de nacimiento

    // Calcular la edad en base al año actual (2025)
    int edad = 2025 - añoNacimiento;

    // Mostrar el resultado
    cout << "El (La) " << profesion << " " << nombres << " " << apellidos << " tiene " << edad << " años" << endl;

    return 0;
}