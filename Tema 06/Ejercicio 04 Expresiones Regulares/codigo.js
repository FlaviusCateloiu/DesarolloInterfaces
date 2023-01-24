function validarCampos() {
    const soloNum = document.getElementById("expresion1").value;
    const soloLetras = document.getElementById("expresion2").value;
    const letrasEspTildes = document.getElementById("expresion3").value;
    const nomApell = document.getElementById("expresion4").value;
    const precioDosDecimales = document.getElementById("expresion5").value;
    const numeroEnteroDecimales = document.getElementById("expresion6").value;
    const numeroEntPosNeg = document.getElementById("expresion7").value;
    const numeroRealesSepar = document.getElementById("expresion8").value;
    const validarFecha = document.getElementById("expresion9").value;
    const validarHoras12 = document.getElementById("expresion10").value;
    const validarHoras24 = document.getElementById("expresion11").value;
    const validarContrasenya = document.getElementById("expresion12").value;
    const validarUsuario = document.getElementById("expresion13").value;
    const validarEmail = document.getElementById("expresion14").value;
    const validarUrl = document.getElementById("expresion15").value;
    const validarIP4 = document.getElementById("expresion16").value;
    const validarColorHexa = document.getElementById("expresion17").value;

    // Apartado 1.
    if (soloNum.match(/^\d+$/) != null) {
        console.log("1.- Valido");
    } else {
        console.log("1.- No valido");
    }

    // Apartado 2.
    if (soloLetras.match(/^[a-zA-ZÀ-ÿ]+$/) != null) {
        console.log("2.- Valido");
    } else {
        console.log("2.- No valido");
    }

    //Apartado 3.
    if (letrasEspTildes.match(/^[a-zA-ZÀ-ÿ\s]+$/) != null) {
        console.log("3.- Valido");
    } else {
        console.log("3.- No valido");
    }

    //Apartado 4.
    if (nomApell.match(/^[A-Z][a-zÀ-ÿ]+[\s][A-Z][a-zÀ-ÿ]+[\s][A-Z]'?-?[a-zÀ-ÿ]+$/) != null) {
        console.log("4.- Valido");
    } else {
        console.log("4.- No valido");
    }

    //Apartado 5.
    if (precioDosDecimales.match(/^\d+,\d{2}$/) != null) {
        console.log("5.- Valido");
    } else {
        console.log("5.- No valido");
    }

    //Apartado 6.
    if (numeroEnteroDecimales.match(/^\d+([,]\d+)?$/) != null) {
        console.log("6.- Valido");
    } else {
        console.log("6.- No valido");
    }

    //Apartado 7.
    if (numeroEntPosNeg.match(/^-?\d+$/) != null) {
        console.log("7.- Valido");
    } else {
        console.log("7.- No valido");
    }

    //Apartado 8.
    if (numeroRealesSepar.match(/^\d{1,3}(?:,\d{3})*(?:\.\d+)$/) != null) {
        console.log("8.- Valido");
    } else {
        console.log("8.- No valido");
    }

    //Apartado 9.
    if (validarFecha.match(/^([12][0-9]|3[01]|0[1-9])\/(0[1-9]|1[0-2])\/\d{4}$/) != null) {
        console.log("9.- Valido");
    } else {
        console.log("9.- No valido");
    }

    //Apartado 10.
    if (validarHoras12.match(/^(1?[0-2]|0?[1-9]):[0-5][0-9]\s[AaPp][Mm]$/) != null) {
        console.log("10.- Valido");
    } else {
        console.log("10.- No valido");
    }

    //Apartado 11.
    if (validarHoras24.match(/^(1?[0-9]|0?[1-9]|2?[0-3]):[0-5][0-9]$/) != null) {
        console.log("11.- Valido");
    } else {
        console.log("11.- No valido");
    }

    //Apartado 12.
    if (validarContrasenya.match(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,}$/) != null) {
        console.log("12.- Valido");
    } else {
        console.log("12.- No valido");
    }

    //Apartado 13.
    if (validarUsuario.match(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[-_])[A-Za-z\d-_]{3,16}$/) != null) {
        console.log("13.- Valido");
    } else {
        console.log("13.- No valido");
    }

    //Apartado 14.
    if (validarEmail.match(/^$/) != null) {
        console.log("14.- Valido");
    } else {
        console.log("14.- No valido");
    }
}