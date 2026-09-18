const moedaOrigem = document.getElementById("moedaOrigem");

const moedaDestino = document.getElementById("moedaDestino");

const botaoInverter = document.getElementById("botaoInverter");

botaoInverter.addEventListener("click", () => {

    let temporario = moedaOrigem.value;

    moedaOrigem.value = moedaDestino.value;

    moedaDestino.value = temporario;

});


const botaoTema = document.getElementById("botao-tema");

botaoTema.addEventListener("click", () => {
    document.body.classList.toggle("dark");
});

// Comunicação com o backend Spring
fetch("http://localhost:8080/moedas/USD")
    .then(resposta => resposta.json())
    .then(dados => {
        console.log(dados);
    });