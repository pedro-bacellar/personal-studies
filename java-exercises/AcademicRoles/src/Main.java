public class Main {
    public static void main(String[] args){

        AcademicPerson[] people = {new Student("Pedro", 21, "Computer Science", 2), new Teacher("Flaudio", 99, "Calculus", 300000)};

        for(AcademicPerson opt : people){
            System.out.println(opt.getRoleDescription());
            System.out.println(opt);
            System.out.println();
        }
    }
}