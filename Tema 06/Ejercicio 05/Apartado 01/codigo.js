function stringInfo(cadena) {
    if (cadena.match(/^[A-Z\s]+$/) != null) {
        document.getElementById("resultado").innerHTML = "La cadena es de solo Mayusculas";
        document.getElementById("resultado").style.color = "black";
    } else if (cadena.match(/^[a-z\s]+$/) != null) {
        document.getElementById("resultado").innerHTML = "La cadena es de solo Minusculas";
        document.getElementById("resultado").style.color = "black";
    } else if (cadena.match(/^[a-zA-Z\s]+$/) != null) {
        document.getElementById("resultado").innerHTML = "Tiene Minusculas y Mayusculas";
        document.getElementById("resultado").style.color = "black";
    } else {
        document.getElementById("resultado").innerHTML = "Error la cadena introducida no es valida";
        document.getElementById("resultado").style.color = "red";
    }
}