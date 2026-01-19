import java.util.ArrayList;

public class EnrollmentManager {

    ArrayList<Enrollment> enrollments = new ArrayList<>();

    void addEnrollment(Enrollment enrollment){
        enrollments.add(enrollment);
    }

    void showEnrollments(){
        for(Enrollment enrollment : enrollments){
            System.out.println(enrollment);
            System.out.println();
        }
    }
}
