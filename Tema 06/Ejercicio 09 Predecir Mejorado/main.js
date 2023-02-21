$(document).ready(function () {
    let maxRandom = 0;
    let arrayInicio = [];
    let arrayFin = [];
    let arrayFrases = [];
    let arrayFrasesPorDefecto = ["Te esperan novedades en el dinero.", "Tu vida sentimental va a dar un vuelco.", "¿Has pensado en comprar lotería? ¡La suerte está contigo!", "Si no puedes convencerlos, confundelos.", "Aparecera en tu vida  una persona muy especial.", "El dia de hoy la gente te prestara mas atencion.", "Tendras un desafortunado encuentro.", "Tu amor a la música será una parte importante de tu vida.", "Un cambio importante se esta gestando, deberas ser observador.", "La suerte puede estar en una galleta."];

    if (window.localStorage.getItem("nombre") !== null) {
        maxRandom = window.localStorage.length - 1;
    } else {
        maxRandom = window.localStorage.length;
    }

    if (window.localStorage.getItem("nombre") !== null) {
        for (let i = 0; i < arrayFrasesPorDefecto.length; i++) {
            window.localStorage.setItem(("frase" + i), arrayFrasesPorDefecto[i]);
            arrayFrases.push(arrayFrasesPorDefecto[i]);
        }
    } else {
        for (let i = 0; i < window.localStorage.length - 1; i++) {
            arrayFrases.push(window.localStorage.getItem(("frase" + i)));
        }
    }

    $("#boton").click(async function () {
        let nombre = $("#nombre").val();
        let numeroAleatorio = Math.floor(Math.random() * maxRandom);
        $("#resultado").text("Consultando a los espíritus…");
        //await new Promise(r => setTimeout(r, 2000));

        if (nombre.match(/^[A-Za-zÀ-ÿ]+$/)) {
            window.localStorage.setItem("nombre", nombre);
            $("#nombre").val("");
            $("#resultado").text(window.localStorage.getItem("nombre") + ", " + arrayFrases[numeroAleatorio]);

            arrayInicio = arrayFrases.slice(0, numeroAleatorio);
            arrayFin = arrayFrases.slice(numeroAleatorio + 1, arrayFrases.length);
            arrayFrases = arrayInicio.concat(arrayFin);
            maxRandom--;
            console.log(arrayFrases);
        } else {
            //Comprobar que la cookie contiene algun nombre para saber si sacar el resultado con ese nombre o no.
            if (window.localStorage.getItem("nombre") !== null) {
                $("#resultado").text(window.localStorage.getItem("nombre") + ", " + arrayFrases[numeroAleatorio]);

                arrayInicio = arrayFrases.slice(0, numeroAleatorio);
                arrayFin = arrayFrases.slice(numeroAleatorio + 1, arrayFrases.length);
                arrayFrases = arrayInicio.concat(arrayFin);
                maxRandom--;
                console.log(arrayFrases)
            } else {
                $("#resultado").text(arrayFrases[numeroAleatorio]);

                arrayInicio = arrayFrases.slice(0, numeroAleatorio);
                arrayFin = arrayFrases.slice(numeroAleatorio + 1, arrayFrases.length);
                arrayFrases = arrayInicio.concat(arrayFin);
                maxRandom--;
                console.log(arrayFrases)
            }
        }

        if (arrayFrases.length === 0) {
            if (window.localStorage.getItem("nombre") !== null) {
                for (let i = 0; i < window.localStorage.length - 1; i++) {
                    arrayFrases.push(window.localStorage.getItem(("frase" + i)));
                }
                console.log(arrayFrases);
                maxRandom = window.localStorage.length - 1;
            } else {
                maxRandom = window.localStorage.length;
            }
        }
    });

    $("#anyadir").click(function () {
        let fraseAnyadir = $("#frase").val();
        if (fraseAnyadir !== "") {
            window.localStorage.setItem(("frase" + maxRandom), fraseAnyadir);
            arrayFrases.push(fraseAnyadir);
            maxRandom++;
            $("#frase").val("");
        } else {
            window.alert("Error tienes que introducir una frase.");
        }
    });
    document.getElementById("sound").play();
});