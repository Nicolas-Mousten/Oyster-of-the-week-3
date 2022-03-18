import java.util.Scanner;

public class SeavenRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //all inputs inside here-----------------------------
        FileReader obj = new FileReader("Java Code/Resources/MobyDick.txt");
        System.out.println("Plz choose how long the parse should be:");
        int charParse = sc.nextInt();
        sc.nextLine();
        System.out.println("plz choose how many parses there should be:");
        int amountOfParses = sc.nextInt();
        sc.nextLine();
        //----------------------------------------------------

        String surplusChar = "";
        String characters = "";


        for (int i = 0; i < amountOfParses; i++) {                                  //Chooses amount of times the parse is repeated
            String sevenChar = "";                                                  //reset the sevenChar String
            characters = obj.fileReader(surplusChar, charParse);
            surplusChar = "";                                                       //placed after to reset the surplus String

            if(characters.length() > charParse) {
                for (int j = 0; j < charParse; j++) {                               //gets the specified amount of characters from the characters String
                    sevenChar += String.valueOf(characters.charAt(j));
                }
                for (int j = charParse; j < characters.length(); j++) {             //Gets the surplus characters from the chaaracters String
                    surplusChar += String.valueOf(characters.charAt(j));
                }
            }
            System.out.println(i+1 + " iteration");                                 //shows the iteration of Parses.
            if(sevenChar.length() == charParse){
                System.out.println(sevenChar);
            }else{
                System.out.println(characters);                                     //if the parse is less than the specified amount then it just shows the remaining
            }                                                                       // characters and then fills out the remaining parses with empty.

        }
    }
}