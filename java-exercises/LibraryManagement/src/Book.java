public class Book {

    private int id;
    private final String title;
    private final String author;
    private boolean available = true;
    private static int nextId;

    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.id = nextId++;
    }

    @Override
    public String toString(){
        return "Title: " + this.title + " | Author: " + this.author + " | Available: " + available;

    }
}
