<?php

//funcion principal
function main(){
    //ejemplo de multiplicacion de elementos de dos arrays(equivalente a la tupla en python)
    $a = array(1,2,3,4,5);
    $b = array(6,7,8,9,10);
    $c = array();
    //multiplicar los elementos correspondientes de a y b y almacenarlos en c 
    for ($i = 0; $i < count($a); $i++) {
        $c[] = $a[$i] * $b[$i];
}
print_r($c); // mostrar el resultado

// llamadas a las funciones
mostrarTexto();
multiplicar();

$aGlobal = 5;
$bGlobal = 8;
multiplicarConVariablesGlobales($aGlobal,$bGlobal);
  
// funcion con return y uso fuera de la funcion
$resultado = multiplicarConReturn();
echo $resultado + 5 . "\n";

// funcion para validar el dato
$dato = validarDato($aGlobal);
echo ($dato ? 'true' : 'false') . "\n";
}

// funcion que imprime un texto
function mostrarTexto() {
    echo "hola\n";
}
// funcion que multiplica 5 por 8 e imprime el resultado
function multiplicar(){
    $a = 5;
    $b = 8;
    echo $a * $b;
}
// funcion que usa variables globales y las imprime
function multiplicarConVariablesGlobales($a, $b) {
    echo $a * $b . "\n";
}
// funcion que devuelve el resultado a la multiplicacion
function multiplicarConReturn(){
    $a = 5;
    $b = 8;
    return $a * $b;
}
// funcion que valida si el valor de a es igual a 5
function validarDato($a) {
    if ($a == 5) { 
        return true;
    } else {
        return false;
    }
}

//ejemplo de multiplicacion de elementos de dos arrays (equivalente a la tupla en python)
 $a = [1,2,3,4,5];
 $b = [6,7,8,9,10];
 $c = [];

 // multiplicar los elementos correspondientes de a y b y almacenarlos en c
 for ($i = 0; $i < count($a);$i++) {
    $c[] = $a[$i] * $b[$i];
 }
 print_r($c);

 //funcion 1: definicion y  llamada 
 mostrarTexto();

 //funcion 2: multiplicar 5 y 8 e imprimir el resultado 
 multiplicar();

 //funcion 3: multiplicar con variables globales 
 $aGlobal = 5;
 $bGlobal = 8;
 multiplicarConVariablesGlobales($aGlobal,$bGlobal);

 //funcion 4 : multiplicar con return y usar el resultado fuera de la funcion
 $resultado = multiplicarConReturn();
 echo $resultado + 5 . "\n";

 // funcion 5 : validar si el  valor de a es 5 
 $dato = validarDato($aGlobal);
 echo $dato ? 'true' : 'false' . "\n";

 main();

 ?>


