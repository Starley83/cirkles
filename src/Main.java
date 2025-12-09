import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //задача 1;
        System.out.println("задача 1");
        int[] inputArray1 = {5000, 10000, 12000, 3000, 6000};
        float[] outputArray1 = {0f, 0f, 0f};
        float sum = 0f;
        outputArray1[1] = inputArray1[0];
        for (int pay : inputArray1) {
            if (outputArray1[0] <= pay) {
                outputArray1[0] = pay;
            }
            if (outputArray1[1] >= pay) {
                outputArray1[1] = pay;
            }
            sum = sum + pay;
        }
        outputArray1[2] = sum / inputArray1.length;

        System.out.println("выплаты авторам контента");
        System.out.println(Arrays.toString(inputArray1));
        System.out.println("выплаты отсортированы максимум, минимум, среднее");
        System.out.println(Arrays.toString(outputArray1));

        //задача 2;
        System.out.println("задача 2");
        int[] inputArray2 = {70000, 100000, 135000, 37000, 69000};
        float[] outputArray2 = new float[inputArray2.length];
        int i = 0;
        for (int pay : inputArray2) {
            outputArray2[i] = (float) (pay * 0.13);
            i++;
        }
        System.out.println("Зарплаты сотрудников");
        System.out.println(Arrays.toString(inputArray2));
        System.out.println("налоговый платеж соответственно");
        System.out.println(Arrays.toString(outputArray2));

        //задача 3;
        System.out.println("задача 3");
        int[] inputArray3 = {1000, 2500, 10000, 5100, 4900};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        i = 0;
        for (int pay : inputArray3) {
            if (pay > 5000) {
                outputArray3[i] = true;
            }
            i++;
        }
        System.out.println("бонусы сотрудников");
        System.out.println(Arrays.toString(inputArray3));
        System.out.println("выплаты более 5000₽");
        System.out.println(Arrays.toString(outputArray3));

        //задача 4;
        System.out.println("задача 4");
        int[] inputArray4 = {0, 2500, 1500, 500, -500};
        boolean[] outputArray4 = {false};
        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4[0] = true;
                System.out.println("у клиента есть просрочки по кредиту");
                break;
            }
        }
        System.out.println("остаток на счете по месяцам");
        System.out.println(Arrays.toString(inputArray4));
        System.out.println("наличие просрочки по кредиту ");
        System.out.println(Arrays.toString(outputArray4));



        //задача 5;
        System.out.println("задача 5");
        int[] inputArray5 = {0, 500, 1500, -500, -1500};
        int[] outputArray5 = {0};
        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5[0] = outputArray5[0] + 1;
            }
        }
                System.out.println("прибыль по месяцам");
        System.out.println(Arrays.toString(inputArray5));
        System.out.println("количество рентабельных месяцев");
        System.out.println(Arrays.toString(outputArray5));

    }
}

