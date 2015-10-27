package teilor;

/**
 * Created by Þðà on 06.10.2015.
 */
public class RozkladTeilora {
    public static void main(String[] args) {
        double x = 1;
        double result = 0;
        long fact = 1;
        double nominator = 1;
        for (int i = 0; i < 20; i++) {
            fact = fact * i;
            nominator = nominator * x;
            result = result + nominator / fact;

        }
        System.out.println(result);
    }
}
