<?php
// Solicitar el primer valor
echo "Ingrese el primer valor (base): \n";
$A = intval(fgets(STDIN));  // Captura el primer valor e lo convierte a entero

// Inicializar el valor de B (en este caso no se usa en PHP, pero se puede mantener si se desea)
$B = 0;

// Solicitar el segundo valor (exponente)
echo "Ingrese el segundo valor (exponente): \n";
$C = intval(fgets(STDIN));  // Captura el segundo valor e lo convierte a entero

// Calcular la potencia
$valor = pow($A, $C);  // Usamos la función pow para calcular la potencia
echo "La potencia de $A sobre $C es: $valor\n";

?>