function tamanoVentanaNavegador(){
    // Adaptada de http://www.howtocreate.co.uk/tutorials/javascript/browserwindow
    var dimensiones = [];

    if(typeof(window.innerWidth) == 'number') {
        // No es IE
        dimensiones = [window.innerWidth, window.innerHeight];
    } else if(document.documentElement && (document.documentElement.clientWidth || document.documentElement.clientHeight)) {
        //IE 6 en modo estandar (no quirks)
        dimensiones = [document.documentElement.clientWidth, document.documentElement.clientHeight];
    } else if(document.body && (document.body.clientWidth || document.body.clientHeight)) {
        //IE en modo quirks
        dimensiones = [document.body.clientWidth, document.body.clientHeight];
    }

    return dimensiones;
}

function informar() {
    window.addEventListener("mousedown", function (evt) {
        let posicion = document.getElementsByClassName("posicion")[0];
        let tamanyoPantalla= tamanoVentanaNavegador();
        let mitadPosicion = [tamanyoPantalla[0]/2, tamanyoPantalla[1]/2];
        if (evt.pageX > mitadPosicion[0] && evt.pageY > mitadPosicion[1]) {
            posicion.innerHTML = "Derecha abajo";
        }
        if (evt.pageX > mitadPosicion[0] && evt.pageY < mitadPosicion[1]) {
            posicion.innerHTML = "Derecha arriba";
        }
        if (evt.pageX < mitadPosicion[0] && evt.pageY > mitadPosicion[1]) {

            posicion.innerHTML = "Izquierda abajo";
        }
        if (evt.pageX < mitadPosicion[0] && evt.pageY < mitadPosicion[1]) {
            posicion.innerHTML = "Izquierda arriba";
        }
    })
}