public class Verden {
    Rutenett rutenett;
    int genNr;

    public Verden(int rader, int kolonner) {
        rutenett = new Rutenett(rader, kolonner);
        genNr = 0;
        rutenett.fyllMedTilfeldigeCeller();
        rutenett.kobleAlleCeller();
    }

    public void tegn() {
        rutenett.tegnRutenett();
        System.out.println("Generasjonsnummer: " + genNr);
        System.out.println("Antall levende celler: " + rutenett.antallLevende());
    }

    public void oppdatering() {
        for (int i = 0; i < rutenett.rutene.length; i++) {
            for (Celle rute : rutenett.rutene[i]) {
                rute.oppdaterStatus();
            }
        }

        genNr++;
    }
}
