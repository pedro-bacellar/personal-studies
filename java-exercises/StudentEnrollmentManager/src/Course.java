public class Course {

    private final String name;
    private final int hours;

    Course(String name, int hours){
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return this.name;
    }

    public int getHours() {
        return this.hours;
    }

    @Override
    public String toString(){
        return this.getName() + " | Hours: " + this.getHours();
    }
}
