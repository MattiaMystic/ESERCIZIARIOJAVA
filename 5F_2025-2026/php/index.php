<?php
echo 'ciao';
echo '<br>';
echo 'buongiorno a tutti';
echo '<br>';
$var = 10;
echo 'il valore della variabile è ' . $var;
echo '<br>';
var_dump($var);
$var = 'ciao';
$var2 = 10;
echo '<br>';
var_dump($var);
echo '<br>';
echo M_PI;
echo '<br>';
echo PHP_INT_MAX;
echo '<br>';
echo PHP_INT_MIN;
if ($var2 > 5)
    echo 'la variabile 2 è maggiore di 5';
else echo 'La variabile 2 è minore o uguale a 5';
echo '<br>';
echo 'DICHIARAZIONE E USO DI VETTORI';
echo '<br>';
$vett1 = [];
$vett = [10, 20, 30];
echo '<br>';
#echo phpinfo();
echo 'primo elemento del vettore: ';
echo $vett[0];
echo '<br>';
echo 'Conteggio degli elementi del vettore: ';
$n = count($vett);
echo $n;
echo '<br>';
echo 'Stampa degli elementi del vettore con ciclo for: ';
echo '  ';
for ($i = 0; $i < $n; $i++) {
    echo $vett[$i];
    echo '  ';
}
echo '<br>';
echo 'Stampa degli elementi del vettore con print_r: ';
print_r($vett);
echo '<br>';
echo 'Stampa degli elementi del vettore con var_dump: ';
var_dump($vett);
echo '<br>';
echo 'Dichiarazione e uso di vettori con elementi di tipo diverso: ';
$vett2 = [10, 20, 30, 'a', 'b'];
var_dump($vett2);
echo '<br>';
echo 'Aggiunta di elementi al vettore: ';
echo '<br>';
array_push($vett2, 50);
echo implode(' ', $vett2);
echo '<br>';
$vett2[] = 60;
echo implode(' ', $vett2);
echo '<br>';
echo 'Cancello ultimo elemento del vettore: ';
array_pop($vett2);
echo implode(' ', $vett2);
echo '<br>';
echo 'Cancellazione del primo elemento del vettore: ';
array_shift($vett2);
echo implode(' ', $vett2);;
echo '<br>';
echo 'Cancellazione di un elemento in una posizione specifica del vettore: ';
unset($vett2[2]);
echo implode(' ', $vett2);
echo '<br>';
echo 'Controllo se un elemento è presente nel vettore: ';
if (in_array(20, $vett2))
    echo 'L\'elemento 20 è presente nel vettore';
else
    echo 'L\'elemento 20 non è presente nel vettore';
echo '<br>';
echo 'Ordinamento del vettore in ordine crescente: ';
sort($vett2);
echo implode(' ', $vett2);
echo '<br>';
echo 'Ordinamento del vettore in ordine decrescente: ';
rsort($vett2);
echo implode(' ', $vett2);
echo '<br>';
echo 'Dichiarazione e uso di array associativi: ';
$studente = [
    'nome' => 'Mario',
    'cognome' => 'Rossi',
    'eta' => 18
];
echo '<br>';
echo $studente['nome'];
