<?php

// Pedir al usuario que ingrese los valores de voltaje y resistencia
echo "Ingrese el valor del voltaje del circuito: ";
$Voltaje = (int)trim(fgets(STDIN));  // Lee el valor del voltaje

echo "Ingrese el valor de la resistencia del circuito: ";
$Resistencia = (int)trim(fgets(STDIN));  // Lee el valor de la resistencia

// Calcular la intensidad (amperaje)
$Intensidad = $Voltaje / $Resistencia;

// Mostrar el resultado
echo "Al conectar un resistor de R $Resistencia ohm a una fuente de V $Voltaje voltaje circulara una corriente de $Intensidad amperios\n";

?>