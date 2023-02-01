function stringTyped() {
    const maxLength = 80;
    let numeroCarac = document.getElementById("numeroCarac");
    window.addEventListener("keydown", function (ev) {
        let cadena = document.getElementById("texto");
        if (ev.key === "Backspace" || evt.key === "Delete") {
            numeroCarac.innerHTML = "Puedes escribir " + (maxLength - cadena.value.length) + " caracteres";
        }  else {
            numeroCarac.innerHTML = "Puedes escribir " + (maxLength - cadena.value.length) + " caracteres";
        }
    })
}