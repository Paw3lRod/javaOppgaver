public class Rutenett {
    int antRader;
    int antKolonner;
    Celle[][] rutene;

    public Rutenett(int r, int k) {
        antRader = r;
        antKolonner = k;
        rutene = new Celle[r][k];
    }

    public void lagCelle(int rad, int kol) {
        Celle celle = new Celle();

        if (Math.random() <= 0.3333) {
            celle.settLevende();
        }
        rutene[rad][kol] = celle;
    }

    public void fyllMedTilfeldigeCeller() {
        for (int i = 0; i < rutene.length; i++) {
            for (int j = 0; j < rutene[i].length; j++) {
                lagCelle(i, j);
            }
        }
    }

    public Celle hentCelle(int rad, int kol) {
        if (rad < 0 || rad >= rutene.length || kol < 0 || kol >= rutene[0].length) {
            return null;
        }

        return rutene[rad][kol];
    }

    public void tegnRutenett() {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }

        for (int i = 0; i <= rutene.length; i++) {
            System.out.println("");

            for (int j = 0; j <= rutene[0].length; j++) {
                System.out.print("+");
                if (j != rutene[0].length) {
                    System.out.print("---");
                }
            }

            System.out.println("");

            if (i != rutene.length) {
                for (int j = 0; j <= rutene[i].length; j++) {
                    System.out.print("|");

                    if (j != rutene[i].length) {
                        System.out.print(" " + rutene[i][j].hentStatusTegn() + " ");
                    }
                }
            }

        }
    }

    public void settNaboer(int rad, int kolonne) {
        Celle valgtCelle = hentCelle(rad, kolonne);

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i != 0 || j != 0) {
                    valgtCelle.leggTilNabo(hentCelle(rad + i, kolonne + j));
                }
            }
        }

    }

    public void kobleAlleCeller() {
        for (int i = 0; i < rutene.length; i++) {
            for (int j = 0; j < rutene[i].length; j++) {
                settNaboer(i, j);
            }
        }
    }

    public int antallLevende() {
        int antall = 0;
        for (int i = 0; i < rutene.length; i++) {
            for (int j = 0; j < rutene[i].length; j++) {
                if (rutene[i][j].erLevende()) {
                    antall++;
                }
            }
        }
        return antall;
    }
}
