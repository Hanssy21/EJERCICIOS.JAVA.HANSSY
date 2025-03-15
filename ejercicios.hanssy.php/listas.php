<?php

// Crear la lista
$Lista = array();

// Agregar elementos a la lista
array_push($Lista, "Lunes");
array_push($Lista, "Martes");
array_push($Lista, "Miercoles");
array_push($Lista, "Jueves");
array_push($Lista, "Viernes");
array_push($Lista, "Sabado");

// Imprimir el elemento en la posición 4 (comienza en 0)
echo $Lista[4] . "\n";  // Trae el dato según posición en la lista comenzando desde cero

// Imprimir la lista completa
print_r($Lista);  // Trae la lista completa de datos

// Sublista: Elementos desde la posición 0 hasta la 3
echo "Sublista (0-3):\n";
print_r(array_slice($Lista, 0, 3));  // Trae la sublista desde la posición 0 hasta la 3 (sin incluir la 3)

// Lista con diferentes tipos de datos
$ListaMixta = array();
array_push($ListaMixta, "Lunes");
array_push($ListaMixta, "Martes");
array_push($ListaMixta, "Miercoles");
array_push($ListaMixta, "Jueves");
array_push($ListaMixta, "Viernes");
array_push($ListaMixta, "Sabado");
array_push($ListaMixta, 1);
array_push($ListaMixta, 2);
array_push($ListaMixta, 3);

// Crear una lista interna dentro de la lista principal
$datosEsteban = array("Esteban", 0.2, 2.25, true);

// Agregar la lista interna a la lista principal
array_push($ListaMixta, $datosEsteban);

// Imprimir la sublista (primeros 4 elementos) y los primeros 3 elementos de la lista interna
echo "Sublista de los primeros 4 elementos de ListaMixta:\n";
print_r(array_slice($ListaMixta, 0, 4));  // Imprime los primeros 4 elementos de la lista principal

echo "Sublista de los primeros 3 elementos de la lista interna:\n";
print_r(array_slice($ListaMixta[9], 0, 3));  // Imprime los primeros 3 elementos de la lista interna

?>