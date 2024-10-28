package NestedLoops;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        System.out.println("Multiplication Table:");
        for(int x = 1 ; x <= rows ; x++){
            for(int y = 1 ; y <= columns ; y++){
                System.out.printf("%4d", x*y);
            }
            System.out.println();
        }

        scanner.close();

    }
}
