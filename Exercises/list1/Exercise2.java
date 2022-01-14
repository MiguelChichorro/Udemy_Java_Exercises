package list1;

import static java.lang.Math.pow;

public class Exercise2 {
    double pi = 3.14159;
    double area;

    public Exercise2(double area) {
        this.area = area;
    }

    public void Calculation() {
        area = pi * pow(area, 2);
        System.out.printf("the are is %.4f", area);

    }
}
