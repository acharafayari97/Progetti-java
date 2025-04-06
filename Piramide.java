import java.util.Scanner;


public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero di righe: ");
        int numeroRIghe = scanner.nextInt();

        for (int i=1; i <= numeroRIghe; i++) {
            for (int j=numeroRIghe -i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k=1; k <= ( 2*i -1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
