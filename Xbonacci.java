public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] sequence = new double[n];

        for (int i = 0; i < n; i++) {
            if (i < 3) {
                sequence[i] = s[i];
            } else {
                sequence[i] = sequence[i - 1] + sequence[i - 2] + sequence[i - 3];
            }
        }

        return sequence;
    }
}