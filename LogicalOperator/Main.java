package LogicalOperator;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //  && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of a condition

        Scanner scanner = new Scanner(System.in);

        System.out.println("R for Rock, P for Paper, S for Scissors");
        System.err.println("Enter your choice!");
        String response = scanner.nextLine();

        if(response.equals("r") || response.equals("R")){
            System.out.println("You choose Rock");
        }
        else if(response.equals("p") || response.equals("P")){
            System.out.println("You chose Paper");
        }
        else if(response.equals("s") || response.equals("S")){
            System.out.println("You chose Scissors");
        }
        else{
            System.out.println("You chose nothing");
        }

    }
    
}
