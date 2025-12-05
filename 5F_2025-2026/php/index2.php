<?php
/*
 * <?php

// array_map
// applica una funzione ogni elemento dell'array
$numeri = [1,2,3,4];
$risultato = array_map(function($n){
    return $n * 2;
}, $numeri);

echo $risultato;
// array_filter
// filtra gli elementi di un array in base a una condizione
$numeri = [1,2,3,4,5,6];
$pari = array_filter($numeri, function($n){
    return $n % 2 === 0;
});
//array walk
// applica una funzione ogni elemento dell'array senza restituire un nuovo array
$numeri = [1,2,3,4];
array_walk($numeri, function(&$n){
    $n = $n * 2;
});

// array_reduce
// riduce un array a un singolo valore
$numeri = [1,2,3,4];
$somma = array_reduce($numeri, function($carry, $n){
    return $carry + $n;
}, 0);

//lambda
$somma = fn($a, $b) => $a + $b;
echo $somma(2, 3); // 5
 */

echo "Operatore ternario:\n";
$s=0;
$risultato = $s >= 6 ? "OK" : "NO OK";
echo $risultato;
echo "<br>";
echo "\nOperatore coalescing:\n";
$nome=null;
$risultato2= $nome ?? "Valore di default";
echo $risultato2;
echo "<br>";
echo "operatore spaceship:\n";
$a=5;
$b=10;
$risultato3 = $a <=> $b; // -1 se a < b, 0 se a == b, 1 se a > b
echo $risultato3;

$stringa="Ciao Mondo!";
echo "strlen lunghezza della stringa: ". strlen($stringa);
echo "<br>";
echo "str_word_count numero di parole: ". str_word_count($stringa);
echo "<br>";
echo "strrev stringa al contrario: ". strrev($stringa);
echo "<br>";
echo "strpos posizione della parola Mondo: ". strpos($stringa, "Mondo");
echo "<br>";
echo "str_replace sostituisco Mondo con PHP: ". str_replace("Mondo", "PHP", $stringa);
echo "<br>";
echo "Funzioni per array:\n";
$numeri = [1, 2, 3, 4, 5]; 
echo ucfirst($stringa);

?>
