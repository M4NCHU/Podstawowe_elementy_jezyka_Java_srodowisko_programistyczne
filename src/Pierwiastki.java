public class Pierwiastki {
    public static void main(String[] args) {
        // variables
        double a = 1, b = 2, c = 1, delta, x1, x2;

        delta = (b*b) - 4 * a * c;

        System.out.println("Delta = " + delta);

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("x1 = " + x1 + "x2 = " + x2);
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("x1 i są równe x2 = " + x1);
        } else {
            System.out.println("Brak pierwiastków");
        }
    }

}
