import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Ordenador {
    private Mapa mapa;
    private Celda[][] celdas;
    private List<Barco> barcos;

    public Ordenador() {
        this.mapa = new Mapa();
        this.celdas = mapa.getCeldas();
        this.barcos = Barco.crearListaBarcos();
    }

    public Mapa crearMapa() {
        for (Barco b : barcos) {
            colocarBarco(b);
        }

        return this.mapa;
    }

    private void colocarBarco(Barco b) {
        boolean colocado = false;

        while (!colocado) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            switch (b.getNombre()) {
                case "Aircraft":
                    colocado = calcularPosBarco(b, "Aircraft", x, y);
                    break;
                case "Battleship":
                    colocado = calcularPosBarco(b, "Battleship", x, y);
                    break;
                case "Submarine":
                    colocado = calcularPosBarco(b, "Submarine", x, y);
                    break;
                case "Cruiser":
                    colocado = calcularPosBarco(b, "Cruiser", x, y);
                    break;
                case "Destroyer":
                    colocado = calcularPosBarco(b, "Destroyer", x, y);
                    break;
            }
        }
    }

    private boolean calcularPosBarco(Barco b, String nombreBarco, int x, int y) {
        boolean colocado = true;

        if (!b.isIntroducido()) {
            try {
                int seleccion = (int) (Math.random() * 4);
                if (seleccion == 0) {
                    for (int i = y; i < b.getLongitud() + y; i++) {
                        if (!celdas[i][x].isSeleccionado()) {
                            celdas[i][x].setSeleccionado(true);
                            celdas[i][x].setBarco(b.getNombre());
                        } else {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                    }
                } else if (seleccion == 1) {
                    for (int i = x; i > x - b.getLongitud(); i--) {
                        if (!celdas[y][i].isSeleccionado()) {
                            celdas[y][i].setSeleccionado(true);
                            celdas[y][i].setBarco(b.getNombre());
                        } else {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                    }
                } else if (seleccion == 2) {
                    for (int i = y; i > y - b.getLongitud(); i--) {
                        if (!celdas[i][x].isSeleccionado()) {
                            celdas[i][x].setSeleccionado(true);
                            celdas[i][x].setBarco(b.getNombre());
                        } else {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                    }
                } else {
                    for (int i = x; i < b.getLongitud() + x; i++) {
                        if (!celdas[y][i].isSeleccionado()) {
                            celdas[y][i].setSeleccionado(true);
                            celdas[y][i].setBarco(b.getNombre());
                        } else {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                    }
                }
                b.setIntroducido(true);
                colocado = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                for (int i = 0; i < celdas.length; i++) {
                    for (int j = 0; j < celdas[i].length; j++) {
                        if (celdas[i][j].getBarco().equalsIgnoreCase(b.getNombre())) {
                            celdas[i][j].setBarco("");
                            celdas[i][j].setSeleccionado(false);
                        }
                    }
                }
                colocado = false;
            }
        }
        return colocado;
    }
}