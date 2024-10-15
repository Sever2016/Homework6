public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
        //Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " ");
        }
        //Задача 3
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i + " ");
        }
        //Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i + " ");
        }
        //Задача 5
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        //Задача 6
        for (int i = 7; i <= 99; i += 7) {
            System.out.println(i + " ");
        }
        //Задача 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача 8
        int total = 0;
        int deposit = 29000;
        for (int month = 1; month <= 12; month++) {
            total += deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        //Задача 9
        int totalAtPercentage = 0;
        for (int month = 1; month <= 12; month++) {
            totalAtPercentage = totalAtPercentage + deposit + (deposit + totalAtPercentage) / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalAtPercentage + " рублей");
        }
        //Задача 10
        for (int firstMultiplier = 2, secondMultiplier = 1, product = firstMultiplier * secondMultiplier; product <= 20; secondMultiplier++, product = firstMultiplier * secondMultiplier) {
            System.out.println(firstMultiplier + "*" + secondMultiplier + "=" + product);
        }
    }
}