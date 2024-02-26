public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Test 1");
        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println("Високосный год" + i);
        }
        System.out.println("Test 2");
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);
        System.out.println("Task 1");
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println("номер " + i);
        }
        System.out.println("Task 2");
        for (int i = 10; i > 0; i = i -1) {
            System.out.println("номер " + i);
        }
        System.out.println("Task 3");
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println("Четное число " + i);
        }
        System.out.println("Task 4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println("число " + i);
        }
        System.out.println("Task 5");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Task 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println("число " + i);
        }
        System.out.println("Task 7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println("число " + i);
        }
        System.out.println("Task 8 and Task 9");
        int piggyBank = 29000;
        int inPiggyBank= 0;
        for (int i = 0; i < 13; i ++) {
            inPiggyBank = inPiggyBank + inPiggyBank / 12;
            inPiggyBank = inPiggyBank + piggyBank;
            System.out.println("Месяц " + i + " Итого " + inPiggyBank);
        }
        System.out.println(inPiggyBank);
        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i *2);
        }

        }


        }



