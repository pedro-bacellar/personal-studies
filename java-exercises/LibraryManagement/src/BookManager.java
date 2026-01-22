import java.util.ArrayList;

public class BookManager {

    ArrayList<Book> books =  new ArrayList<>();

    public BookManager(){
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("A Brief History of Time", "Stephen Hawking"));
        books.add(new Book("Atomic Habits", "James Clear"));
        books.add(new Book("The Lord of the Rings", "J. R. R. Tolkien"));
        books.add(new Book("The Hobbit", "J. R. R. Tolkien"));
        books.add(new Book("The Da Vinci Code", "Dan Brown"));
    }

    void listBooks(){
        int i = 0;
        for(Book book : books){
            i++;
            System.out.println(i + " - " + book);
        }
    }

    Book getBooksByIndex(int choiceBook){
        if(choiceBook <= 0 || choiceBook > books.size()){
            System.out.println("Invalid option");
        }
        else {
            choiceBook--;
            return books.get(choiceBook);
        }
        return null;
    }
}
