package Arrays;

public class Main {
    public static void main(String[] args) {
        
        String[] names = {"Rick", "Morty", "Summer"};
        names[2] = "Jerry";

        // String[] names = new String[3];
        // names[0] = "Rick";
        // names[1] = "Morty";
        // names[2] = "Summer";

        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

    }
}
