// Usamos el módulo prompt-sync para pedir entradas del usuario en la terminal de Node.js
let prompt = require('prompt-sync')();

// Solicitar el primer valor (base)
let A = parseInt(prompt("Ingrese el primer valor (base): "));

// Inicializar el valor de B (en el código original no se usa, pero se podría mantener si lo deseas)
let B = 0;

// Solicitar el segundo valor (exponente)
let C = parseInt(prompt("Ingrese el segundo valor (exponente): "));

// Calcular la potencia
let valor = Math.pow(A, C);  // Usamos Math.pow para calcular la potencia
console.log("La potencia de " + A + " sobre " + C + " es: " + valor);