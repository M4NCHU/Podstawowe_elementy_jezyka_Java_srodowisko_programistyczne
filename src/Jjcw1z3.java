import java.util.Scanner;

//Zadanie 3
//Napisz program o nazwie „Jjcw1z3” obliczający pole powierzchni kuli. Wartość promienia wpisz z klawiatury.

public class Jjcw1z3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj promień: ");
        double radius = scan.nextDouble();

        //formula for the surface area of a sphere
        double field = 4 * Math.PI * (radius * radius);

        System.out.println(field);
    }
}
