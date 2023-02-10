/**
 * Función que pinta todos los elementos menos los botones en color rojo
 */

/**
 * Función que pinta el elemento pulsado en color verde
 */

/**
 * Función que restaura la página eliminando clases asignadas
 */

/**
 * Inicializa las funciones tras cargar el documento y añade eventos
 * a cada uno de los elementos correspondientes.
 */
$(document).ready(function () {
    $("#cambiarTodo").click(function () {
        $("h1, h2, p").removeClass().addClass("rojo");
    });

    $("#reset").click(function () {
        $("h1, h2, p").removeClass();
    });

    $("h1, h2, p").click(function () {
        $(this).removeClass().addClass("verde");
    });
});