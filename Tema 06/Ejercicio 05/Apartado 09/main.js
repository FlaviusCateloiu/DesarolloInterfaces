function mostrarLosOcultos(id) {
    var parrafo = document.getElementById('parrafo_'+id);
    var enlace = document.getElementById('enlace_'+id);

    if(parrafo.style.display == "" || parrafo.style.display == "block") {
        parrafo.style.display = "none";
        enlace.innerHTML = 'Mostrar contenidos';
    }
    else {
        parrafo.style.display = "block";
        enlace.innerHTML = 'Ocultar contenidos';
    }
}