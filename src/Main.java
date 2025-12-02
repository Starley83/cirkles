import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //задача 1;
        System.out.println("задача 1");
        int[] massiveFirst = new int[]{1, 2, 3};
        double[] massiveSecond = {1.57, 7.654, 9.986};
        int[] week = {7, 6, 5, 4, 3, 2, 1};

        //задача 2;
        System.out.println("задача 2");
        // System.out.println(Arrays.toString(massiveFirst));
        // System.out.println(Arrays.toString(massiveSecond));
        // System.out.println(Arrays.toString(week));

        for (int i = 0; i < massiveFirst.length; i++) {
            if (i == massiveFirst.length - 1) {
                System.out.println(massiveFirst[i]);
                break;
            }
            System.out.print(massiveFirst[i] + ", ");
        }
        for (int i = 0; i < massiveSecond.length; i++) {
            if (i == massiveSecond.length - 1) {
                System.out.println(massiveSecond[i]);
                break;
            }
            System.out.print(massiveSecond[i] + ", ");
        }
        for (int i = 0; i < week.length; i++) {
            if (i == week.length - 1) {
                System.out.println(week[i]);
                break;
            }
            System.out.print(week[i] + ", ");
        }
        //задача 3;
        System.out.println("задача 3");
        for (int i = massiveFirst.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiveFirst[i]);
                break;
            }
            System.out.print(massiveFirst[i] + ", ");
        }
        for (int i = massiveSecond.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiveSecond[i]);
                break;
            }
            System.out.print(massiveSecond[i] + ", ");
        }
        for (int i = week.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(week[i]);
                break;
            }
            System.out.print(week[i] + ", ");
        }

        //задача 4;
        System.out.println("задача 4");
        for (int i = 0; i < massiveFirst.length; i++) {
            if (massiveFirst[i] >= 2 && massiveFirst[i] % 2 == 0) {
                continue;
            }
            massiveFirst[i]++;
        }
        System.out.println(Arrays.toString(massiveFirst));
    }
}

