public class Main {
    public static void main(String[] args) {

        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 2
        var result1 = dog + 4;
        var result2 = cat + 4;
        var result3 = paper + 4;
        System.out.println("\n result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        // Задача 3
        var result4 = dog - 3.5;
        var result5 = cat - 1.6;
        var result6 = paper - 7639;
        System.out.println("\n result4 = " + result4);
        System.out.println("result5 = " + result5);
        System.out.println("result6 = " + result6);

        // Задача 4
        var friend = 19;
        System.out.println("\n friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        // Задача 5
        var frog = 3.5;
        System.out.println("\n frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        // Задача 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTotal = weightBoxer1 + weightBoxer2;
        System.out.println("\n weightTotal = " + weightTotal);

        // Задача 7

        var result7 = weightBoxer2 - weightBoxer1;
        System.out.println("\n result7 = " + result7);

        var result8 = weightBoxer2 % weightBoxer1;
        System.out.println("result8 = " + result8);

        // Задача 7

        var timeTotal = 640;
        var timeEachEmployees = 8;
        var amountEmployees = timeTotal / timeEachEmployees;
        var amountEmployees2 = amountEmployees + 94;
        var timeTotal2 = timeEachEmployees * amountEmployees2;
        System.out.println("\n Если в компании работает " + amountEmployees2 + " человек, то всего " + timeTotal2 + " часов работы может быть поделено между сотрудниками.");
    }
}