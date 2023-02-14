$(document).ready(function () {
    $("input[type=button]").dblclick(function () {
        window.alert("adios")
    });

    $("input[type=button]").click(function () {
       let texto = $("anadir").getText();
       window.alert(texto);
    });
});