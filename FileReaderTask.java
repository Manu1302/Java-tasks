import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderTask {
    public static void main(String[] args) {
        try {
            File myFile = new File("sample.txt");  // File name
            Scanner reader = new Scanner(myFile);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);  // Output each line
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. File not found.");
            e.printStackTrace();
        }
    }
}
