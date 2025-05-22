import java.util.Scanner;

public class CalculationProgram {

    // Method to calculate the area of a triangle using base and height
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the volume of a ball using radius
    public static double volumeOfBall(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate the area of a circle using radius
    public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to calculate the area of an equilateral triangle
    public static double areaOfEquilateralTriangle(double arm) {
        return (Math.sqrt(3) / 4) * Math.pow(arm, 2);
    }

    // Method to calculate the area of a triangle using Heron's formula
    public static double areaOfTriangleHeron(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Area of a triangle using base and height
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + areaOfTriangle(base, height));

        // Volume of a ball
        System.out.print("\nEnter radius of ball: ");
        double radius = sc.nextDouble();
        System.out.println("Volume of Ball: " + volumeOfBall(radius));

        // Area of a circle
        System.out.print("\nEnter radius of circle: ");
        radius = sc.nextDouble();
        System.out.println("Area of Circle: " + areaOfCircle(radius));

        // Celsius to Fahrenheit conversion
        System.out.print("\nEnter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));

        // Area of an equilateral triangle
        System.out.print("\nEnter arm length of equilateral triangle: ");
        double arm = sc.nextDouble();
        System.out.println("Area of Equilateral Triangle: " + areaOfEquilateralTriangle(arm));

        // Area of a triangle using Heron's formula
        System.out.print("\nEnter first side of triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter second side of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter third side of triangle: ");
        double c = sc.nextDouble();
        System.out.println("Area of Triangle using Heron's Formula: " + areaOfTriangleHeron(a, b, c));

        sc.close();
    }
}

//                    Or


import java.util.Scanner;

public class PositiveIntegerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number > 0) {
                System.out.println(number + " is a positive integer.");
            } else {
                System.out.println(number + " is not a positive integer.");
            }

        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        sc.close();
    }
}


//Or

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = scan.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scan.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        int result = 0;
        boolean validOperation = true;

        if (operator == '+') {
            result = a + b;
        } 
        else if (operator == '-') {
            result = a - b;
        } 
        else if (operator == '*') {
            result = a * b;
        } 
        else if (operator == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperation = false;
            }
        } 
        else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
            validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }

        scan.close();
    }
}


//or
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}

//or

import java.util.Scanner;

public class MedalAwarding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the letter grade (e.g., 3.0, 3.5, 4.0): ");
        double grade = sc.nextDouble();

        System.out.print("Has the student completed the semester? (yes/no): ");
        String completed = sc.next();

        if (completed.equalsIgnoreCase("yes")) {
            if (grade >= 3.5) {
                System.out.println("The student receives a medal.");
            } else {
                System.out.println("The student does not receive a medal.");
            }
        } else {
            System.out.println("Semester not completed. No medal awarded.");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target sales percentage (e.g., 95, 80): ");
        int salesPercentage = sc.nextInt();

        System.out.print("Enter attendance percentage (e.g., 100, 90): ");
        int attendance = sc.nextInt();

        int bonusPercentage = 0;

        if (salesPercentage >= 95) {
            if (attendance == 100) {
                bonusPercentage = 60;
            } else if (attendance >= 90) {
                bonusPercentage = 40;
            } else {
                bonusPercentage = 5;
            }
        } else if (salesPercentage >= 80) {
            if (attendance == 100) {
                bonusPercentage = 40;
            } else if (attendance >= 90) {
                bonusPercentage = 20;
            } else {
                bonusPercentage = 5;
            }
        } else {
            bonusPercentage = 5;
        }

        System.out.println("The bonus percentage is: " + bonusPercentage + "%");

        sc.close();
    }
}



import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");
        int number = sc.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }
}


import java.util.Scanner;

public class ReverseSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] series = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            series[i] = sc.nextInt();
        }

        System.out.print("Reversed series: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(series[i] + " ");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms to display: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }

        System.out.println();
        sc.close();
    }
}
