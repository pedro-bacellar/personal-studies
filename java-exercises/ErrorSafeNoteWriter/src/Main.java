import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String textContent = "";

        try(FileWriter writer = new FileWriter("notes.txt")){
            System.out.print("Write your note: ");
            textContent = scanner.nextLine();
            if(textContent.isEmpty()){
                System.out.println("Something must be written");
            }
            else {
                writer.write(textContent);
                System.out.println("File saved successfully!");
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error: could not locate file location");
        }
        catch (IOException e){
            System.out.println("Error: could not write file");
        }
        scanner.close();
    }
}
