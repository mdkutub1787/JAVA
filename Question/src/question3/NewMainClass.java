package question3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewMainClass {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Student student = new Student("Kutub", 23);
        File file = new File("H:\\s.dat");

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

        dos.writeUTF(student.toString());
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        while (dis.available() > 0) {
            System.out.println(dis.readUTF());
        }
    }
}
