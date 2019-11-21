package chapter23_javaio;


// using Scanner Class

import java.io.File;
import java.util.Scanner;

public class ReadFromFileUsingScanner {
    public static void main(String[] args) throws Exception {
        // pass the path to the file as a parameter
        File file =
                new File("/Users/gurpreetsingh/Desktop/expedia/qarobojavatraining/src/test/java/chapter23_javaio/test.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}