public class BoolskeVerdier {
    public static void main(String[] args) {
        boolean sann = true;
        boolean usann = false;

        System.out.println(sann);

        if (sann == !usann) {
            System.out.println("Forste test slo til!");
        }

        if (sann == usann) {
            System.out.println("Andre test slo til!");
        } else {
            System.out.println("Andre test slo ikke til");
        }
    }
}