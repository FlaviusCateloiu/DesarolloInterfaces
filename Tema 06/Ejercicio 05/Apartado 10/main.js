function muestraInformacion() {
    window.addEventListener("mousemove", function (evt) {
        let raton = document.getElementById("raton");
        raton.children[1].innerHTML = "Navegador [" + evt.screenX + ", " + evt.screenY + "]" + "<br>" + "Pagina [" + evt.pageX + ", " + evt.pageY + "]";
        raton.style.backgroundColor = "#FFFFFF";
        let teclado = document.getElementById("teclado");
        teclado.style.backgroundColor = "#FFFFFF";

    });
    window.addEventListener("keydown", function (evt) {
        let teclado = document.getElementById("teclado");
        teclado.children[1].innerHTML = "Carácter [" + evt.key +"]" + "<br>" + "Código [" + evt.key.charCodeAt(0) +"]"
        teclado.style.backgroundColor = "#CCE6FF";
    })
    window.addEventListener("mousedown", function () {
        let raton = document.getElementById("raton");
        raton.style.backgroundColor = "#FFFFCC";
    });
}