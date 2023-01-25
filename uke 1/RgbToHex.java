public class RgbToHex {

  public static String rgb(int r, int g, int b) {
    char[] hex = { 'A', 'B', 'C', 'D', 'E', 'F' };

    String result = "";

    for (int color : new int[] { r, g, b }) {
      if (color > 255) {
        color = 255;
      } else if (color < 0) {
        color = 0;
      }

      int second = color % 16;
      int first = (color / 16) % 16;

      for (int hexValue : new int[] { first, second }) {
        if (hexValue > 9) {
          result += hex[(hexValue - 10)];
        } else {
          result += Integer.toString(hexValue);
        }
      }

    }

    return result;

  }
}
