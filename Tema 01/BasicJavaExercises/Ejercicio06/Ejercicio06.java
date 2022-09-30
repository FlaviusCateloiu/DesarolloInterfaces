import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        int[] hardCodedArray = { 3, 2, 4, 5, 1 };
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        // Mejora del codigo:
        try {
            System.out.println(hardCodedArray[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is out of bounds.");
        }
        /* Codigo original:
        if (index > hardCodedArray.length - 1) {
            System.out.println("The index is out of bounds.");
        } else {
            System.out.println(hardCodedArray[index]);
        } */


        /* Tienes que introducir un numero para que te devuelva el numero del indice de un array.
           Si el numero introducido que hace referencia al indice no esta dentro del rango, es decir,
           la longitud del array te devolvera un mensaje diciendo que te has salido del limite del array. */
    }
}
