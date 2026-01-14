public class Teacher extends AcademicPerson{

    String subject;
    double salary;

    Teacher(String name, int age, String subject, double salary){
        super(name, age);
        this.subject = subject;
        this.salary = salary;
        this.id = nextId++;
    }

    @Override
    String getRoleDescription(){
        return this.name + " is a teacher";
    }
    @Override
    public String toString(){
        return "Name: " + this.name + " | Age: " + this.age + " | Subject: " + this.subject + " | Salary: " + this.salary + " | ID: " + this.id;
    }
}
