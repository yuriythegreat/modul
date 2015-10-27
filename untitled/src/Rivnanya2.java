/**
 * Created by Þðà on 29.09.2015.
 */
public class Rivnanya2 {
    public static void main(String[] args) {
        double a = 10;
        double b = 40;
        double c = 8;
        double D = b * b - 4 * a * c ;
        double x1 = (-b+Math.sqrt(D)) / 2 * a;
        double x2 = (-b-Math.sqrt(D)) / 2 * a;
        System.out.println(x1);
        System.out.println(x2);

    }
}
