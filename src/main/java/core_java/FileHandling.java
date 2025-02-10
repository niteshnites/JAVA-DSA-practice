package core_java;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileHandling {

    private static final String FILE_NAME = "example.txt";

    public static void main(String[] args) {
        createFile(FILE_NAME);
        writeToFile(FILE_NAME, "Hello, this is a sample text.");
        readFile(FILE_NAME);
        appendToFile(FILE_NAME, "\nAppending new content.");
        readFile(FILE_NAME);
        deleteFile(FILE_NAME);
    }

    // 1. Create a File
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // 2. Write to a File
    public static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // 3. Read from a File
    public static void readFile(String fileName) {
        try (Scanner reader = new Scanner(new File(fileName))) {
            System.out.println("Reading file contents:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    // 4. Append to a File
    public static void appendToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(content);
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }

    // 5. Delete a File
    public static void deleteFile(String fileName) {
        try {
            Files.deleteIfExists(Paths.get(fileName));
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while deleting the file.");
            e.printStackTrace();
        }
    }
}

