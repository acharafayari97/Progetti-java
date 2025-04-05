import java.util.Scanner;
import java.util.Random;



public class Giochino {
    public static void main(String[] args) {
        //creo un oggetto scanner che permette l'imput del utente
        Scanner scanner = new Scanner(System.in);
        //creo un oggetto per i numeri casuali
        Random random = new Random();
        //creo l'oggetto di numeri casuali fino a 100
        int Ncasuale = random.nextInt(100) + 1;
        //creo un oggetto di tipo Int di valore 0 che serebbe il numero di tentativi
        int tentativi = 0;
        //creo un oggetto di tipo Int di valore 0 che sarebbe il numero indovonato
        int indovinati = 0;

        //stampo a schermo due messaggio per l'utente per iniziare a giocare
        System.out.println("Benvenuti al gioco: Indovina il numero!");
        System.out.println("Scegli un numero da 1 a 100 e prova a indovinarlo!");

        //usi il ciclo While per scorrere i numeri
        while (Ncasuale != indovinati){
            System.out.println("Inserisci il tuo numero: ");
                scanner.nextInt();
                tentativi++;

                //uso if per paragonare i numeri casuali con quelli che inserisce l'utente
                if (indovinati < Ncasuale) {
                    System.out.println("Il numero e troppo basso, Riprova!");
                } else if (indovinati > Ncasuale) {
                    System.out.println("Il numero e troppo alto, Riprova!");
                }   else {
                    System.out.println("IL numero e CORRETTO!!!");
                    System.out.println("Hai indovinato in " + tentativi + " tentativi");
                }

                //scanner.close();
        }
    }
}
