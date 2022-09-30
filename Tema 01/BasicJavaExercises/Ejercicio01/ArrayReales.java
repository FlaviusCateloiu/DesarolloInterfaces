import java.util.Arrays;

public class ArrayReales implements Estadisticas {
    private double[] vector;

    public ArrayReales(double[] v) {
        this.vector = v;
    }

    @Override
    public double minimo() {
        Arrays.sort(vector);
        return vector[0];
    }

    @Override
    public double maximo() {
        Arrays.sort(vector);
        return vector[vector.length - 1];
    }

    @Override
    public double sumatorio() {
        return Arrays.stream(vector).sum();
    }
}
