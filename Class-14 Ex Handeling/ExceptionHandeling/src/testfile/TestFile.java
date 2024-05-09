package testfile;

/**
 * @author MD KUTUB UDDIN
 */
import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class TestFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("C:\\Users\\MD KUTUB UDDIN\\Desktop\\kutub.txt");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(new Date(file.lastModified()));

        PrintWriter output = new PrintWriter("C:\\Users\\MD KUTUB UDDIN\\Desktop\\kutub.txt");

        output.append("Hello ");
        output.append("java");
        output.close();

        Scanner input = new Scanner(file);
        System.out.println(input.nextLine());

//        File file = new File("C:\\Users\\MD KUTUB UDDIN\\Desktop\\kutub.txt");
//        System.out.println("Exists: " + file.exists());
//        System.out.println("Readable: " + file.canRead());
//        System.out.println("Writable: " + file.canWrite());
//        System.out.println("Is Dir: " + file.isDirectory());
//        System.out.println("Is File: " + file.isFile());
//        System.out.println("Absolute: " + file.isAbsolute());
//        System.out.println("Hidden: " + file.isHidden());
//
//        System.out.println("Abs Path: " + file.getAbsolutePath());
//        System.out.println("Canonical Path: " + file.getCanonicalPath());
//
//        System.out.println("Name: " + file.getName());
//        System.out.println("Path: " + file.getPath());
//        System.out.println("Parent: " + file.getParent());
//        System.out.println("Last Modified: " + new Date(file.lastModified()));
//        System.out.println("Length: " + file.length());
//
//        File dir = new File("C:\\Users\\MD KUTUB UDDIN\\Desktop\\kutub.txt");
//        File[] files = dir.listFiles();
//        System.out.println("Existing Files:\n");
//        for (File f : files) {
//            System.out.println("\t" + f.getName() + "\n");
//        }
//
//        File testFile = new File("C:\\Users\\MD KUTUB UDDIN\\Desktop\\kutub.txt");
//        System.out.println("File Created: " + testFile.createNewFile());

    }

}
