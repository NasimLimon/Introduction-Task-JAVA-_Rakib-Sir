import java.util.Scanner;

public class LeapYearAndSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        System.out.println("Series using for-loop:");
        printSeriesUsingForLoop();

        System.out.println("\nSeries using while-loop:");
        printSeriesUsingWhileLoop();

        System.out.println("\nSeries using do-while loop:");
        printSeriesUsingDoWhileLoop();
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void printSeriesUsingForLoop() {
        int evenSum = 0, oddSum = 0;

        System.out.print("Even numbers: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            evenSum += i;
        }
        System.out.println("\nSum of even numbers: " + evenSum);

        System.out.print("Odd numbers: ");
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
            oddSum += i;
        }
        System.out.println("\nSum of odd numbers: " + oddSum);
    }

    public static void printSeriesUsingWhileLoop() {
        int evenSum = 0, oddSum = 0;

        System.out.print("Even numbers: ");
        int i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            evenSum += i;
            i += 2;
        }
        System.out.println("\nSum of even numbers: " + evenSum);

        System.out.print("Odd numbers: ");
        int j = 1;
        while (j < 20) {
            System.out.print(j + " ");
            oddSum += j;
            j += 2;
        }
        System.out.println("\nSum of odd numbers: " + oddSum);
    }

    public static void printSeriesUsingDoWhileLoop() {
        int evenSum = 0, oddSum = 0;

        System.out.print("Even numbers: ");
        int i = 2;
        do {
            System.out.print(i + " ");
            evenSum += i;
            i += 2;
        } while (i <= 20);
        System.out.println("\nSum of even numbers: " + evenSum);

        System.out.print("Odd numbers: ");
        int j = 1;
        do {
            System.out.print(j + " ");
            oddSum += j;
            j += 2;
        } while (j < 20);
        System.out.println("\nSum of odd numbers: " + oddSum);
    }
}
