public class ReverseDigitArray {
    public static int[] digitize(long n) {
        String str = Long.toString(n);
        int[] finalArray = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            finalArray[i] = str.charAt((str.length() - 1 - i)) - '0';
        }

        return finalArray;
    }
}