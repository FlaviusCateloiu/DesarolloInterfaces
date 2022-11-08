public class Tablero {
    public static void main(String[] args) {
        System.out.println(generarTablero());
    }

    public static String generarTablero() {
        String tablero = "";
        char c;
        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                tablero = " ";
            } else {
                tablero += i;
            }
        }
        for (int j = 0; j < 10; j++) {
            c = (char) j;
            tablero += "\n";
            tablero += c + "-".repeat(10);
        }
        return tablero;
    }
}
