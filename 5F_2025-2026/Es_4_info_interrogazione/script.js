
    const numeri = document.getElementById("numeri");
    const arr = [1, 2, 3, 4, 50, 60, 7, 8, 90, 10];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > 10) {
            numeri.textContent += arr[i] + " "; // aggiunge il numero all'elemento
            console.log(arr[i]);
        }
    }
