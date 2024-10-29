public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Task 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Целые числа " + i);
        }
        //Задание 2
        System.out.println("Task 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println("Целые числа " + i);
        }

        //Задание 3
        System.out.println("Task 3");

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0)
                System.out.println("Четные числа " + i);
        }

        //Задание 4
        System.out.println("Task 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Четные числа " + i);
        }
        //Задание 5
        System.out.println("Task 5");

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i +" год является весокосным");
        }


        //Задание 6
        System.out.println("Task 6");

        for (int i = 7; i <= 98; i +=7){
            System.out.println("последовательность чисел: " + i);
        }

        //Задание 7
        System.out.println("Task 7");

        for (int i = 1; i <= 512; i *=2){
            System.out.println("последовательность чисел: " + i);
        }

        //Задание 8
        System.out.println("Task 8");

        int amount = 29_000;
        int sum = 0;

        for (int month = 1; month <= 12; month ++) {
            sum += amount;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }

        //Задание 9
        System.out.println("Task 9");
        int amounts = 29_000;
        sum = 0;
        double percent =  0.12;
        double percents = percent / 12;

        for (int month = 1; month <= 12; month++) {
            sum += amounts;
            sum += sum * percents;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }

        //Задание 10
        System.out.println("Task 10");

        int mul = 2;
        for (int multipler = 1; multipler <= 10; multipler++){
          int result = mul * multipler;
          System.out.println(result);
        }

    }
}