$(document).ready(function () {
    let maxRandom = 10;
    let arrayFrases = ["Te esperan novedades en el dinero.", "Tu vida sentimental va a dar un vuelco.", "¿Has pensado en comprar lotería? ¡La suerte está contigo!", "Si no puedes convencerlos, confundelos.", "Aparecera en tu vida  una persona muy especial.", "El dia de hoy la gente te prestara mas atencion.", "Tendras un desafortunado encuentro.", "Tu amor a la música será una parte importante de tu vida.", "Un cambio importante se esta gestando, deberas ser observador.", "La suerte puede estar en una galleta."];
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
    });

    $("#anyadir").click(function () {
        let fraseAnyadir = $("#frase").val();
        if (fraseAnyadir !== "") {
            arrayFrases.push(fraseAnyadir);
            maxRandom++;
            window.alert(fraseAnyadir + " se ha añadido con exito.")
            $("#frase").val("");
        } else {
            window.alert("Tienes que introducir una frase.")
        }
    });
    document.getElementById("sound").play();
})