$(document).ready(function () {
    let maxRandom = 0
    let arrayFrasesUtilizar = [false, false, false, false, false, false, false, false, false, false];
    let arrayFrases = ["Te esperan novedades en el dinero.", "Tu vida sentimental va a dar un vuelco.", "¿Has pensado en comprar lotería? ¡La suerte está contigo!", "Si no puedes convencerlos, confundelos.", "Aparecera en tu vida  una persona muy especial.", "El dia de hoy la gente te prestara mas atencion.", "Tendras un desafortunado encuentro.", "Tu amor a la música será una parte importante de tu vida.", "Un cambio importante se esta gestando, deberas ser observador.", "La suerte puede estar en una galleta."];

    for (let i = 0; i < arrayFrases.length; i++) {
        window.localStorage.setItem(("frase" + i), arrayFrases[i]);
    }

    if (window.localStorage.getItem("nombre") !== null) {
        maxRandom = window.localStorage.length - 1;
    } else {
        maxRandom = window.localStorage.length;
    }

    $("#boton").click(async function () {
        let nombre = $("#nombre").val();
        let adios = false;
        while (!adios) {
            let numeroAleatorio = Math.floor(Math.random() * maxRandom);
            adios = arrayFrasesUtilizar[numeroAleatorio];
            if (!adios) {
                $("#resultado").text("Consultando a los espíritus…");
                await new Promise(r => setTimeout(r, 2000));
                if (nombre.match(/^[A-Za-zÀ-ÿ]+$/)) {
                    window.localStorage.setItem("nombre", nombre);
                    $("#nombre").val("");
                    $("#resultado").text(window.localStorage.getItem("nombre") + ", " + window.localStorage.getItem("frase" + numeroAleatorio));
                    arrayFrasesUtilizar[numeroAleatorio] = true;
                    adios = true;
                } else {
                    //Comprobar que la cookie contiene algun nombre para saber si sacar el resultado con ese nombre o no.
                    if (window.localStorage.getItem("nombre") !== null) {
                        $("#resultado").text(window.localStorage.getItem("nombre") + ", " + window.localStorage.getItem("frase" + numeroAleatorio));
                    } else {
                        $("#resultado").text(window.localStorage.getItem("frase" + numeroAleatorio));
                    }
                    arrayFrasesUtilizar[numeroAleatorio] = true;
                    adios = true;
                }
            }
        }

        let checker = arr => arr.every(Boolean);
        console.log(checker(arrayFrasesUtilizar));
    });

    $("#anyadir").click(function () {
        let fraseAnyadir = $("#frase").val();
        if (fraseAnyadir !== "") {
            window.localStorage.setItem(("frase" + maxRandom), fraseAnyadir);
            arrayFrasesUtilizar.push(false);
            maxRandom++;
            $("#frase").val("");
        } else {
            window.alert("Error tienes que introducir una frase.");
        }
    });
    document.getElementById("sound").play();
});