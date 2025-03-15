// Función para obtener los datos personales del usuario
function obtenerDatosPersonales() {
    // Crear un objeto Scanner para pedir entradas (en JavaScript usamos prompt para la entrada del usuario)
    
    // Pedir al usuario que ingrese sus datos
    let a = prompt("Escriba sus nombres completos: ");  // Lee el nombre completo
    let b = prompt("Escriba sus Apellidos completos: ");  // Lee los apellidos completos
    let c = prompt("Escriba su profesion: ");  // Lee la profesión
    let d = parseInt(prompt("Escriba su año de nacimiento: "));  // Lee el año de nacimiento y lo convierte a entero
    
    // Calcular la edad en base al año actual (2025)
    let e = 2025 - d; 
    
    // Mostrar el resultado
    console.log(`El (La) ${c} ${a} ${b} tiene ${e} años`);
}

// Llamar la función para obtener los datos
obtenerDatosPersonales();