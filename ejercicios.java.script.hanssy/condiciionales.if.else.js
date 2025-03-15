// Primer bloque: Verificar si 'a' es igual a 2
let a = 2;
if (a === 2) {
    console.log("a vale 2");
} else {
    console.log("a es diferente de 2");
}

// Segundo bloque: Concatenar condiciones con 'and' y 'not'
let nombre = "Esteban";
let edad = 28;
let pais = "Colombia";

if (nombre === "Esteban" && edad === 28 && pais === "Colombia") {
    console.log("Su nombre es " + nombre + ", tiene " + edad + " y es de " + pais);
} else if (nombre === "Esteban" && edad !== 28) {
    console.log("Su nombre es Esteban y no tiene 28 años");
} else if (nombre !== "Esteban" && edad === 28) {
    console.log("Su nombre no es Esteban y tiene 28 años");
} else {
    console.log("No se llama Esteban ni tiene 28 años");
}