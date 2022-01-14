package list1;

public class Exercise3 {
    int a;
    int b;
    int c;
    int d;

    public Exercise3(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void Calculation(){
        int dif = (a * b - c * d);
        System.out.println("The difference between the numbers is "+dif);
    }
}
