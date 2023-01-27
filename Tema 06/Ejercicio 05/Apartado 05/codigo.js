function expresionRegulares() {
    let fecha = document.getElementById("fecha").value;
    let email = document.getElementById("email").value;

    //Expresion regular para la fecha.
    if (fecha.match(/^[a-zA-ZÀ-ÿ\s]*([12][0-9]|3[01]|0[1-9])\/(0[1-9]|1[0-2])\/\d{4}[a-zA-ZÀ-ÿ\s\.]*$/) != null) {
        console.log("La fecha es valida.");
    } else {
        console.log("La fecha no es valida.");
    }

    //Expresion regular para el email.
    if (email.match(/^[a-zA-Z0-9.-]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]{2,3}$/) != null) {
        console.log("La email es valida.");
    } else {
        console.log("La email no es valida.");
    }
}