public class Bil {
    private String eier;
    private String merke;

    public Bil(String eier, String merke) {
        this.eier = eier;
        this.merke = merke;
    }

    public void infoOmBil() {
        System.out.println("Eier: " + eier);
        System.out.println("Merke: " + merke);
    }

}
