import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        CourseManager courseManager = new CourseManager();
        EnrollmentService enrollmentService = new EnrollmentService(courseManager, enrollmentManager);
        Enrollment enrollment;
        Student student;

        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("--- University Enrollment ---");
            System.out.println("1 - Register student");
            System.out.println("2 - List Enrollments");
            System.out.println("3 - List Courses");
            System.out.println("4 - Exit");
            System.out.println();
            System.out.print("Choose a option: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (choice){
                case 1 ->{
                    int courseChoice;

                    System.out.print("Enter the student name: ");
                    String name = scanner.nextLine();
                    System.out.println();

                    System.out.println("Courses:");
                    courseManager.listCourses();
                    System.out.println();

                    System.out.print("Choose a course: ");
                    courseChoice = scanner.nextInt();
                    scanner.nextLine();

                    enrollmentService.registerStudent(name, courseChoice);

                    System.out.println("Success!");

                    System.out.println();
                }
                case 2 ->{
                    enrollmentManager.listEnrollments();
                    System.out.println();
                }
                case 3 ->{
                    courseManager.listCourses();
                    System.out.println();
                }
                case 4 ->{
                    System.out.println("Exiting system");
                    isRunning = false;
                }
            }
        }
    }
}
