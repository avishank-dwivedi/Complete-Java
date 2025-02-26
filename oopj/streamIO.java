package oopj;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class streamIO {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("c:\\Users\\Avishank Dwivedi\\OneDrive\\Pictures\\Documents\\avishank.txt.txt");
             FileWriter fw = new FileWriter("c:\\Users\\Avishank Dwivedi\\OneDrive\\Pictures\\Documents\\dwivedi.txt.txt")) {

            int data;
            while ((data = fr.read()) != -1) {
                fw.write(data); // Write character to output file
            }
            System.out.println("Character stream: Data copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
