<?php

// Definir las variables booleanas
$a = true;
$b = false;

// Operación lógica 'and'
echo ($a && $b) . "\n";

// Definir variables numéricas
$x = 2;
$y = 3;
$z = 4;
$w = 10;

// Operación lógica con comparación '==', '<' y '>'
echo (($x == $y) && ($z < $w)) . "\n";

// Operación lógica con 'not' (invertir una condición)
echo (!(($x == $y)) && ($z > $w)) . "\n";

?>