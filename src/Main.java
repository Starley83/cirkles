//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //задача 1;
        System.out.println("задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //задача 2;
        System.out.println("задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //задача 3;
        System.out.println("задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        //задача 4
        System.out.println("задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //задача 5;
        System.out.println("задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        //задача 6;
        System.out.println("задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //задача 7;
        System.out.println("задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //задача 8;
        System.out.println("задача 8");
        int capital = 0;
        for (int i = 1; i <= 12; i++) {
            capital = capital + 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + capital + " рублей");
        }

        //задача 9;
        System.out.println("задача 9");
        capital = 0;
        for (int i = 1; i <= 12; i++) {
            capital = capital + capital / 100 + 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + capital + " рублей");
        }

        //задача 10;
        System.out.println("задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (i * 2));
        }
    }
}