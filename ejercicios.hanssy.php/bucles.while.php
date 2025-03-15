<?php
// Primer bloque: Contador con while
$contador = 0;
while ($contador < 30) {
    $contador++;
    echo "Iteración " . $contador . "\n";
}

// Segundo bloque: Combinado con if-else
while (true) {
    echo "Introduzca un valor mayor a 10:\n";
    $a = intval(fgets(STDIN));  // Captura la entrada del usuario y la convierte en un entero
    
    if ($a > 10) {
        echo "Es correcto\n";
    } else {
        echo "Es incorrecto, pruebe de nuevo\n";
        break;  // Sale del ciclo while si el valor ingresado es incorrecto
    }
}
?>