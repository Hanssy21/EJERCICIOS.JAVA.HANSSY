#include <iostream>
using namespace std;

int main() {
    // Variables para almacenar los valores ingresados por el usuario
    int voltaje, resistencia;
    
    // Pedir al usuario que ingrese los valores de voltaje y resistencia
    cout << "Ingrese el valor del voltaje del circuito: ";
    cin >> voltaje;  // Lee el valor del voltaje
    
    cout << "Ingrese el valor de la resistencia del circuito: ";
    cin >> resistencia;  // Lee el valor de la resistencia
    
    // Calcular la intensidad (amperaje)
    double intensidad = static_cast<double>(voltaje) / resistencia;
    
    // Mostrar el resultado
    cout << "Al conectar un resistor de R " << resistencia << " ohm a una fuente de V " << voltaje 
         << " voltaje circulará una corriente de " << intensidad << " amperios" << endl;
    
    return 0;
}