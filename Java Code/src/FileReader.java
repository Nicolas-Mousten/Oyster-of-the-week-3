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
            while (character.length() <= charParse) {                       //get the words until there is more or equal to 7 characters never less.
                character += sc.next();
                if (sc.hasNext()) {                                         //adds and blank space if there is anything after the element.
                    character += " ";
                }
            }
        }
        return character;
    }
}
