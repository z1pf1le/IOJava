import java.io.File;

public class CheckFile {
    public static void main(String[] args) {

        File file = new File("/home/andrei/test");


        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }
}

