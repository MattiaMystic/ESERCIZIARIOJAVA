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
?>



