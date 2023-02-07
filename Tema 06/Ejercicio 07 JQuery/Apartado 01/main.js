function apartadoA() {
    $("ul").hide();
}

function apartadoB() {
    $("ul").show();
}

function apartadoC() {
    $("ul").append('<li>Item 0</li>');
}

function apartadoD() {
    $("ul").prepend("<li>Item 0</li>");
}

function apartadoE() {
    $("li:last").remove();
}

function apartadoF() {
    $("li:first").remove();
}

function apartadoG() {
    myElementos = $("li");
    myElementos[0].remove();
    myElementos[1].remove();
}

function apartadoH() {
    myElementos = $("li");
    myElementos[myElementos.length - 1].remove();
    myElementos[myElementos.length - 2].remove();
}