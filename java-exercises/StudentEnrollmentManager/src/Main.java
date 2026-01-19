public class Main {
    public static void main(String[] args){

        EnrollmentManager manager = new EnrollmentManager();

        // courses
        Course computerScience = new Course("Computer Science", 3000);
        Course softwareEngineering = new Course("Software Engineering", 2800);
        Course dataScience = new Course("Data Science", 2600);

        // students
        Student student1 = new Student("Pedro Bacellar");
        Student student2 = new Student("Kaio Dias");

        // add enrollment
        manager.addEnrollment(new Enrollment(student1, computerScience));
        manager.addEnrollment(new Enrollment(student2, dataScience));

        // show enrollments
        manager.showEnrollments();
    }
}
