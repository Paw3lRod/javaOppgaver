public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int fhours = 0;
        int fminutes = 0;
        int fseconds = 0;

        while (seconds >= 3600) {
            fhours += 1;
            seconds -= 3600;
        }

        while (seconds >= 60) {
            fminutes += 1;
            seconds -= 60;
        }

        fseconds = seconds;

        int[] allValues = { fhours, fminutes, fseconds };
        String finalString = "";

        for (int i = 0; i < allValues.length; i++) {
            if (allValues[i] < 10) {
                finalString += "0";
            }
            finalString += Integer.toString(allValues[i]);

            if (i != 2) {
                finalString += ":";
            }

        }

        return finalString;
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(61));
    }
}