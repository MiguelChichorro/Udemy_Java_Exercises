package list1;

import java.util.Scanner;

public class Exercise4{
    Scanner sc = new Scanner(System.in);


    public void Calculation(){
        System.out.println("Enter your code: ");
        int cod = sc.nextInt();
        System.out.println("Enter your hours work: ");
        int hours = sc.nextInt();
        System.out.println("Enter how much you gain for hour: ");
        double salhours = sc.nextDouble();
        double salary = hours * salhours;
        System.out.printf("Code: %d %nSalary: %.2f", cod, salary);
    }
}
