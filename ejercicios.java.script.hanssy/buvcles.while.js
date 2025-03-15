// Primer bloque: Contador con while
let contador = 0;
while (contador < 30) {
    contador++;
    console.log("Iteración " + contador);
}

// Segundo bloque: Combinado con if-else
let prompt = require('prompt-sync')();  // Usar esta librería para solicitar entrada en la terminal

while (true) {
    let a = parseInt(prompt("Introduzca un valor mayor a 10: "));
    
    if (a > 10) {
        console.log("Es correcto");
    } else {
        console.log("Es incorrecto, pruebe de nuevo");
        break;  // Sale del ciclo while si el valor ingresado es incorrecto
    }
}