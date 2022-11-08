public class Tablero {
    private String tablero = "";

    public String getTablero() {
        return tablero;
    }

    public void setTablero(String tablero) {
        this.tablero = tablero;
    }

    public void generarTablero() {
        char c;
        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                this.tablero = " ";
            } else {
                tablero +=  " " + i;
            }
        }
        for (int j = 65; j < 75; j++) {
            c = (char) j;
            tablero += "\n";
            tablero += c + " -".repeat(10);
        }
    }

    @Override
    public String toString() {
        return tablero;
    }
}
