package list1;

import java.util.Scanner;

public class Exercise5 {
    Scanner sc = new Scanner(System.in);
    public void Calculation(){
        System.out.println("-------First Product-------");
        System.out.println("Enter product code: ");
        int cod = sc.nextInt();
        System.out.println("How many products do you take?: ");
        int quantity = sc.nextInt();
        if (quantity <= 1) {
            System.out.println("How much is the product? : ");
        }
        else{System.out.println("How much are the products? : ");}
        double price1 = sc.nextDouble() * quantity;
        System.out.println("-------Second Product-------");
        System.out.println("Enter product code: ");
        int cod2 = sc.nextInt();
        System.out.println("How many products do you take?: ");
        int quantity2 = sc.nextInt();
        if (quantity2 <= 1) {
            System.out.println("How much is the product? : ");
        }
        else{System.out.println("How much are the products? : ");}
        double price2 = sc.nextDouble() * quantity2;
        System.out.println("-------Card-------");
        double card = price1 + price2;
        System.out.printf("Pay: US$%.2f", card);

    }
}
