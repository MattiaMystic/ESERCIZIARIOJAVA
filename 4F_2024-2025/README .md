##✨ Java Complete Guide – From Basics to OOP + UML
<p align="center"> <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk"> <img src="https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge"> <img src="https://img.shields.io/badge/Level-Beginner%20%2F%20Intermediate-blue?style=for-the-badge"> </p> <p align="center"> <img src="https://img.shields.io/github/stars/yourusername/yourrepo?style=social"> </p>

## 📘 Panoramica del Progetto



------------------------------------------------------------------------

## 🧱 1. Struttura di un Programma Java

``` java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

------------------------------------------------------------------------

## 🧩 2. Tipi di Dato

  Tipo      Esempio   Descrizione
  --------- --------- -----------------
  int       10        Numero intero
  double    3.14      Numero decimale
  char      'A'       Carattere
  boolean   true      Logico
  String    "Ciao"    Testo

------------------------------------------------------------------------

## 🔧 3. Variabili e Operatori

``` java
int x = 10;
double prezzo = 9.99;
String nome = "Luca";
```

Operatori: `+ - * / %`, `> < ==`, `&& || !`

------------------------------------------------------------------------

## 🔁 4. Controllo di Flusso

``` java
if (x > 0) { ... }

for (int i = 0; i < 10; i++) { ... }

switch(x) {
    case 1: ...
}
```

------------------------------------------------------------------------

## 🗂️ 5. Array & String

``` java
int[] n = {1,2,3};

String s = "Java";
s.length();
```

------------------------------------------------------------------------

## 🧭 6. OOP -- I Pilastri

  Pilastro         Significato
  ---------------- --------------------------------------
  Incapsulamento   Protezione dei dati
  Ereditarietà     Riutilizzo del codice
  Polimorfismo     Stesso metodo, comportamenti diversi
  Astrazione       Concetti generali → implementazione

------------------------------------------------------------------------

## 🧱 7. Classi e Oggetti

``` java
class Persona {
    String nome;

    void saluta() {
        System.out.println("Ciao, sono " + nome);
    }
}
```

------------------------------------------------------------------------

## 🚪 8. Costruttori

``` java
class Punto {
    int x, y;

    Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
```

------------------------------------------------------------------------

## 🔐 9. Modificatori di Accesso

  Modificatore   Significato
  -------------- -----------------------
  public         Ovunque
  private        Solo nella classe
  protected      Package + sottoclassi
  default        Solo package

------------------------------------------------------------------------

## 🧬 10. Ereditarietà

``` java
class Animale { void dorme(){ } }
class Cane extends Animale { void abbaia(){ } }
```

------------------------------------------------------------------------

## 🎭 11. Override / Overload

``` java
@Override
void dorme(){ }

void stampa(int x){}
void stampa(String s){}
```

------------------------------------------------------------------------

## 🧱 12. Classi Astratte

``` java
abstract class Animale {
    abstract void verso();
    void dorme(){ System.out.println("Zzz"); }
}
```

------------------------------------------------------------------------

## 🔗 13. Interfacce

``` java
interface Veicolo { void muovi(); }
```

------------------------------------------------------------------------

## ⚠️ 14. Eccezioni

``` java
try {
    int x = 10 / 0;
} catch (Exception e) {
    System.out.println("Errore");
}
```

------------------------------------------------------------------------

## 🖼️ 15. UML -- Mermaid Diagrams

### 🔷 15.1 -- Class Diagram

``` mermaid
classDiagram
class Animale {
    +dorme()
    +verso()
}
class Cane {
    +verso()
    +abbaia()
}
Animale <|-- Cane
```

### 🔶 15.2 -- Interface Diagram

``` mermaid
classDiagram
class Veicolo {
    <<interface>>
    +muovi()
}
class Auto {
    +muovi()
}
Veicolo <|.. Auto
```

### 🔶 15.3 -- Gerarchia Complessa

``` mermaid
classDiagram
class Animale {
    <<abstract>>
    +verso()
    +dorme()
}
class Cane { +verso() }
class Gatto { +verso() }
class Uccello { +verso() }
Animale <|-- Cane
Animale <|-- Gatto
Animale <|-- Uccello
```

### 🔷 15.4 -- Sequence Diagram

``` mermaid
sequenceDiagram
autonumber
Utente->>Sistema: Login
Sistema->>DB: Verifica credenziali
DB-->>Sistema: OK
Sistema-->>Utente: Accesso Consentito
```
