public class Member {

    private int id;
    private final String name;
    private static int nextId = 1;

    Member(String name){
        this.name = name;
        this.id = nextId++;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + " | Name: " + this.name;
    }
}
