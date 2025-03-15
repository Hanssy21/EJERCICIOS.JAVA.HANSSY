<?php
// Crear la lista de nombres
$nombres = array("Esteban", "Hans", "Jhon", "Juan Pablo");

// Imprimir los nombres
foreach ($nombres as $nombre) {
    echo $nombre . "\n";
}

// Crear la lista de personas (como array de arrays asociativos)
$personas = array();

// Crear los arrays asociativos para cada persona
$a = array("nombre" => "Esteban", "Edad" => 28);
$b = array("nombre" => "Hans", "Edad" => 27);
$c = array("nombre" => "Jhon", "Edad" => 41);
$d = array("nombre" => "Juan Pablo", "Edad" => 23);

// Agregar los arrays a la lista
array_push($personas, $a, $b, $c, $d);

// Imprimir los nombres y edades
foreach ($personas as $persona) {
    echo $persona["nombre"] . " " . $persona["Edad"] . "\n";
}
?>