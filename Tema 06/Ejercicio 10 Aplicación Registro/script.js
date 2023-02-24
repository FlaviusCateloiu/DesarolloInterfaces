$(document).ready(function () {

    if (window.localStorage.length === 0) {
        generarGrafoTension(0);
    } else {
        generarGrafoTension(window.localStorage.length - 1);
    }

    $("#enviar").click(function () {
        let numberNewCockies = 0;
        let correct = true;
        let nombre = $("#nombre").val(), edad = $("#edad").val(), peso = $("#peso").val(),
            tensionSis = $("#tension-sistolica").val(), tensionDias = $("#tension-diastolica").val(),
            pulsaciones = $("#pulsacion").val();

        if (nombre.match(/^[A-Za-zÀ-ÿ]+$/) == null) {
            console.log("Tienes que introducir un Nombre.");
            correct = false;
        }
        if (edad <= 0 || edad > 150) {
            console.log("Tienes que introducir una Edad con el formato correcto");
            correct = false;
        }
        if (peso <= 0) {
            console.log("Tienes que introducir un peso positivo.");
            correct = false;
        }
        if (tensionSis <= 0) {
            console.log("Tienes que introducir una Tensión Sistólica positiva.");
            correct = false;
        }
        if (tensionDias <= 0) {
            console.log("Tienes que introducir una Tensión Diastólica positiva.");
            correct = false;
        }
        if (pulsaciones <= 0) {
            console.log("Tienes que introducir Pulsaciones positiva.");
            correct = false;
        }

        if (correct) {
            window.localStorage.setItem("nombre", nombre);
            if (window.localStorage.length <= 1) {
                window.localStorage.setItem("edad" + numberNewCockies, edad);
                window.localStorage.setItem("peso" + numberNewCockies, peso);
                window.localStorage.setItem("tensionSis" + numberNewCockies, tensionSis);
                window.localStorage.setItem("tensionDias" + numberNewCockies, tensionDias);
                window.localStorage.setItem("pulsaciones" + numberNewCockies, pulsaciones);
            } else {
                numberNewCockies = (window.localStorage.length - 1) / 5;
                window.localStorage.setItem("edad" + numberNewCockies, edad);
                window.localStorage.setItem("peso" + numberNewCockies, peso);
                window.localStorage.setItem("tensionSis" + numberNewCockies, tensionSis);
                window.localStorage.setItem("tensionDias" + numberNewCockies, tensionDias);
                window.localStorage.setItem("pulsaciones" + numberNewCockies, pulsaciones);
            }
        }
    });
});

function generarGrafoTension(cookiesLog) {
    let xArray = [];
    let yArray = [];

    let data = [{
        x: xArray,
        y: yArray,
        mode: "lines",
    }];

    let layout = {
        xaxis: {range: [60, 200] , title: "Tensión Sistólica"},
        yaxis: {range: [40, 120], title: "Tensión Diastólica"},
        title: "Tensión Sistólica vs Diastólica"
    };

    Plotly.newPlot("grafo-tension", data, layout);
}