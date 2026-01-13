public class Student extends Person {

    String course;
    int registrationId;
    static int nextId = 1;

    Student(String name, int age, String course){
        super(name, age);
        this.course = course;
        this.registrationId = nextId++;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " | Age: " + this.age + " | Course: " + this.course + " | Id: " + this.registrationId;
    }
}