$(document).ready(function () {
    let maxRandom = 0;
    let arrayFrases = [];
    let arrayFrasesPorDefecto = ["Te esperan novedades en el dinero.", "Tu vida sentimental va a dar un vuelco.", "¿Has pensado en comprar lotería? ¡La suerte está contigo!", "Si no puedes convencerlos, confundelos.", "Aparecera en tu vida  una persona muy especial.", "El dia de hoy la gente te prestara mas atencion.", "Tendras un desafortunado encuentro.", "Tu amor a la música será una parte importante de tu vida.", "Un cambio importante se esta gestando, deberas ser observador.", "La suerte puede estar en una galleta."];

    if (window.localStorage.length < 10) {
        for (let i = 0; i < arrayFrasesPorDefecto.length; i++) {
            window.localStorage.setItem(("frase" + i), arrayFrasesPorDefecto[i]);
            arrayFrases.push(arrayFrasesPorDefecto[i]);
        }
    } else {
        for (let i = 0; i < window.localStorage.length; i++) {
             arrayFrases.push(window.localStorage.getItem(("frase" + i)));
        }
    }

    if (window.localStorage.getItem("nombre") !== null) {
        maxRandom = window.localStorage.length - 1;
    } else {
        maxRandom = window.localStorage.length;
    }

    $("#boton").click(async function () {
        let nombre = $("#nombre").val();
        let numeroAleatorio = Math.floor(Math.random() * maxRandom);
        $("#resultado").text("Consultando a los espíritus…");
        await new Promise(r => setTimeout(r, 2000));
        if (nombre.match(/^[A-Za-zÀ-ÿ]+$/)) {
            window.localStorage.setItem("nombre", nombre);
            $("#nombre").val("");
            $("#resultado").text(window.localStorage.getItem("nombre") + ", " + arrayFrases[numeroAleatorio]);
        } else {
            //Comprobar que la cookie contiene algun nombre para saber si sacar el resultado con ese nombre o no.
            if (window.localStorage.getItem("nombre") !== null) {
                $("#resultado").text(window.localStorage.getItem("nombre") + ", " + arrayFrases[numeroAleatorio]);
            } else {
                $("#resultado").text(arrayFrases[numeroAleatorio]);
            }
        }

        if (arrayFrases.length === 0) {
            for (let i = 0; i < window.localStorage.length; i++) {
                arrayFrases.push(window.localStorage.getItem(("frase" + i)));
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