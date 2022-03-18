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
        for (int i = 0; i < amountOfParses; i++) {
            String sevenChar = "";
            characters = obj.fileReader(surplusChar, charParse);
            surplusChar = "";

            if(characters.length() > charParse) {
                for (int j = 0; j < charParse; j++) {
                    sevenChar += String.valueOf(characters.charAt(j));
                }
                for (int j = charParse; j < characters.length(); j++) {
                    surplusChar += String.valueOf(characters.charAt(j));
                }
            }
            System.out.println(i+1 + " iteration");
            if(sevenChar.length() == charParse){
                System.out.println(sevenChar);
            }else{
                System.out.println(characters);
            }
        }
    }
}