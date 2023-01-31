let arrayNumAparSuma = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0];
let dado1 = 0;
let dado2 = 0;
let sumaDados = 0;

for (i = 0; i < 36000; i++) {
    dado1 = Math.floor(Math.random() * 6) + 1;
    dado2 = Math.floor(Math.random() * 6) + 1;
    sumaDados = dado1 + dado2;
    for (j = 2; j < 13; j++) {
        if (sumaDados === j) {
            arrayNumAparSuma[j - 2] += 1;
        }
    }
}

for (let i = 0; i < arrayNumAparSuma.length; i++) {
    document.getElementById("mostrar-array").innerHTML += i + ": " +arrayNumAparSuma[i] + ", ";
}
