//DOM
const bott = document.getElementById("bottone");
    const colore1 = document.querySelectorAll("div");

bott.addEventListener("click", function() {

    colore1.forEach((color) => {
        color.style.backgroundColor = "red";
    })
});


const bott2 = document.getElementById("p");
    bott2.addEventListener("click", () =>{
        document.body.append(document.createElement('p'));
    

    });