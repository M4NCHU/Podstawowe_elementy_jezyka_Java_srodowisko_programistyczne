// Import Scanner class
import java.util.Scanner;

// Zadanie 1
//Napisz program o nazwie „Silnia” obliczający silnię liczby n. Wartość zmiennej n pobierz z klawiatury.

// Create public class Silnia
public class Silnia {
    // main void
    public static void main(String[] args) {
        // Declare var sum, which contains the result of factorial
        int sum = 1;

        // Declare object with predefined standard input object
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        // Int input
        int number =  scan.nextInt();

        // loop through number
        for (int i = 1; i <= number; i++) {
            // multiply sum by i
            sum *= i;
        }

        //print sum
        System.out.println(sum);
    }
}