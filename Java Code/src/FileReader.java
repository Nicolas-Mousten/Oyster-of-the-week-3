import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    private String filePath;
    private File fileToRead;

    private Scanner sc;

    public FileReader(String filePath) {
        this.filePath = filePath;
        fileToRead = new File(filePath);
        try{
            sc = new Scanner(fileToRead);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }

    }

    public String fileReader(String previousCharacters, int charParse) {
        String character = previousCharacters;
        if(sc.hasNext()) {
            while (character.length() <= charParse) {
                character += sc.next();     //get the words until there is more or equal to 7 characters
                if (sc.hasNext()) {
                    character += " ";
                }
            }
        }
        return character;
    }
}
