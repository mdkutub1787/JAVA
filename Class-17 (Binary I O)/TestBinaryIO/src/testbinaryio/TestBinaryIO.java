package testbinaryio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class TestBinaryIO {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("E:\\Picture\\Kutub.txt");

        PrintWriter write = new PrintWriter(file);
        write.print(" Generate prime numbers up to a given limit recursively");
        write.append("\n Function to generate prime numbers up to a given limit");
        write.close();

        Scanner scanner = new Scanner(file);
//        System.out.println(scanner.nextLine());
//        scanner.close();
        
        
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

    }

}
