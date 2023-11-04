import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.InputStream;

public class ReadingFromFile{
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/home/andrei/test");

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
