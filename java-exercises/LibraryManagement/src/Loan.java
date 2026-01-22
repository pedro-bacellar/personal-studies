public class Loan {

    Book book;
    Member member;

    Loan(Book book, Member member){
        this.book = book;
        this.member = member;
    }

    @Override
    public String toString(){
        return "Book: " + book.toString() + "\n Member: " + this.member.toString();
    }
}
