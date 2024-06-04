package fileinputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SubClass {

    File file = new File("H:\\JAVA\\kk.txt");

     public void getWrite() throws FileNotFoundException{
        
        PrintWriter writer=new PrintWriter(file);
       writer.append(" Bangladesh");
       writer.print("\nHello JEE");
       writer.close();
        
       
       
    }
    public  void getRead() throws FileNotFoundException{
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

 

}
