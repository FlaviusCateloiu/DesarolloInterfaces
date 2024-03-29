$(document).ready(function () {

    if (window.localStorage.length === 0) {
        generarGrafoTension(0);
        generarGrafoPulsaciones(0);
        generarGrafoPesoEdad(0);
    } else {
        generarGrafoTension( window.localStorage.length - 1);
        generarGrafoPulsaciones(window.localStorage.length - 1);
        generarGrafoPesoEdad(window.localStorage.length - 1);
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
        if (tensionSis < 60) {
            console.log("Tienes que introducir una Tensión Sistólica positiva.");
            correct = false;
        }
        if (tensionDias < 60) {
            console.log("Tienes que introducir una Tensión Diastólica positiva.");
            correct = false;
        }
        if (pulsaciones < 60) {
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
            generarGrafoTension(window.localStorage.length - 1);
            generarGrafoPulsaciones(window.localStorage.length - 1);
            generarGrafoPesoEdad(window.localStorage.length - 1);
        }
    });
});

function generarGrafoTension(cookiesLong) {
    let xArray = [];
    let yArray1 = [];
    let yArray2 = [];

    for (let i = 0; i < (cookiesLong / 5); i++) {
        yArray1.push(window.localStorage.getItem("tensionSis" + i));
        yArray2.push(window.localStorage.getItem("tensionDias" + i));
        xArray.push(i + 1);
    }

    let data = [
        {x: xArray, y: yArray1, mode: "markers"},
        {x: xArray, y: yArray2, mode: "markers"}
    ];

    let layout = {
        xaxis: {range: [0, 30], title: "Tiempo"},
        yaxis: {range: [40, 200], title: "Tensión"},
        title: "Tensión Sistólica vs Diastólica"
    };

    Plotly.newPlot("grafo-tension", data, layout);
}

function generarGrafoPulsaciones(cookiesLong) {
    let xArray = [];
    let yArray = [];

    for (let i = 0; i < (cookiesLong / 5); i++) {
        yArray.push(window.localStorage.getItem("pulsaciones" + i));
        xArray.push(i + 1);
    }

    let data = [
        {x: xArray, y: yArray, mode: "markers"}
    ];

    let layout = {
        xaxis: {range: [0, 30], title: "Tiempo"},
        yaxis: {range: [40, 200], title: "Pulsaciones"},
        title: "Pulsaciones al Tiempo"
    };

    Plotly.newPlot("grafo-pulsaciones", data, layout);
}

function generarGrafoPesoEdad(cookiesLong) {
    let xArray = [];
    let yArray = [];

    for (let i = 0; i < (cookiesLong / 5); i++) {
        xArray.push(window.localStorage.getItem("edad" + i));
        yArray.push(window.localStorage.getItem("peso" + i));
    }

    let data = [
        {x: xArray, y: yArray, mode: "markers"}
    ];

    let layout = {
        xaxis: {range: [0, 160], title: "Edad"},
        yaxis: {range: [0, 200], title: "Peso"},
        title: "Peso vs Edad"
    };

    Plotly.newPlot("grafo-peso-edad", data, layout);
}