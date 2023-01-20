function sacarFactorial() {
    let arrayFactorial = [];
    let numeroFactorial = document.getElementById("num-factorial").value;
    let sumaTotal = 1;

    if (numeroFactorial > 0) {
        for (let i = numeroFactorial; i > 0; i--) {
            sumaTotal *= i;
            arrayFactorial.push(i);
        }
        document.getElementById("mostrar-resultado").innerHTML = numeroFactorial + ": " + arrayFactorial.join(", ") + " = " + sumaTotal;
        document.getElementById("error-num-negativo").innerHTML = "";
    } else {
        document.getElementById("error-num-negativo").innerHTML = "Error has introducido un numero negativo";
        document.getElementById("mostrar-resultado").innerHTML = "";
    }


}