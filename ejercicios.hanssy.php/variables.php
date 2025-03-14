<?php

// Definición de las variables
$a = 10;
$b = 4;

// Multiplicación
echo "La primera variable es: " . $a . "\n";
echo "El signo de la operación es: *\n";
echo "La segunda variable es: " . $b . "\n";
$c = $a * $b;
echo "El resultado es: " . $c . "\n";
echo "El tipo de c es: " . gettype($c) . "\n";

// División
echo "La primera variable es: " . $a . "\n";
echo "El signo de la operación es: /\n";
echo "La segunda variable es: " . $b . "\n";
$c = intdiv($a, $b); // Usamos intdiv() para la división entera
echo "El resultado es: " . $c . "\n";
echo "El tipo de c es: " . gettype($c) . "\n";

// Suma
echo "La primera variable es: " . $a . "\n";
echo "El signo de la operación es: +\n";
echo "La segunda variable es: " . $b . "\n";
$c = $a + $b;
echo "El resultado es: " . $c . "\n";
echo "El tipo de c es: " . gettype($c) . "\n";

// Resta
echo "La primera variable es: " . $a . "\n";
echo "El signo de la operación es: -\n";
echo "La segunda variable es: " . $b . "\n";
$c = $a - $b;
echo "El resultado es: " . $c . "\n";
echo "El tipo de c es: " . gettype($c) . "\n";

// Potencia
echo "La primera variable es: " . $a . "\n";
echo "El signo de la operación es: **\n";
echo "La segunda variable es: " . $b . "\n";
$c = pow($a, $b); // Usamos pow() para calcular la potencia
echo "El resultado es: " . $c . "\n";
echo "El tipo de c es: " . gettype($c) . "\n";

// Módulo
echo "La primera variable es: " . $a . "\n";
echo "El signo de la operación es: %\n";
echo "La segunda variable es: " . $b . "\n";
$c = $a % $b;
echo "El resultado es: " . $c . "\n";
echo "El tipo de c es: " . gettype($c) . "\n";

?>