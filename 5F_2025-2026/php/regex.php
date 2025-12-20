<?php

$testo = "Ciaomondo";
preg_match("#mondo#", $testo);

echo preg_match("#mondo#", $testo) ? "Pattern trovato": "Pattern non trovato";
echo "<br>";

echo preg_match("#^ciao#", "ciao a tutti") ? "Pattern trovato all'inizio": "Pattern non trovato all'inizio";//^ indica all'inizio
echo "<br>";
echo preg_match("#^tutti#", "ciao a tutti") ? "Pattern trovato all'inizio": "Pattern non trovato all'inizio";//^ indica all'inizio
echo "<HR>";
echo "<br>";
echo preg_match("#tutti$#", "ciao a tutti") ? "Pattern trovato alla fine": "Pattern non trovato alla fine";//$ indica alla fine
echo "<br>";

echo preg_match("#[0-9]#", "ciao 532 a tutti") ? "Pattern ha trovato cifre da 0 a 9": "Pattern non ha trovato cifre da 0 a 9";//- fa intervallo numerico e lettere.. almeno UN NUMERO CON PARENTESI QUADRA
echo "<br>";
echo preg_match("#[^0-9]#", "ciao 532 a tutti") ? "true": "false";//^ dentro parentesi quadre indica negazione
echo "<br>";
echo preg_match("#[^0-9]#", "532") ? "true": "false";//^ dentro parentesi quadre indica negazione
echo "<br>";
echo preg_match("#[a-zA-C]#", "CIAO 3345a tutti") ? "Pattern ha trovato lettere minuscole da a a z": "Pattern non ha trovato lettere minuscole da a a z";//- fa intervallo numerico e lettere.. almeno UNA LETTERA CON PARENTESI QUADRA
echo "<br>";
echo "<HR>";
echo preg_match("#R[aeiou]vigo#", "Rvigo")? "True":"False";
echo "<br>";
echo "<HR>";
//Possiamo rendere opzionale un carattere con il ?
echo preg_match("#R[aeiou]?vigo#", "Rvigo")? "True":"False";
echo "<br>";
echo preg_match("#R[aeiou]?vigo#", "Rovigo")? "True":"False";
echo "<br>";
echo preg_match("#R[aeiou]?vigo#", "Reavigo")? "True":"False";
echo "<br>";
echo "<HR>";
//ora nessuna,una,cento mila
echo preg_match("#R[aeiou]*vigo#", "Raeiouvigo")? "True":"False";
echo "<br>";
echo "<HR>";
//Invece con uno o piu
echo preg_match("#R[aeiou]+vigo#", "Rvigo")? "True":"False";
echo "<br>";
echo preg_match("#R[aeiou]+vigo#", "Ravigo")? "True":"False";
echo "<br>";
echo preg_match("#R[aeiou]+vigo#", "Raaaeaeaeavigo")? "True":"False";
echo "<br>";
echo "<HR>";
//Con un numero finale
echo preg_match("#R[aeiou]+vigo[0-9]#", "Raeiouvigo5",$matches)? "True":"False";
echo "<br>";
var_dump($matches);//Cosa abbiamo catturato? Tutta la stringa che rispetta il pattern
echo "<br>";
echo "<HR>";
echo preg_match("#R[aeiou]#", "Raeiouvigo5",$matches)? "True":"False";
echo "<br>";
var_dump($matches);//Ha trovato solo Ra perche' si ferma alla prima occorrenza e non continua, per continuare serve *
echo "<br>";
echo preg_match("#R[aeiou]*#", "Raeiouvigo5",$matches)? "True":"False";
echo "<br>";
var_dump($matches);//Ora cattura tutta la sequenza di vocali dopo R
echo "<br>";
echo preg_match("#R[aeiou]vigo#", "Raeiouvigo5",$matches)? "True":"False";
echo "<br>";
var_dump($matches);
echo "<br>";
echo "<HR>";
echo preg_match("#ciao#i", "CIAO") ? "True":"False";//i rende case insensitive
echo "<br>";
echo "<HR>";
$tel= "0123456789";
//minimo 3 massimo 8 numeri
echo preg_match("#[0-9]{3,8}#",$tel,$matches)? "True":"False";//deve esserci una sequenza di 9 numeri
echo "<br>";
var_dump($matches);
echo "<br>";
echo "<HR>";
echo preg_match("#verde|rosso|blu#", "verde") ? "True": "False";//OR |
echo "<br>";

















