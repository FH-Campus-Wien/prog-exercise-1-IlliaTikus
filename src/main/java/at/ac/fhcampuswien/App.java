package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        System.out.println("0123456789012345678901\n" + "         __\n" + " _(\\    |@@|\n" +
                "(__/\\__ \\--/ __\n" +
                "   \\___|----|  |   __\n" + "       \\ }{ /\\ )_ / _\\\n" +
                "       /\\__/\\ \\__O (__\n" +
                "      (--/\\--)    \\__/\n" + "      _)(  )(_\n" + "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals() {
        char charecter = 'Z';
        int hexaDecimal = 0xface;
        int octalNumber = 010;
        long l = 80L;
        float f = 44e-1f;
        double d = 5.5f;
        double d2 = 8.88e1;
        double f2 = 99.9;

        int sum = (int) (charecter + hexaDecimal + octalNumber + l + f + d + d2 + f2);
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers() {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Before Swap:\n" + "x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();

        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println("After Swap:\n" + "x: " + x + "\ny: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n1: ");
        int n1 = scanner.nextInt();

        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2)
            System.out.println("n1 > n2");
        else if (n2 > n1)
            System.out.println("n2 > n1");
        else System.out.println("n1 == n2");
    }

    //todo Task 7
    public void ratingSalesPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int rev = scanner.nextInt();

        if (rev < 0 || rev >= 100000)
            System.out.println("Invalid Revenue");
        else if (rev < 20000)
            System.out.println("Poor Sales Revenue");
        else if (rev < 50000)
            System.out.println("Average Sales Revenue");
        else if (rev < 80000)
            System.out.println("Good Sales Revenue");
        else
            System.out.println("Excellent Sales Revenue");
    }

    //todo Task 8
    public void getCommissionRate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int cls = scanner.nextInt();

        switch (cls) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            System.out.println("Leapyear");
        else System.out.println("Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number:  ");
        int num = scanner.nextInt();

        int a = num % 10;
        int b = num / 10;
        int c = b % 10;
        int d = b / 10;

        int num2;

        if(d==0)
            num2 = a * 10 + c;
        else num2 = a * 100 + c * 10 + d;

        System.out.println(num2);
    }


    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}