public class Student extends AcademicPerson{

    String course;
    int semester;

    Student(String name, int age, String course, int semester){
        super(name, age);
        this.course = course;
        this.semester = semester;
        this.id = nextId++;
    }

    @Override
    String getRoleDescription(){
        return this.name + " is a student";
    }
    @Override
    public String toString(){
        return "Name: " + this.name + " | Age: " + this.age + " | Course: " + this.course + " | Semester: " + this.semester + " | ID: " + this.id;
    }
}
