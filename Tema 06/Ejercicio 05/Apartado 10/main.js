function muestraInformacion(theEvent) {
    let evento = theEvent || window.event;
    switch (evento.type) {
        case 'mousemove':
            document.getElementById("raton").style.backgroundColor = '#FFFFFF';
            let coordenadaXRelativa, coordenadaYRelativa, coordenadaXAbsoluta, coordenadaYAbsoluta;
            if (navigator.userAgent.toLowerCase().indexOf("msie") != -1) {
                if (document.documentElement && document.documentElement.scrollTop) {
                    coordenadaXAbsoluta = evento.clientX + document.documentElement.scrollLeft;
                    coordenadaYAbsoluta = evento.clientY + document.documentElement.scrollTop;
                } else {
                    coordenadaXAbsoluta = evento.clientX + document.body.scrollLeft;
                    coordenadaYAbsoluta = evento.clientY + document.body.scrollTop;
                }
            } else {
                coordenadaXAbsoluta = evento.pageX;
                coordenadaYAbsoluta = evento.pageY;
            }
            coordenadaXRelativa = evento.clientX;
            coordenadaYRelativa = evento.clientY;

            document.getElementById("raton").innerHTML += "<p>Navigator [" + coordenadaXRelativa + ", " + coordenadaYRelativa + "]</p>";
            document.getElementById("raton").innerHTML += "<p>Pagina [" + coordenadaXAbsoluta + ", " + coordenadaYAbsoluta + "]</p>";
            break;
        case 'keypress':
            document.getElementById("teclado").style.backgroundColor = '#CCE6FF';
            let caracter = evento.charCode || evento.keyCode;
            let letra = String.fromCharCode(caracter);
            let codigo = letra.charCodeAt(0);
            document.getElementById("teclado").innerHTML += "<p>Caracter [" + letra + "]</p>";
            document.getElementById("teclado").innerHTML += "<p>Pagina [" + codigo + "]</p>";
            break;
        case 'click':
            document.getElementById('raton').style.backgroundColor = '#FFFFCC';
            break;
    }
}

document.onmousemove = muestraInformacion();
document.onkeypress = muestraInformacion();
document.onclick = muestraInformacion();