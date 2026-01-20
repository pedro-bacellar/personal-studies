public class CourseManager {

    Course[] courses = {new Course("Computer Science", 3000), new Course("Software Engineering", 2800), new Course("Data Science", 2600)};

    void listCourses() {
        int i = 0;
        for (Course course : courses) {
            i++;
            System.out.println("Courses: ");
            System.out.println(i + " - " + course);
        }
    }
    Course getCourse(int choice){
        choice--;
        int i = choice;

        return courses[i];
    }
}
