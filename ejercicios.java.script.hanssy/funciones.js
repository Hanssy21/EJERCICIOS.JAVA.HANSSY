// Ejemplo de multiplicación de elementos de dos arrays (equivalente a la tupla en Python)
function multiplicarArrays() {
    let a = [1, 2, 3, 4, 5];
    let b = [6, 7, 8, 9, 10];
    let c = [];

    // Multiplicar los elementos correspondientes de a y b y almacenarlos en c
    for (let i = 0; i < a.length; i++) {
        c.push(a[i] * b[i]);
    }
    console.log(c);
}

// Función 1: Definición y llamada
function mostrarTexto() {
    console.log("Hola");
}

// Función 2: Multiplicar 5 y 8 e imprimir el resultado
function multiplicar() {
    let a = 5;
    let b = 8;
    console.log(a * b);
}

// Función 3: Multiplicar con variables globales
function multiplicarConVariablesGlobales(a, b) {
    console.log(a * b);
}

// Función 4: Multiplicar con return y usar el resultado fuera de la función
function multiplicarConReturn() {
    let a = 5;
    let b = 8;
    return a * b;
}

// Función 5: Validar si el valor de a es 5
function validarDato(a) {
    return a === 5;
}

// Ejecutando las funciones
function main() {
    // Multiplicación de arrays
    multiplicarArrays();

    // Llamada a las funciones
    mostrarTexto();
    multiplicar();

    let aGlobal = 5;
    let bGlobal = 8;
    multiplicarConVariablesGlobales(aGlobal, bGlobal);

    let resultado = multiplicarConReturn();
    console.log(resultado + 5);

    let dato = validarDato(aGlobal);
    console.log(dato);
}

// Ejecutar la función principal
main();