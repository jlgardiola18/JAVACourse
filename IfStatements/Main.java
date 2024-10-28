package IfStatements;

public class Main {
    public static void main(String[] args) {
        
        int age = 75;

        if(age==75){
            System.out.println("You're too old!");
        }
        else if(age>=18){
            System.out.println("You're an adult!");
        }
        else if(age>=13){
            System.out.println("You're a teenager!");
        }
        else{
            System.out.println("You are not an adult!");
        }


    }
}
