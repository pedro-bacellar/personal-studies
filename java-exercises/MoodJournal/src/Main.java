import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Entry entry;
        MoodJournal moodJournal = new MoodJournal();
        moodJournal.loadEntries();

        boolean isRunning = true;

        while(isRunning) {

            int choice = getMenuChoice(scanner);

            switch (choice){
                case 1 -> moodJournal.addEntry();
                case 2 -> moodJournal.displayEntries();
                case 3 -> isRunning = false;
            }
        }
    }

    static int getMenuChoice(Scanner scanner){
        System.out.println("=== MOOD JOURNAL ===");
        System.out.println("1. Add entry");
        System.out.println("2. Show all entries");
        System.out.println("3. Exit");
        System.out.println();
        System.out.print("Enter: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}
