// Función para calcular la intensidad en un circuito
function calcularIntensidad() {
    // Pedir al usuario que ingrese los valores de voltaje y resistencia
    let Voltaje = parseInt(prompt("Ingrese el valor del voltaje del circuito: "));  // Lee el valor del voltaje
    let Resistencia = parseInt(prompt("Ingrese el valor de la resistencia del circuito: "));  // Lee el valor de la resistencia

    // Calcular la intensidad (amperaje)
    let Intensidad = Voltaje / Resistencia;

    // Mostrar el resultado
    console.log(`Al conectar un resistor de R ${Resistencia} ohm a una fuente de V ${Voltaje} voltaje circulará una corriente de ${Intensidad} amperios`);
}

// Llamar la función para realizar el cálculo
calcularIntensidad();