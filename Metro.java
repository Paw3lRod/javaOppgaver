import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int passengersOnBus = 0;

        for (int i = 0; i < stops.size(); i++) {
            int[] changes = stops.get(i);
            passengersOnBus += (changes[0] - changes[1]);
        }

        return passengersOnBus;
    }
}