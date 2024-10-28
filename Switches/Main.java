package Switches;

public class Main {
    public static void main(String[] args) {
        
        String medal = "silver";

        switch (medal) {
            case "gold": System.out.println("You have a gold medal!");
                break;
            case "silver": System.out.println("You have a silver medal!");
                break;
            case "bronze": System.out.println("You have a bronze medal!");
                break;
            default: System.out.println("You have no medal!");
                break;
        }



    }
}
