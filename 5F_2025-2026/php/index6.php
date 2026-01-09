<?php
echo getcwd();
echo "<br>";
echo DIRECTORY_SEPARATOR;
echo "<br>";
$path=getcwd();
echo is_file($path.DIRECTORY_SEPARATOR."test.txt")?"true":"false";
echo "<br>";
echo is_dir($path.DIRECTORY_SEPARATOR."folder")?"true":"false";
echo "<br>";
$items=scandir($path.DIRECTORY_SEPARATOR."folder");
echo "<br>";
echo "<h1>file nella mia directory:</h1>";
echo "<ul>";
foreach($items as $item){
    if($item!="." && $item!="..") {
        echo "<li>" . $item . "</li>";
    }
}
echo "</ul>";

$file1=fopen("test.txt","w");
fwrite($file1,"Ciao Mondo!");
fclose($file1);

$file1=fopen("test.txt","a");
fwrite($file1,"\nBenvenuti in PHP!");
fclose($file1);

$classe =[
    'studente1' => ['nome1','cognome1',4],
    'studente2' => ['nome2','cognome2',9],
    'studente3' => ['nome3','cognome3',12],
    'studente4' => ['nome4','cognome4',15],
    'studente5' => ['nome5','cognome5',18],
    'studente6' => ['nome6','cognome6',7],
];
$file=fopen("voti.txt","w");
foreach($classe as $studente => $dati){
    $line=implode(',',$dati).PHP_EOL;// crea una stringa separata da virgole
    fwrite($file,$line);

}

fclose($file);
//PROVO A SALVARE LA CHIAVE PRIMARIA
$file=fopen("voti_con_chiave.txt","w");
foreach($classe as $studente => $dati){
    $line=$studente.','.implode(',',$dati).PHP_EOL;// crea una stringa separata da virgole
    fwrite($file,$line);//in alternativa si puo usare file_put_contents($file,$line,FILE_APPEND);
}
fclose($file);

$datiFromFile = [];
$file=fopen("voti.txt","r");
while(($line=fgets($file))!=false){
    $datiFromFile[]=trim($line);//trim rimuove gli spazi bianchi e i caratteri di nuova linea
}
fclose($file);
foreach($datiFromFile as $dati){
    echo $dati.'<br>';
}
echo $datiFromFile[1].'<br>';
$studente=explode(',',$datiFromFile[1]);
foreach($studente as $st){
    echo $st.'<br>';
}
$frase="Oggi è una bella giornata!";
$array_frase=explode(" ",$frase);
foreach($array_frase as $parola){
    echo $parola.'<br>';
}

function somme ($a, $b){
    return $a + $b;
}
echo somme(3,4.5);
echo "<br>";function somma2 ($a, $b): int|float {
    return ($a + $b);
}
echo somma2(5,6.7);
echo "<br>";
function stampa(int|string $v): void {
    echo "Hai passato il valore: ".$v;
}
stampa('a');

echo "<br>";
function saluta (?string $nome): string {
   return "Ciao ".($nome ?? "Ospite");
}
echo saluta(null);
echo "<br>";
echo saluta("Mario");
$myvar = 10;
echo "<br>";
function myFunction(&$myvar) {
    $myvar=$myvar+1;
    echo $myvar;
}

echo "<br>";
echo $myvar;
echo "<br>";
function sommaTotale(...$numeri): int|float {

    return array_sum($numeri);
}
echo "<br>";
echo sommaTotale(1,2,3,4.5);
//echo exp(1); e^1
echo "<br>";

//una funzione di callback è una funzione che viene passata come argomento ad un'altra funzione e viene chiamata all'interno di quest'ultima per eseguire un'operazione specifica.
//esempio di funzione di callback
function esegui($callback){
    $callback();
}
function salutami(){
    echo "Ciao ciao!";
}
esegui('salutami');
function salutaCortese(){
    echo "Ciao signore!";
}

echo "<br>";
esegui('salutaCortese');

function applica($callback, $valore){
    return $callback($valore);
}
function raddoppia($n){
    return $n * 2;
}
echo "<br>";
echo applica('raddoppia', 5);

//Callback con funzioni anonima
echo "<br>";
echo applica(function($x){
    $x++;
    return $x+2;
},5);

//Arrow function- Funzioni anonime compatte
$doppio2= fn($n) => $n * 2;
echo "<br>";
echo $doppio2(4);
echo "<HR>";
echo applica(fn ($x) => $x * 2,5);

//OOP - Programmazione Orientata agli Oggetti
class Studente {

    //proprietà
    private string $nome;
    private int $eta;

    private static $numero;

    public function saluta3(): void{
        echo "Ciao, mi chiamo ".$this->nome;

    }
    public static function presentazione():void{
        echo "Ciao sono uno studente.";
        echo "<br>";
        self::$numero++;
        echo self::$numero;
    }
    //metodi getter e setter
    public function getNome(): string
    {
        return $this->nome;
    }
    public function setNome(string $nome): void
    {
        $this->nome = $nome;
    }
    public function getEta(): int
    {
        return $this->eta;
    }
    public function setEta(int $eta): void
    {
        $this->eta = $eta;
    }


}
echo"<HR>";
echo "<br>";
$s = new Studente();
$s->setNome("Mario");
$s->setEta(25);

$s2 = new Studente();
$s2->setNome("Luigi");
$s2->setEta(22);

$s->saluta3();
echo "<br>";
$s2->saluta3();
echo "<br>";
Studente::presentazione();

?>



