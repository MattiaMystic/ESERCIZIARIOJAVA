let x = 0;  
const provaButton = document.getElementById("Prova");
const prova2Button = document.getElementById("Prova2");
const prova3Button = document.getElementById("Prova3");
const prova4Button = document.getElementById("Prova4");
const output = document.getElementById("output");
const colore= document.getElementById("colore");

provaButton.addEventListener("click", function() {
    x++;  
    output.textContent = x;  
});

prova2Button.addEventListener("click", function() {
    x--;  
    output.textContent = x;  
});

prova3Button.addEventListener("click", function() {
    colore.style.backgroundColor = "red";
});

prova4Button.addEventListener("click", function() {
    colore.style.backgroundColor = "blue";
});
