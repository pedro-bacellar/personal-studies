import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Member {

    private final String name;
    private final String email;
    private PlanType type;
    private final LocalDate startDate;
    private LocalDate expiryDate;
    private boolean status;
    private final int id;
    private static int nextId = 1;

    private ArrayList<LocalDate> checkIns = new ArrayList<>();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    Member(String name, String email, PlanType type){
        this.name = name;
        this.email = email;
        this.type = type;
        this.id = nextId++;
        this.startDate = LocalDate.now();
        this.expiryDate = startDate.plusMonths(type.getNumberOfMonths());
        this.status = true;
    }
    Member(int id, String name, String email, PlanType type, LocalDate startDate, LocalDate expiryDate, ArrayList<LocalDate> checkIns){
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
        this.checkIns = checkIns;
        this.status = true;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public PlanType getType(){
        return type;
    }
    public LocalDate getStartDate(){
        return startDate;
    }
    public LocalDate getExpiryDate(){
        return expiryDate;
    }
    public int getId(){
        return id;
    }
    public int getTotalCheckIns(){
        return checkIns.size();
    }
    public ArrayList<LocalDate> getCheckIns(){
        return checkIns;
    }

    public boolean addCheckIn(){
        if(getExpiryDate().isAfter(LocalDate.now())){
            checkIns.add(LocalDate.now());
            return true;
        }
        else {
            return false;
        }
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public static void setNextId(int id){
        nextId = id;
    }

    public String toFileFormat(){
        String checkInsStr = "";
        for(LocalDate checkIn : checkIns){
            checkInsStr += checkIn + ";";
        }
        if (!checkInsStr.isEmpty()){
            checkInsStr = checkInsStr.substring(0, checkInsStr.length() - 1);
        }
        return id + "," + name + "," + email + "," + type + "," + startDate + "," + expiryDate + "," + checkInsStr;
    }

    @Override
    public String toString(){
        return "ID: " + this.id +
                "\nName: " + this.name +
                "\nEmail: " + this.email +
                "\nPlan: " + this.type +
                "\nStart: " + this.startDate.format(formatter) +
                "\nExpiry: " + this.expiryDate.format(formatter);
    }
}
