import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Antall rader: ");
        int valgteRader = input.nextInt();
        System.out.println("Antall kolonner: ");
        int valgteKolonner = input.nextInt();

        Verden verden = new Verden(valgteRader, valgteKolonner);

        verden.tegn();
        for (int i = 0; i < 3; i++) {
            verden.oppdatering();
            verden.tegn();
        }
    }
}
