let x = 6;
let y = 3;

let suma = x + y;

document.getElementById("suma").innerHTML = "Suma: " + x + " + " + y + " = " + suma;

let resta = x - y;

document.getElementById("resta").innerHTML = "Resta: " + x + " - " + y + " = " + resta;

let prod = x * y;

document.getElementById("multiplicar").innerHTML = "Multiplicación: " + x + " * " + y + " = " + prod;

let div = x / y;

document.getElementById("dividir").innerHTML = "División: " + x + " / " + y + " = " + div;

let resto = x % y;

document.getElementById("resto").innerHTML = "Resto: " + x + " % " + y + " = " + resto;

let elev = x ** y;

document.getElementById("elevado").innerHTML = "Elevado: " + x + " ** " + y + " = " + elev;

x++;

document.getElementById("incrementar").innerHTML = "Incrementar: " + x;

x = 6;
x--;

document.getElementById("decrementar").innerHTML = "Decrementar: " + x;