package yura;

/**
 * Created by ��� on 28.09.2015.
 */
import java.util.void ;
public static void vd main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        int maxSeed = 100;

        int minSeed = 0;

        int lastNumber = rand.nextInt(maxSeed - minSeed) + minSeed;

        int steps = 0;

        System.out.println("� ������� �����. �������� ��� �������");

        System.out.println(lastNumber);

        while (sc.hasNext()) {
        String userInput = sc.nextLine();
        if (userInput.equals("less")) {
        maxSeed = lastNumber;
        lastNumber = rand.nextInt(maxSeed - minSeed) + minSeed;
        System.out.println(lastNumber);
        steps++;
        } else if (userInput.equals("more")) {
        minSeed = lastNumber + 1;
        lastNumber = rand.nextInt(maxSeed - minSeed) + minSeed;
        System.out.println(lastNumber);
        steps++;
        } else if (userInput.equals("quit")) {
        break;
        } else if (userInput.equals("bingo")) {
        System.out.println("���������� ������� ����� �� "+steps+" �����");
        } else {
        System.out.println("�������� �������");
        }
        }
        }
