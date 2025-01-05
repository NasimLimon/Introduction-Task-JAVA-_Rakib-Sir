// Find the area of a triangle : 0.5 * base * height

import java.util.Scanner;

public
class TriangleArea
{
public
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
        scanner.close();
    }
}

//Find the volume of a ball: 4/3 * pi * radius^3
import java.util.Scanner;

public class BallVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the ball: ");
        double radius = scanner.nextDouble();
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of the ball is: " + volume);
        scanner.close();
    }
}


//Find the area of a circle: pi * radius^2
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);
        scanner.close();
    }
}


//Convert Celsius scale to Fahrenheit: C / 5 = (F - 32) / 9
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        scanner.close();
    }
}


//Find the area of a equilateral triangle: (√3 / 4) * arm^2
import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the side of the equilateral triangle: ");
        double side = scanner.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println("The area of the equilateral triangle is: " + area);
        scanner.close();
    }
}

//Find the area of a triangle (2) : √(s *(s-a)*(s-b)*(s-c))  where s = (a+b+c) / 3
import java.util.Scanner;

public class TriangleAreaHeron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();
        
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("The area of the triangle is: " + area);
        scanner.close();
    }
}
