public abstract class AcademicPerson {

    String name;
    int age;
    int id;
    static int nextId = 1;

    AcademicPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract String getRoleDescription();
}