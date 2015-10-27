package practice;

/**
 * Created by Þðà on 27.10.2015.
 */
public class SwarpVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
