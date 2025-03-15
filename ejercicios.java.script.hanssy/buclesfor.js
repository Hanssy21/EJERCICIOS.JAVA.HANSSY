// Crear la lista de nombres
let nombres = ["Esteban", "Hans", "Jhon", "Juan Pablo"];

// Imprimir los nombres
for (let nombre of nombres) {
    console.log(nombre);
}

// Crear la lista de personas (como lista de objetos)
let personas = [
    { nombre: "Esteban", Edad: 28 },
    { nombre: "Hans", Edad: 27 },
    { nombre: "Jhon", Edad: 41 },
    { nombre: "Juan Pablo", Edad: 23 }
];

// Imprimir los nombres y edades
for (let persona of personas) {
    console.log(persona.nombre + " " + persona.Edad);
}