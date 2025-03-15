<?php
// Crear un "diccionario" utilizando un array asociativo en PHP
$coche = array();

// Agregar elementos al array asociativo
$coche["marca"] = "Ford";
$coche["color"] = "rojo";
$coche["modelo"] = "sedan";
$coche["placa"] = "ROS227";

// Mostrar el valor de 'color'
echo $coche["color"] . "\n";

// Cambiar el valor de 'color'
$coche["color"] = "verde";
echo $coche["color"] . "\n";

// Mostrar el valor de 'marca'
echo $coche["marca"] . "\n";

// Cambiar el valor de 'marca'
$coche["marca"] = "Renault";
echo $coche["marca"] . "\n";

// Mostrar todo el array asociativo
print_r($coche);
?>