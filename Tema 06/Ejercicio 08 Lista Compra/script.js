$(document).ready(function () {
    $("#anadir-lista").click(function () {
        let texto = $("#anadir").val();
        if (texto.match(/^.+$/)) {
            texto = texto + " - " + new Date().toLocaleString();
            $("#listaCompra").append("<li>" + texto + "</li>");
            window.localStorage.setItem("product" + window.localStorage.length, texto);
        } else {
            console.log("Error tienes que introducir algo en el texto.");
        }
    });

    $("#anadir-lista").dblclick(function () {
        $("#listaCompra li").remove();
    });

    $("#resetear-lista").click(function () {
        for (let i = 0; i < window.localStorage.length; i++) {
            $("#listaCompra").append("<li>" + window.localStorage.getItem("product" + i) + "</li>");
        }
    });
});