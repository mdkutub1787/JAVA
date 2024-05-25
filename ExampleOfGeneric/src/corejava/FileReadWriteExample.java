package corejava;

import java.io.*;

public class FileReadWriteExample {

    public static void main(String[] args) {
        
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

     
        readFileAndWriteToAnotherFile(inputFileName, outputFileName);
    }

    private static void readFileAndWriteToAnotherFile(String inputFileName, String outputFileName) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
          
            reader = new BufferedReader(new FileReader(inputFileName));
           
            writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
          
            while ((line = reader.readLine()) != null) {
                
                writer.write(line);
                writer.newLine(); 
            }

            System.out.println("File reading and writing completed successfully.");

        } catch (IOException e) {

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
            }
        }
    }
}
