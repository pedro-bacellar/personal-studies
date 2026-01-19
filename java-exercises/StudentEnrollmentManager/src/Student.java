public class Student {

    private String name;
    private Integer id;
    static int nextId = 1;

    Student(String name){
        this.name = name;
        this.id = nextId++;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
    Integer getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return "ID: " + this.getId() + " | Name: " + this.getName();
    }
}
