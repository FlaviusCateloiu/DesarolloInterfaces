let enlaces = document.getElementsByTagName("a");
let contPrueba = 0;

console.log("Numero de enlaces en la pagina Web: " + enlaces.length);
console.log("El penultimo enlace de la pagina es: " + enlaces[enlaces.length - 2].href);

for (let i = 0; i < enlaces.length; i++) {
    if (enlaces[i].href == "http://prueba/") {
        contPrueba++;
    }
}
console.log(contPrueba + " enlaces apuntan a http://prueba/");

let parrafos = document.getElementsByTagName("p");
enlaces = parrafos[2].getElementsByTagName("a");
console.log("Numero de enlaces en el tercer parrafo: " + enlaces.length);