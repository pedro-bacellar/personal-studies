public class Main {
    public static void main(String[] args){

        Student[] students = {new Student("Pedro"), new Student("Sarah", 22)};

        for(Student student : students){
            student.showProfile();
        }
    }
}
