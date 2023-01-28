public class Celle {
    Boolean levende;
    Celle[] naboer;
    int antNaboer;
    int antLevendeNaboer;

    public Celle() {
        levende = false;
        naboer = new Celle[8];
        antNaboer = 0;
        antLevendeNaboer = 0;
    }

    public void settDoed() {
        levende = false;
    }

    public void settLevende() {
        levende = true;
    }

    public boolean erLevende() {
        return levende;
    }

    public char hentStatusTegn() {
        char statusTegn;
        if (levende) {
            statusTegn = 'O';
        } else {
            statusTegn = '.';
        }
        return statusTegn;
    }

    public void leggTilNabo(Celle nabo) {
        for (int i = 0; i < naboer.length; i++) {
            if (naboer[i] == null) {
                naboer[i] = nabo;

                if (nabo != null) {
                    antNaboer++;
                }
                break;
            }
        }
    }

    public void tellLevendeNaboer() {
        int antallLevende = 0;
        for (Celle nabo : naboer) {
            if (nabo == null) {
                continue;
            }

            if (nabo.levende) {
                antallLevende++;
            }
        }
        antLevendeNaboer = antallLevende;
    }

    public void oppdaterStatus() {
        tellLevendeNaboer();

        if (levende) {
            if (antLevendeNaboer < 2 || antLevendeNaboer > 3) {
                levende = false;
            }
        } else {
            if (antLevendeNaboer == 3) {
                levende = true;
            }
        }
    }

}
