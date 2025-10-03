
public class GestoreTesti {

    public int lunghezzaFrase(String frase) {
        return frase.length();
    }

    public boolean cercaParola(String frase, String parola) {
        return frase.contains(parola);
    }

    public String sostituisciParola(String frase, String vecchia, String nuova) {
        return frase.replaceAll(vecchia, nuova);
    }

    public int[] contaVocaliEConsonanti(String frase) {
        int vocali = 0, consonanti = 0;
        int n;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ' && frase.charAt(i) != '0' && frase.charAt(i) != '1' && frase.charAt(i) != '2' && frase.charAt(i) != '3' && frase.charAt(i) != '4' && frase.charAt(i) != '5' && frase.charAt(i) != '6' && frase.charAt(i) != '7' && frase.charAt(i) != '8' && frase.charAt(i) != '9') {
                if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                    vocali++;
                } else{
                    consonanti++;
                }
            }

            }


        return new int[]{vocali, consonanti};
    }

    public String invertiFrase(String frase) {
        String fraseInvertita = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertita += frase.charAt(i);
        }
        return fraseInvertita;
    }


    public String estraiPorzione(String frase, int inizio, int fine) {
        if (inizio < 0) inizio = 0;
        if (fine > frase.length()) fine = frase.length();
        if (inizio > fine) return "";
        return frase.substring(inizio, fine);
    }
}
