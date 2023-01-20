var valores = [true, 5, false, "hola", "adios", 2];

if (valores[3].length > valores[4].length) {
    document.getElementById("apartado-a").innerHTML = valores[3] + " es mayor que " + valores[4];
} else if (valores[3].length < valores[4].length) {
    document.getElementById("apartado-a").innerHTML = valores[4] + " es mayor que " + valores[3];
} else {
    document.getElementById("apartado-a").innerHTML = valores[4] + " es igual al " + valores[3];
}

if (valores[0] || valores[2]) {
    document.getElementById("apartado-b1").innerHTML = "El resultado con OR es true";
}

if (valores[0] && valores[2]) {
    document.getElementById("apartado-b2").innerHTML = "El resultado con AND es true";
} else {
    document.getElementById("apartado-b2").innerHTML = "El resultado con AND es false";
}

document.getElementById("apartado-c-suma").innerHTML = valores[1] + " + " + valores[5] + " = " + (valores[1] + valores[5]);
document.getElementById("apartado-c-resta").innerHTML = valores[1] + " - " + valores[5] + " = " + (valores[1] - valores[5]);
document.getElementById("apartado-c-multi").innerHTML = valores[1] + " * " + valores[5] + " = " + (valores[1] * valores[5]);
document.getElementById("apartado-c-divi").innerHTML = valores[1] + " / " + valores[5] + " = " + (valores[1] / valores[5]);
document.getElementById("apartado-c-resto").innerHTML = valores[1] + " % " + valores[5] + " = " + (valores[1] % valores[5]);