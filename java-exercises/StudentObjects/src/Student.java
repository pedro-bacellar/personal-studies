public class Student {

    String name;
    int age;
    int id;
    static int nextId = 1;

    Student(String name, int age){
        this.name = name;
        this.age = age;
        this.id = nextId++;
    }
    Student(String name){
        this.name = name;
        this.age = 0;
        this.id = nextId++;
    }
    void showProfile(){
        System.out.println("Student: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ID: " + this.id);
        System.out.println();
    }
}
