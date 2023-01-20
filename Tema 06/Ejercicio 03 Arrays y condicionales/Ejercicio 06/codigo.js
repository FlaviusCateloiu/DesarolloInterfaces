function numeroParOImpar(numero) {
    if (numero % 2 === 0) {
        document.getElementById("resultado").innerHTML = numero + " es un numero par.";
    } else {
        document.getElementById("resultado").innerHTML = numero + " es un numero impar.";
    }
}