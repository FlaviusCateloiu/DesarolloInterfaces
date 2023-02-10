$(document).ready(function () {
    let imagenes = $("div img");
    imagenes.click(function () {
       imagenes.css("border-width", "0");
       imagenes.css("opacity", 0.4);
       $(this).css("border", "solid 5px black");
       $(this).css("opacity", 1);
    });
});