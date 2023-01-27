function palindromo(cadena) {
    if (cadena.match(/[^0-9$@$!%*?&_-]/) != null) {
        const cadenaSinEsp = cadena.replaceAll(" ", "").toLowerCase();
        const cadenaRevers = cadenaSinEsp.split("").reverse().join("");
        if (cadenaSinEsp === cadenaRevers) {
            document.getElementById("result").innerHTML = "La cadena es un palindromo";
            document.getElementById("result").style.color = "black";
        } else {
            document.getElementById("result").innerHTML = "La cadena no es un palindromo";
            document.getElementById("result").style.color = "black";
        }
    } else {
        document.getElementById("result").innerHTML = "No has introducido una cadena de texto valida.";
        document.getElementById("result").style.color = "red";
    }
}