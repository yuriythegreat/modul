package randomgame; /**
 * Created by ��� on 21.10.2015.
 */

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;


        int n = 100;
        int m = n / 2;
        System.out.println("your number " + m + " ?");


        do {
            String command = sc.nextLine();
            if (command.contains("more")) {
                System.out.println("your number is " + plus());
            }
            if (command.contains("less")) {
                System.out.println("your number is " + minus());
                a = false;
            }
            if (!command.contains("less") || !command.contains("more")) {
                System.out.println("please, write a proper command");
            }
        } while (a == true);


    }

    public static int plus() {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        int m = n / 2;
        boolean end = false;
        do {
            int k = (n + m) / 2;
            System.out.println("your number is " + k + " ?");
            String command = sc.nextLine();
            if (command.contains("more")) {
                m = (n + m) / 2;
            }
            if (command.contains("less")) {
                n = (n + m) / 2;
            }
            if (command.contains("gotcha")) {
                end = true;
                return k;
            }


        } while (end == false);
        return 0;
    }

    public static int minus() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 50;
        boolean end = false;
        do {
            int k = (n + m) / 2;
            System.out.println("your number is " + k + " ?");
            String command = sc.nextLine();
            if (command.contains("more")) {
                n = (n + m) / 2;
            }
            if (command.contains("less")) {
                m = (n + m) / 2;
            }
            if (!command.contains("less") || !command.contains("more")) {
                System.out.println("please, write a proper command");
            }
            if (command.contains("Yes")) {
                end = true;
                return k;
            }
        } while (end == false);
        return 0;
    }
}
