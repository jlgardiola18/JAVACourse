package UserInput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Fck you " + name);
        System.out.println("Fck you " + age + " times!");

    }
}
