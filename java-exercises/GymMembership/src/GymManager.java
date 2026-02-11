import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GymManager {

    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    HashMap<Integer, Member> members = new HashMap<>();
    File filePath = new File("gym_members.txt");

    public void addMember(){

        String name = getValidName();
        String email = getValidEmail();
        PlanType type = getPlanType();

        Member member = new Member(name, email, type);
        members.put(member.getId(), member);
    }
    public void removeMember(int id){
        Member member = members.get(id);
        members.remove(id);

        System.out.println(member.getName() + " has been removed!");
    }

    public void loadMembers(){
        if(!filePath.exists()){
            return;
        }
        else {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line = "";
                String[] parts;
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    parts = line.split("\\,");

                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String email = parts[2];
                    PlanType type = PlanType.valueOf(parts[3]);
                    LocalDate startDate = LocalDate.parse(parts[4]);
                    LocalDate expiryDate = LocalDate.parse(parts[5]);
                    String checkInsStr = "";

                    if(parts.length > 6){
                        checkInsStr = parts[6];
                    }
                    ArrayList<LocalDate> checkIns = new ArrayList<>();

                    if (!checkInsStr.isEmpty()){
                        String[] checkInParts;
                        checkInParts = checkInsStr.split(";");
                        for(String part : checkInParts){
                            LocalDate datePart = LocalDate.parse(part);
                            checkIns.add(datePart);
                        }
                    }

                    Member member = new Member(id, name, email, type, startDate, expiryDate, checkIns);
                    members.put(id, member);
                }
                if(!members.isEmpty()){
                    int greaterId = 0;
                    for(Member member : members.values()){
                        if (member.getId() > greaterId){
                            greaterId = member.getId();
                        }
                    }
                    Member.setNextId(greaterId + 1);
                }

            } catch (FileNotFoundException e) {
                System.out.println("Could not locate file");
            } catch (IOException e) {
                System.out.println("Something went wrong");
            }
        }
    }
    public void saveToFile(){
        try (FileWriter writer = new FileWriter(filePath)){
            writer.write("id,name,email,plan,startDate,expiryDate,checkIns" + "\n");

            for(Member member : members.values()){
                writer.write(member.toFileFormat() + "\n");
            }
            System.out.println("✓ Data saved successfully!");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file: " + e.getMessage());
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
    }

    public void checkIn(int id){

        Member member = members.get(id);

        boolean success = member.addCheckIn();
        if (success) {
            System.out.println("✓ Checked-in registered for " + member.getName());
            System.out.println("Date: " + LocalDate.now().format(formatter));
            System.out.println("Total check-ins: " + member.getTotalCheckIns());
        }
        else {
            System.out.println("Plan expired: " + member.getExpiryDate().format(formatter));
        }
    }

    public void listMembers(){
        if(members.isEmpty()){
            System.out.println("No members registered");
        }
        else {
            for (Member member : members.values()) {
                System.out.println(member);
                System.out.println();
            }
        }
    }
    public void showMember(int id){
        System.out.println(members.get(id));
    }
    public void showCheckIns(int id){
        Member member = members.get(id);
        if(member.getTotalCheckIns() == 0){
            System.out.println("No check-ins yet");
        }
        else {
            System.out.println("Total check-ins: " + member.getTotalCheckIns());
            System.out.println();

            System.out.println("Check-in history for " + member.getName() + ": ");
            for (LocalDate date : member.getCheckIns()) {
                System.out.println(date.format(formatter));
            }
        }
    }

    private PlanType getPlanType(){
        while (true) {
            try {
                System.out.println("--- Plan Type ---");
                System.out.println("1. Monthly (1 month)");
                System.out.println("2. Quarterly (3 months");
                System.out.println("3. Annual (12 months)");
                System.out.println();
                System.out.print("Enter: ");
                int choiceType = scanner.nextInt();
                scanner.nextLine();

                switch (choiceType) {
                    case 1 -> {
                        return PlanType.MONTHLY;
                    }
                    case 2 -> {
                        return PlanType.QUARTERLY;
                    }
                    case 3 -> {
                        return PlanType.ANNUAL;
                    }
                    default -> System.out.println("Invalid option");
                }
            }
            catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Error: Invalid character type");
            }
        }
    }
    private String getValidName(){
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty");
            }
            else {
                return name;
            }
        }
    }
    private String getValidEmail(){
        while (true) {
            System.out.print("Email: ");
            String email = scanner.nextLine().toLowerCase().trim();
            String username;
            String domain;

            if (email.contains("@")) {
                username = email.substring(0, email.lastIndexOf("@"));
                domain = email.substring(email.lastIndexOf("@") + 1);

                if (username.isEmpty()) {
                    System.out.println("Username cannot be empty");
                }
                else if (username.contains(" ")) {
                    System.out.println("Username cannot have space characters");
                }
                else if (!(domain.equals("gmail.com") || domain.equals("outlook.com"))) {
                    System.out.println("Invalid domain");
                }
                else {
                    return email;
                }
            }
            else if (email.isEmpty()) {
                System.out.println("Email is empty.");
            }
            else {
                System.out.println("Invalid email");
            }
        }
    }
    private int getIdByPrompt(){
        while (true) {
            try {
                System.out.print("Member ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                if (!members.containsKey(id)) {
                    System.out.println("Invalid ID");
                } else {
                    return id;
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Error: Invalid character type");
            }
        }
    }

    public void showMenu(){
        System.out.println("=== Gym Membership ===");
        System.out.println();
        System.out.println("1. Add Member");
        System.out.println("2. Search Member");
        System.out.println("3. List Members");
        System.out.println("4. Check-in Member");
        System.out.println("5. Show Check-ins");
        System.out.println("6. Remove Member");
        System.out.println("7. Save and Exit");
        System.out.println();
        System.out.print("Enter: ");
    }

    public void run(){
        boolean isRunning = true;
        loadMembers();

        while (isRunning){
            showMenu();
            int choiceMenu = scanner.nextInt();
            scanner.nextLine();

            switch (choiceMenu){
                case 1 -> addMember();
                case 2 -> showMember(getIdByPrompt());
                case 3 -> listMembers();
                case 4 -> checkIn(getIdByPrompt());
                case 5 -> showCheckIns(getIdByPrompt());
                case 6 -> removeMember(getIdByPrompt());
                case 7 -> {
                    saveToFile();
                    isRunning = false;
                }
            }
            System.out.println();
        }
    }
}
