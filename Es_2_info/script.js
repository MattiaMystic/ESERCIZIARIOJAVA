let x = 0;  
const provaButton = document.getElementById("Prova");
const prova2Button = document.getElementById("Prova2");
const prova3Button = document.getElementById("Prova3");
const prova4Button = document.getElementById("Prova4");
const output = document.getElementById("output");

provaButton.addEventListener("click", function() {
    x++;  

        let text=x;
        output.textContent = text;  
  
});
prova2Button.addEventListener("click", function() {
  x--;  
  
        let text=x;
        output.textContent = text;  
   
});
prova3Button.addEventListener("click", function() {
   background-color: red;
   

  
});
prova4Button.addEventListener("click", function() {
  background-color: blue;
   
});

