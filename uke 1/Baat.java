public class Baat {
    private static int antProd = 0;
    private int prodnr;
    private String merke;

    public Baat(String mrk) {
        prodnr = antProd;
        antProd++;
        merke = mrk;
    }

    public String hentInfo() {
        return "Produksjonsnummer: " + prodnr + ", merke: " + merke;
    }
}

class Baathus {
    Baat[] baatliste;

    public Baathus(int antallPlasser) {
        baatliste = new Baat[antallPlasser];
    }

    public void settInn(Baat nyBaat) {
        boolean fikkPlass = false;

        for (int i = 0; i < baatliste.length; i++) {
            if (baatliste[i] == null) {
                baatliste[i] = nyBaat;
                fikkPlass = true;
                break;
            }
        }

        if (!fikkPlass) {
            System.out.println("Det er ikke mer plass i baatlisten");
        }
    }

    public void skrivBaater() {
        for (Baat x : baatliste) {
            System.out.println(x.hentInfo());
        }
    }
}

class TestBaathus {
    public static void main(String[] args) {
        Baathus baathus = new Baathus(3);
        Baat b1 = new Baat("Triton");
        Baat b2 = new Baat("Chaparral");
        Baat b3 = new Baat("Mercury");
        Baat b4 = new Baat("Mercury");

        baathus.settInn(b1);
        baathus.settInn(b2);
        baathus.settInn(b3);
        baathus.settInn(b4);

        baathus.skrivBaater();
    }
}