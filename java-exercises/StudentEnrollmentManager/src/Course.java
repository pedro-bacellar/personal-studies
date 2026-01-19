public class Course {

    String name;
    int hours;

    Course(String name, int hours){
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String toString(){
        return "Course: " + this.name + " | Hours: " + this.hours;
    }
}
