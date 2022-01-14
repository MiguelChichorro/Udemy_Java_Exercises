package list1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Exercise6 {
    Scanner sc = new Scanner(System.in);
    public void Calculation(){
        System.out.println("-------Enter Parameters-------");
        System.out.println("Enter first parameter: ");
        double A = sc.nextDouble();
        System.out.println("Enter second parameter: ");
        double B = sc.nextDouble();
        System.out.println("Enter thirst parameter: ");
        double C = sc.nextDouble();
        System.out.println("-------Geometric Shapes-------");
        double triangle = (A * C) / 2;
        double circle = 3.14159 * pow(C, 2);
        double trapeze = (A + B) * C / 2;
        double square = pow(B, 2);
        double rectangle = A * B;
        System.out.printf("Triangle: %.3f%n" +
                "Circle: %.3f%n" +
                "Trapeze: %.3f%n" +
                "Square: %.3f%n" +
                "Rectangle: %.3f",triangle, circle, trapeze, square, rectangle);
    }
}
