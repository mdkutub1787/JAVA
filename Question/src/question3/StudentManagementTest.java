package question3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author MD KUTUB UDDIN
 */
public class StudentManagementTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Student st1 = new Student("imtiaz", 28);
        Student st2 = new Student("Tamim", 25);
        Student st3 = new Student("Rofik", 23);

        File file = new File("H:\\kutub.dat");

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        dos.writeUTF(st1.toString());
        dos.writeUTF(st2.toString());
        dos.writeUTF(st3.toString());
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        while (dis.available() > 0) {
            System.out.println(dis.readUTF());
        }

    }

}
