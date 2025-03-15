// Función para realizar las operaciones matemáticas
function operacionesMatematicas() {
    // Definición de las variables
    let a = 10;
    let b = 4;
    
    // Multiplicación
    console.log("La primera variable es: " + a);
    console.log("El signo de la operación es: *");
    console.log("La segunda variable es: " + b);
    let c = a * b;
    console.log("El resultado es: " + c);
    console.log("El tipo de c es: " + typeof c);
    
    // División
    console.log("La primera variable es: " + a);
    console.log("El signo de la operación es: /");
    console.log("La segunda variable es: " + b);
    c = a / b;
    console.log("El resultado es: " + c);
    console.log("El tipo de c es: " + typeof c);
    
    // Suma
    console.log("La primera variable es: " + a);
    console.log("El signo de la operación es: +");
    console.log("La segunda variable es: " + b);
    c = a + b;
    console.log("El resultado es: " + c);
    console.log("El tipo de c es: " + typeof c);
    
    // Resta
    console.log("La primera variable es: " + a);
    console.log("El signo de la operación es: -");
    console.log("La segunda variable es: " + b);
    c = a - b;
    console.log("El resultado es: " + c);
    console.log("El tipo de c es: " + typeof c);
    
    // Potencia
    console.log("La primera variable es: " + a);
    console.log("El signo de la operación es: **");
    console.log("La segunda variable es: " + b);
    c = Math.pow(a, b); // Uso de Math.pow() para calcular la potencia
    console.log("El resultado es: " + c);
    console.log("El tipo de c es: " + typeof c);
    
    // Módulo
    console.log("La primera variable es: " + a);
    console.log("El signo de la operación es: %");
    console.log("La segunda variable es: " + b);
    c = a % b;
    console.log("El resultado es: " + c);
    console.log("El tipo de c es: " + typeof c);
}

// Llamar a la función para realizar las operaciones
operacionesMatematicas();