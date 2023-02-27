package Basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy egész számot: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Az egész szám: " + number + "\n");

        System.out.println("Kérem adjon meg egy lebegőpontos számot: ");
        double MyDoubleNumber = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("A lebegőpontos szám: " + MyDoubleNumber + "\n");

        System.out.println("Kérem adjon meg egy szöveget: ");
        String Text = scanner.nextLine();
        System.out.println("A szöveg: " + Text);
    }
}
