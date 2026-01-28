import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MoodJournal {

    Scanner scanner = new Scanner(System.in);

    String filePath = "journal.txt";

    ArrayList<Entry> entries = new ArrayList<>();

    MoodJournal(){

    }

    void addEntry() {

        System.out.print("How are you feeling right now: ");
        String mood = scanner.nextLine();

        System.out.print("Write about your day: ");
        String textContent = scanner.nextLine();

        Entry entry = new Entry(mood, textContent);
        entries.add(entry);

        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(entry.toFileFormat());
            System.out.println("Success!");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    void loadEntries () {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            String[] parts;
            while ((line = reader.readLine()) != null) {
                parts = line.split("\\|");
                LocalDateTime timestamp = LocalDateTime.parse(parts[0]);
                entries.add(new Entry(timestamp, parts[1], parts[2]));

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    void displayEntries(){
        if(entries.isEmpty()){
            System.out.println("No entries found");
            return;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        for(Entry entry : entries){
            System.out.println("[" + entry.timestamp.format(formatter) + "]" + entry.mood);
            System.out.println(entry.textContent);
            System.out.println("─────────────────────");
        }

    }
}
