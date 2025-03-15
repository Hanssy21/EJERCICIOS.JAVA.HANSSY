// Función para obtener el ganador del partido
function ganadoresOctavos(marcador, equipo1, equipo2) {
    let goles = marcador.split(" - ");
    let goles1 = parseInt(goles[0]);
    let goles2 = parseInt(goles[1]);
    return goles1 > goles2 ? equipo1 : equipo2;
}

function main() {
    // Lista de partidos
    let equipos = [
        "1. Países Bajos vs. Estados Unidos.",
        "2. Argentina vs. Australia.",
        "3. Francia vs. Polonia.",
        "4. Inglaterra vs. Senegal.",
        "5. Japón vs. Croacia.",
        "6. Brasil vs. Corea del Sur.",
        "7. Marruecos vs. España.",
        "8. Portugal vs. Suiza."
    ];

    // Mapa de resultados
    let resultados = {};

    // Imprimir el encabezado
    console.log("Mundial Qatar 2022\n\nOctavos de final\n");

    // Crear objeto prompt para simular la entrada del usuario (deberás tener instalado prompt-sync)
    const prompt = require('prompt-sync')();

    // Pedir marcadores y almacenar resultados
    for (let partido of equipos) {
        console.log(partido);
        let marcador = prompt("Ingrese el marcador final (Formato: 2-1): ");
        resultados[partido] = marcador;
    }

    // Imprimir los ganadores
    console.log("\nGanadores de la fase de octavos:");
    for (let partido in resultados) {
        let marcador = resultados[partido];
        let equiposPartido = partido.split(" vs. ");
        let equipo1 = equiposPartido[0].split(" ")[1];  // Obtener el primer equipo
        let equipo2 = equiposPartido[1].split(" ")[0];  // Obtener el segundo equipo
        let ganador = ganadoresOctavos(marcador, equipo1, equipo2);
        console.log("Ganador de " + partido + " es: " + ganador);
    }
}

// Ejecutar la función principal
main();