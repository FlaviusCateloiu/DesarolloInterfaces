public class Ejercicio01 {
    public static void main(String[] args) {
        double[] vectorD = {2.33, 43.424, 54.4324, 54.424, 87453.23, 342.3234, 0.001};
        ArrayReales array = new ArrayReales(vectorD);
        System.out.println(array.minimo());
        System.out.println(array.maximo());
        System.out.println(array.sumatorio());
    }
}
