var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
let numeroDni, letraDNIUser, restoNumDni;

function comprobarDNI() {
    numeroDni = document.getElementById("numero-dni").value;
    letraDNIUser = document.getElementById("letra-dni").value;

    if (numeroDni > 0 && numeroDni < 99999999) {
        document.getElementById("error-num").innerHTML = "";
        restoNumDni = numeroDni % 23;

        if (letras[restoNumDni] === letraDNIUser) {
            document.getElementById("letra-correcta").innerHTML = "La letra introducida es correcta.";
            document.getElementById("error-letra").innerHTML = "";
        } else {
            document.getElementById("error-letra").innerHTML = "Error has introducido una letra incorrecta la correcta es " + letras[restoNumDni];
        }
    } else {
        document.getElementById("error-num").innerHTML = "Error has introducido un numero que es menor que 0 y mayor que 99999999.";
    }
}