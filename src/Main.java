//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //задача 1;
        System.out.println("задача 1");
        int firstFriday = 7;
        for (int i = firstFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

        //задача 2 do-while method
        System.out.println("задача 2 вариант do-while ");
        int distance = 0;
        // int z = 0; // message counter
        do {
            // z++;
            System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров");
            distance = distance + 500;
        } while (distance < 42195);

        //задача 2 for method
        System.out.println("задача 2 вариант for");
        distance = 0;
        //z = 0; // message counter
        for (; distance < 42195; distance = distance + 500) {
            //   z++;
            System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров");
        }

        //задача 3 while method
        System.out.println("задача 3 вариант while ");
        int money = 1500;
        int day = 0;
        while (money >= 100) {
            day++;
            if (day >= 5 && day % 5 == 0) {
                continue;
            }
            money = money - 100;
        }
        System.out.println("вы можете оставить свой автомобиль на количество дней равное " + day);

        //задача 3 for method
        System.out.println("задача 3 вариант for");
        money = 900;
        day = 0;
        for (; money >= 100; day++) {
            if (day >= 5 && day % 5 == 0) {
                continue;
            }
            money = money - 100;
        }
        System.out.println("вы можете оставить свой автомобиль на количество дней равное " + day);

        //задача 4
        System.out.println("задача 4");
        double total = 0;
        int month = 0;
        while (true) {
            month++;
            total = total + 15000;
            if (month >= 6 && month % 6 == 0) {
                total = total * 1.07;
            }
            if (total >= 12_000_000) {
                break;
            }
            System.out.println("на " + month + " месяц, сумма накоплений составила: " + total);
        }
        System.out.println("вы накопите 12_000_000 за " + month + " месяцев");
        System.out.println("сумма накоплений составила: ");
        System.out.printf("%.2f", total);

        //задача 5
        System.out.println("задача 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge <= 100) {
            minute++;
            if (minute >= 10 && minute % 10 == 0) {
                overheats=overheats+1;
                minute = minute + 2;
                System.out.println("Внимание, Перегрев!");
                continue;
            }
            if (overheats > 3) {
                System.out.println("Зарядка прервана, из-за перегрева");
                System.out.println("Заряд составил "+ charge+ " процентов");
                break;
            }
            charge = charge + 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}

