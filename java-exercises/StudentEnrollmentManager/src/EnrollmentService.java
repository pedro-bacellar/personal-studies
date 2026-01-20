public class EnrollmentService {

    private final EnrollmentManager enrollmentManager;
    private final CourseManager courseManager;

    EnrollmentService(CourseManager courseManager, EnrollmentManager enrollmentManager){
        this.courseManager = courseManager;
        this.enrollmentManager = enrollmentManager;
    }

    void registerStudent(String name, int courseChoice){
        this.enrollmentManager.addEnrollment(new Enrollment(new Student(name), this.courseManager.getCourse(courseChoice)));
    }
}