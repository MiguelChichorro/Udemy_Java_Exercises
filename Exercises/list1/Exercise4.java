package list1;

import java.util.Scanner;

public class Exercise4{
    int cod;
    int hours;
    double salhours;

    public Exercise4(int cod, int hours, double salhours) {
        this.cod = cod;
        this.hours = hours;
        this.salhours = salhours;
    }

    public void Calculation(){
        double salary = hours * salhours;
        System.out.printf("Code: %d %nSalary: %.2f", cod, salary);
    }
}
