package chapter19_exceptionhandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionHandlingCheckedException {
    public static void main(String[] args) {

        FileReader file = null;
        try {
            file = new FileReader("C:\\test\\a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File is not present");
        }
       // try {
            Scanner fileInput = new Scanner(file);

            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.next());

            fileInput.close();

      //  } catch (Exception e) {
        }
    }
//}