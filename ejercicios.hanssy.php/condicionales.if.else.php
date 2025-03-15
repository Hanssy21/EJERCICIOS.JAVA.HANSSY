<?php
// Primer bloque: Verificar si 'a' es igual a 2
$a = 2;
if ($a == 2) {
    echo "a vale 2\n";
} else {
    echo "a es diferente de 2\n";
}

// Segundo bloque: Concatenar condiciones con 'and' y 'not'
$nombre = "Esteban";
$edad = 28;
$pais = "Colombia";

if ($nombre == "Esteban" && $edad == 28 && $pais == "Colombia") {
    echo "Su nombre es $nombre, tiene $edad y es de $pais\n";
} elseif ($nombre == "Esteban" && $edad != 28) {
    echo "Su nombre es Esteban y no tiene 28 años\n";
} elseif ($nombre != "Esteban" && $edad == 28) {
    echo "Su nombre no es Esteban y tiene 28 años\n";
} else {
    echo "No se llama Esteban ni tiene 28 años\n";
}
?>