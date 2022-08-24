package triangle;

import java.util.Scanner;

public class Triangle {
    private int a, b, c;
    Scanner keyboard = new Scanner(System.in);

    public void getInput() {
        System.out.println("Enter three integer numbers a, b and c. Number a: ");
        this.a = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Number b:");
        this.b = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Number c:");
        this.c = keyboard.nextInt();
        keyboard.nextLine();
    }

    public boolean isTriangle() {
        return ((a + b) > c && (a + c) > b && (b + c) > a);
    }

    public void displayResult(boolean isTriangle) {
        if (isTriangle) {
            System.out.printf("Three sides %d, %d and %d FORM a triangle.", a, b, c);
        } else
            System.out.println("Cannot FORM a triangle");
    }
}
