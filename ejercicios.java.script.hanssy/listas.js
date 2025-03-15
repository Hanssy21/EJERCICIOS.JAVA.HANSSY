// Crear la lista
let lista = [];

// Agregar elementos a la lista
lista.push("Lunes");
lista.push("Martes");
lista.push("Miércoles");
lista.push("Jueves");
lista.push("Viernes");
lista.push("Sábado");

// Imprimir el elemento en la posición 4 (comienza en 0)
console.log(lista[4]);  // Trae el dato según posición en la lista comenzando desde cero

// Imprimir la lista completa
console.log(lista);  // Trae la lista completa de datos

// Sublista: Elementos desde la posición 0 hasta la 3
console.log(lista.slice(0, 3));  // Trae la sublista desde la posición 0 hasta la 3 (sin incluir la 3)

// Lista con diferentes tipos de datos
let listaMixta = [];
listaMixta.push("Lunes");
listaMixta.push("Martes");
listaMixta.push("Miércoles");
listaMixta.push("Jueves");
listaMixta.push("Viernes");
listaMixta.push("Sábado");
listaMixta.push(1);
listaMixta.push(2);
listaMixta.push(3);

// Crear una lista interna dentro de la lista principal
let datosEsteban = [];
datosEsteban.push("Esteban");
datosEsteban.push(0.2);
datosEsteban.push(2.25);
datosEsteban.push(true);

// Agregar la lista interna a la lista principal
listaMixta.push(datosEsteban);

// Imprimir la sublista (primeros 4 elementos) y los primeros 3 elementos de la lista interna
console.log(listaMixta.slice(0, 4));  // Imprime los primeros 4 elementos de la lista principal
console.log(listaMixta[9].slice(0, 3));  // Imprime los primeros 3 elementos de la lista interna