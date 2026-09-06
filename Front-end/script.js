const moedaOrigem = document.getElementById("moedaOrigem");

const moedaDestino = document.getElementById("moedaDestino");

const botaoInverter = document.getElementById("botaoInverter");

botaoInverter.addEventListener("click", () => {

    let temporario = moedaOrigem.value;

    moedaOrigem.value = moedaDestino.value;

    moedaDestino.value = temporario;

});