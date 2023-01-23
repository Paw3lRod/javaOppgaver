import java.util.HashMap;

public class RomanNumerals {

    public static String toRoman(int n) {
        String result = "";

        while (n >= 1000) {
            result += "M";
            n -= 1000;
        }

        if (n >= 900) {
            result += "CM";
            n -= 900;
        }

        if (n < 500 && n >= 400) {
            result += "CD";
            n -= 400;
        }

        if (n >= 500) {
            result += "D";
            n -= 500;
        }

        while (n >= 100) {
            result += "C";
            n -= 100;
        }

        if (n >= 90) {
            result += "XC";
            n -= 90;
        }

        if (n < 50 && n >= 40) {
            result += "XL";
            n -= 40;
        }

        if (n >= 50) {
            result += "L";
            n -= 50;
        }

        while (n >= 10) {
            result += "X";
            n -= 10;
        }

        if (n == 9) {
            result += "IX";
            n -= 9;
        }

        if (n >= 5) {
            result += "V";
            n -= 5;
        }

        if (n == 4) {
            result += "IV";
            n -= 4;
        }

        while (n > 0) {
            result += "I";
            n -= 1;
        }

        return result;
    }

    public static int fromRoman(String romanNumeral) {
        int result = 0;

        HashMap<String, Integer> romanDic = new HashMap<String, Integer>();
        romanDic.put("I", 1);
        romanDic.put("V", 5);
        romanDic.put("X", 10);
        romanDic.put("L", 50);
        romanDic.put("C", 100);
        romanDic.put("D", 500);
        romanDic.put("M", 1000);

        for (int i = 0; i < romanNumeral.length(); i++) {
            String thisChar = "" + romanNumeral.charAt(i);
            if (i != (romanNumeral.length() - 1)) {
                String nextChar = "" + romanNumeral.charAt(i + 1);

                if (romanDic.get(nextChar) > (romanDic.get(thisChar))) {
                    result += romanDic.get(nextChar) - romanDic.get(thisChar);
                    i++;
                } else {
                    result += romanDic.get(thisChar);
                }
            } else {
                result += romanDic.get(thisChar);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(toRoman(59));
    }
}