<?php
// metodo para obtener el ganador del partido
function ganadoresOctavos($marcador,$equipo1,$equipo2) {
    $goles = explode(" - ", $marcador);
    $goles1 = (int)$goles[0];
    $goles2 = (int)$goles[1];
    return $goles1 > $goles2 ? $equipo1 : $equipo2;
}

//lista de partidos 
$equipos = array(
    "1. paises bajos vs. estados unidos.",
    "2. argentina vs. australia",
    "3. francia vs. polonia",
    "4. inglaterra vs. senegal",
    "5. japon vs. croacia.",
    "6. brasil vs corea del sur",
    "7. marruecos vs españa",
    "8. portugal vs suiza"
);
// mapa de resultados

$resultados = array();
// imprimir el encabezado
echo "mundial qatar 2022\n\noctavos de final\n";
$scanner = fopen("php://stdin","r");
// pedir marcadores y almacenar resultados
foreach($equipos as $partido){
    echo $partido . "\n";
    echo"ingrese el marcador final (formato: 2-1): ";
    $marcador = trim(fgets($scanner));
    $resultados[$partido] = $marcador;
}

// imprimir los ganadores
echo "\nganadores de la fase octavos:\n";
foreach($resultados as $partido => $marcador) {
    $equipospartido =explode(" vs. ",$partido);
    $equipo1 = explode(" ",$equipospartido[0])[1];  //obtener el primer equipo
    $equipo2 = explode(" ",$equipospartido[1])[0];  //obtener el segundo equipo
    $ganador = ganadoresOctavos($marcador,$equipo1,$equipo2);
    echo "ganador de " . $partido . " es: " .$ganador . "\n";
}

fclose($scanner);
?>
