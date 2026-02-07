import java.time.LocalDate;
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

    Member(String name, String email, PlanType type){
        this.name = name;
        this.email = email;
        this.type = type;
        this.id = nextId++;
        this.startDate = LocalDate.now();
        this.expiryDate = startDate.plusMonths(type.getNumberOfMonths());
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


    void setStatus(boolean status){
        this.status = status;
    }





    @Override
    public String toString(){
        return "ID: " + this.id +
                "\nName: " + this.name +
                "\nEmail: " + this.email +
                "\nPlan: " + this.type +
                "\nStart: " + this.startDate +
                "\nExpiry: " + this.expiryDate;
    }
}
