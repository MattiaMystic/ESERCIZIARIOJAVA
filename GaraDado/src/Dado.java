import java.util.Random;

public class Dado {
    private int nFacce;
    private Random random;

    public Dado(int numeroFacce) {
        random = new Random();
        this.nFacce = numeroFacce;
    }

    public int lancia() {
        return random.nextInt(nFacce) + 1;
    }

    public String stampa(int faccia) {
        switch (faccia) {
            case 1 -> {
                return
                        "\t\t\t\t ╔════════╗\n"
                                + "\t\t\t\t ║        ║\n"
                                + "\t\t\t\t ║    0   ║\n"
                                + "\t\t\t\t ║        ║\n"
                                + "\t\t\t\t ╚════════╝";
            }
            case 2 -> {
                return
                        "\t\t\t\t ╔════════╗\n"
                                + "\t\t\t\t ║0       ║\n"
                                + "\t\t\t\t ║        ║\n"
                                + "\t\t\t\t ║       0║\n"
                                + "\t\t\t\t ╚════════╝";
            }
            case 3 -> {
                return
                        "\t\t\t\t ╔════════╗\n"
                                + "\t\t\t\t ║0       ║\n"
                                + "\t\t\t\t ║    0   ║\n"
                                + "\t\t\t\t ║       0║\n"
                                + "\t\t\t\t ╚════════╝";
            }
            case 4 -> {
                return
                        "\t\t\t\t ╔════════╗\n"
                                + "\t\t\t\t ║0      0║\n"
                                + "\t\t\t\t ║        ║\n"
                                + "\t\t\t\t ║0      0║\n"
                                + "\t\t\t\t ╚════════╝";
            }
            case 5 -> {
                return
                        "\t\t\t\t ╔════════╗\n"
                                + "\t\t\t\t ║0      0║\n"
                                + "\t\t\t\t ║    0   ║\n"
                                + "\t\t\t\t ║0      0║\n"
                                + "\t\t\t\t ╚════════╝";
            }
            case 6 -> {
                return
                        "\t\t\t\t ╔════════╗\n"
                                + "\t\t\t\t ║0      0║\n"
                                + "\t\t\t\t ║0      0║\n"
                                + "\t\t\t\t ║0      0║\n"
                                + "\t\t\t\t ╚════════╝";
            }
            default -> {
                if (faccia < 10) {
                    return "\t\t\t\t ╔════════╗\n"
                            + "\t\t\t\t ║        ║\n"
                            + "\t\t\t\t ║    " + faccia + "   ║\n"
                            + "\t\t\t\t ║        ║\n"
                            + "\t\t\t\t ╚════════╝";
                } else {
                    return "\t\t\t\t ╔════════╗\n"
                            + "\t\t\t\t ║        ║\n"
                            + "\t\t\t\t ║   " + faccia + "   ║\n"
                            + "\t\t\t\t ║        ║\n"
                            + "\t\t\t\t ╚════════╝";
                }
            }
        }
    }
}