package corejava;

import java.io.*;

public class FileReadWriteExample {

    public static void main(String[] args) {
        // Specify the input and output file names
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        // Read from the input file and write to the output file
        readFileAndWriteToAnotherFile(inputFileName, outputFileName);
    }

    private static void readFileAndWriteToAnotherFile(String inputFileName, String outputFileName) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // Initialize reader to read from the input file
            reader = new BufferedReader(new FileReader(inputFileName));
            // Initialize writer to write to the output file
            writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Write each line to the output file
                writer.write(line);
                writer.newLine(); // Add a new line after each line written
            }

            System.out.println("File reading and writing completed successfully.");

        } catch (IOException e) {
            // Handle any IO exceptions that may occur

        } finally {
            // Ensure reader and writer are closed properly
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
