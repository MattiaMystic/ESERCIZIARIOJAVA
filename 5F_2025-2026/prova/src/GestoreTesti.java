public class GestoreTesti {
    String[] frase;

    public int lunghezzaFrase(String frase) {
        return frase.length();

    }

    public boolean cercaParola(String[] parola, String[] frase) {
        for (int i = 0; i < parola.length; i++) {
            if (parola[i].equals(frase[i])) {
                return true;
            }
        }
        return false;

    }

}

