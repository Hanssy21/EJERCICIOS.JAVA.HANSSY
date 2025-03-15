<?php

// Pedir al usuario que ingrese sus datos
echo "Escriba sus nombres completos: ";
$a = trim(fgets(STDIN));  // Lee el nombre completo

echo "Escriba sus Apellidos completos: ";
$b = trim(fgets(STDIN));  // Lee los apellidos completos

echo "Escriba su profesion: ";
$c = trim(fgets(STDIN));  // Lee la profesión

echo "Escriba su año de nacimiento: ";
$d = (int)trim(fgets(STDIN));  // Lee el año de nacimiento y lo convierte a entero

// Calcular la edad en base al año actual (2025)
$e = 2025 - $d;

// Mostrar el resultado
echo "El (La) $c $a $b tiene $e años\n";

?>
