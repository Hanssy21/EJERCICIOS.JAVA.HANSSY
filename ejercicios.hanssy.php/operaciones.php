<?php

// Solicitar y leer los valores de A y B
echo "Ingrese valor para A: ";
$A = (int)trim(fgets(STDIN));  // Lee el valor de A y lo convierte a entero
echo "Ingrese valor para B: ";
$B = (int)trim(fgets(STDIN));  // Lee el valor de B y lo convierte a entero

// Realizar las operaciones
$suma = $A + $B;
echo "La suma de los números es: " . $suma . "\n";

$res = $A - $B;
echo "La resta de los números es: " . $res . "\n";

$multi = $A * $B;
echo "La multiplicación de los números es: " . $multi . "\n";

// Se asume que la división debe manejarse para evitar división por 0
if ($B != 0) {
    $div = (float) $A / $B;
    echo "La división de los números es: " . $div . "\n";
} else {
    echo "Error: División por cero no permitida\n";
}

// Comparaciones
$igual = ($A == $B);
echo "¿El número es igual? " . ($igual ? "Sí" : "No") . "\n";

$mayor = ($A > $B);
echo "¿El número mayor es A? " . ($mayor ? "Sí" : "No") . "\n";

// Mostrar el número menor y mayor
if ($A > $B) {
    echo "El número mayor es: " . $A . "\n";
    echo "El número menor es: " . $B . "\n";
} else {
    echo "El número mayor es: " . $B . "\n";
    echo "El número menor es: " . $A . "\n";
}

?>