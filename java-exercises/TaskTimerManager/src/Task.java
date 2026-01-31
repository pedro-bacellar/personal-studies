import java.util.Timer;

public class Task {

    private int id;
    private static int nextId = 1;
    private String name;
    private String desc;
    private int time;
    private boolean status;
    private Timer timer;

    Task(String name, String desc, int time){
        this.id = nextId++;
        this.name = name;
        this.desc = desc;
        this.time = time;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.desc;
    }
    public int getTime(){
        return this.time;
    }
    public boolean getStatus(){
        return this.status;
    }
    public Timer getTimer(){
        return this.timer;
    }

    void setStatus(boolean status){
        this.status = status;
    }
    void setTimer(Timer timer){
        this.timer = timer;
    }

    @Override
    public String toString(){
        String s = this.status ? "Completed" : "Pending";

        return "ID: " + id + " | Name: " + name + " | Status: " + s;
    }
}
