#include <iostream>
using namespace std;

int main() {
    // Definir las variables booleanas
    bool a = true;
    bool b = false;
    
    // Operación lógica 'and'
    cout << (a && b) << endl;
    
    // Definir variables numéricas
    int x = 2;
    int y = 3;
    int z = 4;
    int w = 10;
    
    // Operación lógica con comparación '==', '<' y '>'
    cout << (x == y && z < w) << endl;
    
    // Operación lógica con 'not' (invertir una condición)
    cout << (!(x == y) && z > w) << endl;
    
    return 0;
}