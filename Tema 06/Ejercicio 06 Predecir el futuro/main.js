function mostrarFuturo() {
    let arrayFrases = ["Te esperan novedades en el dinero.", "Tu vida sentimental va a dar un vuelco.", "¿Has pensado en comprar lotería? ¡La suerte está contigo!", "Si no puedes convencerlos, confundelos.", "Aparecera en tu vida  una persona muy especial.", "El dia de hoy la gente te prestara mas atencion.", "Tendras un desafortunado encuentro.", "Tu amor a la música será una parte importante de tu vida.", "Un cambio importante se esta gestando, deberas ser observador.", "La suerte puede estar en una galleta."];
    document.getElementById("boton").addEventListener("click", function (evt) {
        let texto = document.getElementById("texto").value;
        let numeroAleatorio = Math.floor(Math.random() * 10)
        if (texto.toLowerCase() === "dime mi futuro") {
            document.getElementById("resultado").innerHTML = arrayFrases[numeroAleatorio];
            document.getElementById("resultado").style.color = "black";
        } else {
            document.getElementById("resultado").innerHTML = "Tienes que introducir 'Dime mi futuro' para recibir una frase de la fortuna.";
            document.getElementById("resultado").style.color = "red";
        }
    })
}