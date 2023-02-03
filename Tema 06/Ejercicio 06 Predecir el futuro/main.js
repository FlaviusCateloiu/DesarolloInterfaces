function mostrarFuturo() {
    let maxRandom = 10;
    let arrayFrases = ["Te esperan novedades en el dinero.", "Tu vida sentimental va a dar un vuelco.", "¿Has pensado en comprar lotería? ¡La suerte está contigo!", "Si no puedes convencerlos, confundelos.", "Aparecera en tu vida  una persona muy especial.", "El dia de hoy la gente te prestara mas atencion.", "Tendras un desafortunado encuentro.", "Tu amor a la música será una parte importante de tu vida.", "Un cambio importante se esta gestando, deberas ser observador.", "La suerte puede estar en una galleta."];
    document.getElementById("boton").addEventListener("click", async function (evt) {
        let nombre = document.getElementById("nombre").value;
        let numeroAleatorio = Math.floor(Math.random() * maxRandom)
        document.getElementById("resultado").innerHTML = "Consultando a los espíritus…";
        await new Promise(r => setTimeout(r, 2000));
        if (nombre.match(/^[A-Za-zÀ-ÿ]+$/)) {
            document.getElementById("resultado").innerHTML = nombre + ", " + arrayFrases[numeroAleatorio];
        } else {
            document.getElementById("resultado").innerHTML = arrayFrases[numeroAleatorio];
        }

    });

    document.getElementById("anyadir").addEventListener("click", function (evt) {
        let fraseAnyadir = document.getElementById("frase").value;
        if (fraseAnyadir !== "") {
            arrayFrases.push(fraseAnyadir);
            maxRandom++;
            window.alert(fraseAnyadir + " se ha añadido con exito.")
        } else {
            window.alert("Tienes que introducir una frase.")
        }
    });
    let sound = document.getElementById("sound").play();
}