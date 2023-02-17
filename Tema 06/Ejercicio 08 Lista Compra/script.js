$(document).ready(function () {
    $("#anadir-lista").click(function () {
        let texto = $("#anadir").val();
        if (texto.match(/^.+$/)) {
            texto = texto + " - " + new Date().toLocaleString();
            $("#listaCompra").append("<li>" + texto + "</li>");
            $("#listaCompra li").dblclick(function () {
                this.remove();
            });
            window.localStorage.setItem("product" + window.localStorage.length, texto);
        } else {
            console.log("Error tienes que introducir algo en el texto.");
        }
    });

    $("#resetear-lista").click(function () {
        for (let i = 0; i < window.localStorage.length; i++) {
            $("#listaCompra").append("<li>" + window.localStorage.getItem("product" + i) + "</li>");
            $("#listaCompra li").dblclick(function () {
                this.remove();
            });
        }
    });
});

function setup() {
    noCanvas()
    frameRate(1)

    let html = `
            <circle 
                cx="150" 
                cy="150" 
                r="5" 
                stroke="transparent" 
                fill="black" 
            />
            `
    for (let i = 0; i < 60; i++) {
        html += `
                <circle 
                    cx="${(130 * cos(2 * PI * i / 60)) + 150}" 
                    cy="${(130 * sin(2 * PI * i / 60)) + 150}" 
                    r="${i % 15 == 0 ? 4 : i % 5 == 0 ? 2 : 1}" 
                    stroke="transparent" 
                    fill="rgba(0,0,0,0.5)" 
                    stroke-width="1"
                />`
    }
    select("#puntos").html(html)
}

function draw() {
    let angulo_segundo = 360 * second() / 60
    let angulo_minuto = 360 * minute() / 60
    let angulo_hora = 360 * (hour() % 12) / 12

    select("#manecilla-segundo").style("transform", `rotate(${angulo_segundo}deg)`)
    select("#manecilla-minuto").style("transform", `rotate(${angulo_minuto}deg)`)
    select("#manecilla-hora").style("transform", `rotate(${angulo_hora}deg)`)
}