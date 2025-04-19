import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String data = "Hello, file handling in Java!";
        try {
            FileWriter fw = new FileWriter("example.txt");
            fw.write(data);
            fw.close();
            System.out.println("File written.");

            FileReader fr = new FileReader("example.txt");
            int ch;
            System.out.print("File content: ");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
