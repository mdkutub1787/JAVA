package testbinaryio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static javax.management.Query.value;

/**
 * @author MD KUTUB UDDIN
 */
public class ReadWriteBinary {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("E:\\Picture\\Kutub.dat");
        FileOutputStream fos = new FileOutputStream(f);

        for (int i = 0; i <= 100; i++) {
            fos.write(i);
        }
        fos.close();

        FileInputStream fis = new FileInputStream(f);

        System.out.println(fis.read());
        
        
        int value;
        while ((value = fis.read()) != -1) {

            System.out.println(value);
        }

    }

}
