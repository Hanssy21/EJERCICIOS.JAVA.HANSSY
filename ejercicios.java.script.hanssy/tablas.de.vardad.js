// Función para realizar las operaciones lógicas
function operacionesLogicas() {
    // Definir las variables booleanas
    let a = true;
    let b = false;

    // Operación lógica 'and'
    console.log(a && b);

    // Definir variables numéricas
    let x = 2;
    let y = 3;
    let z = 4;
    let w = 10;

    // Operación lógica con comparación '==', '<' y '>'
    console.log(x == y && z < w);

    // Operación lógica con 'not' (invertir una condición)
    console.log(!(x == y) && z > w);
}

// Llamar a la función para realizar las operaciones
operacionesLogicas();