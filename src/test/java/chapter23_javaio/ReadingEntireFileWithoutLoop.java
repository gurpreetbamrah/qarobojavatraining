package chapter23_javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingEntireFileWithoutLoop
{
    public static void main(String[] args)
            throws FileNotFoundException
    {
        File file = new File("/Users/gurpreetsingh/Desktop/expedia/qarobojavatraining/src/test/java/chapter23_javaio/test.txt");
        Scanner sc = new Scanner(file);

        // we just need to use \\Z as delimiter
        sc.useDelimiter("\\Z");

        System.out.println(sc.next());
    }
}