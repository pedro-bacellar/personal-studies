public class Enrollment {

    Student student;
    Course course;

    Enrollment(Student student, Course course){
        this.student = student;
        this.course = course;
    }

    @Override
    public String toString(){
        return student.toString() + "\n" + course.toString();
    }
}
