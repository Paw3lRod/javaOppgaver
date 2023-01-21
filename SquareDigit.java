public class SquareDigit {

    public static int squareDigits(int n) {
        String digitString = Integer.toString(n);
        String finalString = "";
        for (int i = 0; i < digitString.length(); i++) {
            int number = digitString.charAt(i) - '0';
            int square = (int) Math.pow(number, 2);
            finalString += Integer.toString(square);
        }

        int finalInt = Integer.parseInt(finalString);
        return finalInt;
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

}