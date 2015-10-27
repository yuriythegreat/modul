package teilor;

/**
 * Created by Юра on 26.10.2015.
 */
public class TeilorSinus {

    public static void main(String[] args) {

        double x = Math.PI / 6;
        double precision = 0.00001;

        long fact = 1;
        double numerator = x;

        double result = x;

        int n = 1;
        while (true) {

            numerator = numerator * x * x;
            fact = fact * 2 * n * (2 * n + 1);


            double member = numerator / fact;


            if (Math.abs(member) <= precision) {
                break;
            }


            if (n % 2 == 0) {
                result = result + member;
            } else {
                result = result - member;
            }


            n++;
        }


        System.out.printf("         x = %.16f°\n", Math.toDegrees(x));
        System.out.printf(" Очікування: %.16f\n", Math.sin(x));
        System.out.printf("  Результат: %.16f\n", result);
        System.out.printf("Розбіжності: %.16f\n", result - Math.sin(x));
    }
}


