package WhileLoop;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        while(name.isBlank());

        // OR

        // while(name.isBlank()){
        //     System.out.print("Enter name: ");
        //     name = scanner.nextLine();
        // }

        System.out.println("Fck you " + name);

        scanner.close();

    }
}
