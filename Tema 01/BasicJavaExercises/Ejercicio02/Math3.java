import java.util.Arrays;

public class Math3 implements Extremos {

    public static double[] abs(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = (a[i] < 0) ? -a[i] : a[i];
        }
        return b;
    }

    public static int[] abs(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = (a[i] < 0) ? -a[i] : a[i];
        }
        return b;
    }

    @Override
    public int min(int[] a) {
        Arrays.sort(a);
        return a[0];
    }

    @Override
    public int max(int[] a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    @Override
    public double min(double[] a) {
        Arrays.sort(a);
        return a[0];
    }

    @Override
    public double max(double[] a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }
}
