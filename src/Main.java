public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int month = 0;
        int deposit = 15000;
        int amountMoney = 0;
        while (amountMoney <= 2_459_000) {
            month++;
            amountMoney = amountMoney + deposit;
            System.out.println("Сумма накоплений за: " + month + " месяц равна " + amountMoney + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int natality = 17;
        int deathRate = 8;
        int bornInYear;
        int deathInYear;
        int year = 0;
        while (year < 10) {
            year++;
            bornInYear = population / 1000 * natality;
            deathInYear = population / 1000 * deathRate;
            population = population + bornInYear - deathInYear;
            System.out.println("Год " + year + " численность населения составляет: " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int depositMonth = 15000;
        double percentMonth = 0.07;
        int money = 0;
        int month = 0;
        while (money < 12_000_000) {
            month++;
            money = money + depositMonth;
            money = (int) (money * percentMonth) + money;
            System.out.println("За " + month + " месяц накопил " + money + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 4");
        int depositMonth = 15000;
        double percentMonth = 0.07;
        int money = 0;
        int month = 0;
        while (money < 12_000_000) {
            month++;
            money = money + depositMonth;
            money = (int) (money * percentMonth) + money;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяцев накопил " + money + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int depositMonth = 15000;
        double percentMonth = 0.07;
        int money = 0;
        int month = 0;
        int nineYear = 9 * 12;
        while (month <= nineYear) {
            month++;
            money = money + depositMonth;
            money = (int) (money * percentMonth) + money;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяцев накопил " + money + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int dayMonth = 31;
        int dayOneFriday = 3;
        System.out.println("Сегодня пятница " + dayOneFriday + " -е число. Необходимо подготовить отчёт");
        while (dayOneFriday <= dayMonth - 7) {
            dayOneFriday = dayOneFriday + 7;
            System.out.println("Сегодня пятница " + dayOneFriday + " -е число. Необходимо подготовить отчёт");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int cycleComet = 79;
        int yearFlyComet = 0;
        int yearToday = 2023;
        int startYearComet = yearToday - 200;
        int endYearComet = yearToday + 100;
        while (yearFlyComet < 2100) {
            yearFlyComet = yearFlyComet + cycleComet;
            if (yearFlyComet >= startYearComet && yearFlyComet <= endYearComet) {
                System.out.println(yearFlyComet);
                break;
            }
        }
    }

    public static void task9() {
        System.out.println("Задача из примера на do-while");
        int userWantsToContinue = 1;
        int level = 1;
        do {
            System.out.println("Завершён уровень " + level);
            System.out.println("Хотите продолжить?");
            level++;
        }
        while (userWantsToContinue == 1 && level < 5);
    }

}
