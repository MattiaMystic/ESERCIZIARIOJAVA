
const colori = ["Giallo", "Verde", "Rosso", "Marrone", "Arancione"];
colori.forEach((e, i) => {
    console.log("colore: " + e.toUpperCase() + " indice" + i);
});
//FUNZIONI CallBack in linea
const numeri = [11, -4, 55, 77, 85, 35, 76, 90, 16, 19];
console.log(numeri);
console.log(numeri.filter(n => n > 20));
const numeriFiltrati = numeri.filter((n => n > 20));
console.log(numeriFiltrati);

const test = [1, 2, 3, 4];
console.log(test.map(n => n * n));


const somma = [5, 10, 15, 20];
console.log(somma.reduce((somm, numero) => somm + numero ));// aggiugne a somm ogni volta num ovvero il valore dentro l'indice dell'array




