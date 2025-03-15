// Función para realizar las operaciones
function operaciones() {
    // Solicitar y leer los valores de A y B
    let A = parseInt(prompt("Ingrese valor para A: "));
    let B = parseInt(prompt("Ingrese valor para B: "));
    
    // Realizar las operaciones
    let suma = A + B;
    console.log("La suma de los números es: " + suma);
    
    let res = A - B;
    console.log("La resta de los números es: " + res);
    
    let multi = A * B;
    console.log("La multiplicación de los números es: " + multi);
    
    // Se asume que la división debe manejarse para evitar división por 0
    if (B !== 0) {
        let div = A / B;
        console.log("La división de los números es: " + div);
    } else {
        console.log("Error: División por cero no permitida");
    }
    
    // Comparaciones
    let igual = (A === B);
    console.log("¿El número es igual? " + igual);
    
    let mayor = (A > B);
    console.log("¿El número mayor es A? " + mayor);
    
    // Mostrar el número menor y mayor
    if (A > B) {
        console.log("El número mayor es: " + A);
        console.log("El número menor es: " + B);
    } else {
        console.log("El número mayor es: " + B);
        console.log("El número menor es: " + A);
    }
}

// Llamar a la función operaciones
operaciones();