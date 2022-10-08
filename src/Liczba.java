// Import Scanner class
import java.util.Scanner;

//Zadanie 2
// Napisz program o nazwie „Liczba” pobierający wartość całkowitą z klawiatury.
// Jeśli wprowadzona wartość będzie parzysta na ekranie wyświetlone zostanie 10 razy napis
// „Wartość parzysta” w przeciwnym razie 5 razy „Wartość nieparzysta” .

public class Liczba {
    public static void main(String[] args) {
        // Declare object Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scan.nextInt();

        // Check if the number is even
        if (number % 2 == 0) {
            // if it is, print 10 times Wartość parzysta
            for (int i = 0; i < 10; i++){
                System.out.println("Wartość parzysta");
            }
        } else {
            // if it is not, print 10 times Wartość nieparzysta
            for (int i = 0; i < 5; i++){
                System.out.println("Wartość nieparzysta");
            }
        }

    }
}
