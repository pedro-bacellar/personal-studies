            // 45. super

public class Main {
    public static void main(String[] args){

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        person.showName();

        student.showName();
        student.showGPA();

        employee.showName();
        employee.showSalary();
    }
}