import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // task 1
        //isEvenNumber();

        // task 2
//        findNearestNamber();

        // task 3
        checkNum((int) (Math.random() * 155 + 3));


    }

    public static void isEvenNumber() {          // task 1
        System.out.println("Введите целочисленное число");
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        System.out.println(p != 0 && p % 2 == 0 ? "Число " + p + " является чётным." : "Число " + p + " является нечётным.");
    }

    public static void findNearestNamber(){         // task 2
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        float p = scanner.nextFloat();
        System.out.println("Введите второе число");
        float d = scanner.nextFloat();
        System.out.println("Введите целочисленное число - ориентир");
        int referencePoint = scanner.nextInt();
        if (referencePoint - p < referencePoint - d) System.out.println("Первое число " + p + " ближе к числу " + referencePoint + " чем второе число " + d);
        else if (referencePoint - p > referencePoint - d) System.out.println("Второе число " + d + " ближе к числу " + referencePoint + " чем первое число " + p);
        else System.out.println("Оба числа одинаковые");
    }

    public static void checkNum(int num) {
        if (num > 22 && num < 99) {
            System.out.println("Число " + num + " находится в интервале (22;99)");
        } else System.out.println("Число " + num + " не находится в интервале (22;99)");

    }
}