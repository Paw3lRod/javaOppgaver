public class Rektangel {
    double lengde;
    double bredde;

    public Rektangel(double l, double b) {
        lengde = l;
        bredde = l;
    }

    public void oekLengde(int okning) {
        lengde += okning;
    }

    public void oekBredde(int okning) {
        bredde += okning;
    }

    public void reduserLengde(int redusering) {
        if ((lengde - redusering) < 1) {
            System.out.println("Lengden kan ikke reduseres så mye");
        } else {
            lengde -= redusering;
        }
    }

    public void reduserBredde(int redusering) {
        if ((bredde - redusering) < 1) {
            System.out.println("Bredden kan ikke reduseres så mye");
        } else {
            bredde -= redusering;
        }
    }

    public double areal() {
        double areal = lengde * bredde;
        return areal;
    }

    public double omkrets() {
        double omkrets = (lengde * 2) + (bredde * 2);
        return omkrets;
    }

    public static void main(String[] args) {
        Rektangel rektangel1 = new Rektangel(2, 3);
        Rektangel rektangel2 = new Rektangel(4, 5);
        rektangel1.oekLengde(2);
        rektangel2.oekBredde(3);

        System.out.println(rektangel1.omkrets());
        System.out.println(rektangel2.omkrets());
    }
}
