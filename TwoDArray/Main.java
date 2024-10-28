package TwoDArray;

public class Main {
    public static void main(String[] args) {

        String[][] motors = {
                            {"PCX","ADV","NMax"},
                            {"Sniper","Click","Mio"},
                            {"Ninja","Rebel","Ducati"}
                            };

        // String[][] motors = new String[3][3];

        // motors[0][0] = "PCX";
        // motors[0][1] = "ADV";
        // motors[0][2] = "Nmax";

        // motors[1][0] = "Sniper";
        // motors[1][1] = "Click";
        // motors[1][2] = "Mio";

        // motors[2][0] = "Ninja";
        // motors[2][1] = "Rebel";
        // motors[2][2] = "Ducati";

        for(int i = 0; i<motors.length; i++){
            System.out.println();
            for(int j = 0; j<motors[i].length; j++){
                System.out.print(motors[i][j] + " ");
            }
        }
        
    }
    
}
