import java.util.ArrayList;

public class LoanManager {

    ArrayList<Loan> loans = new ArrayList<>();

    LoanManager(){
    }

    void borrowBook(Book choiceBook, Member choiceMember){
        if(choiceBook == null || choiceMember == null){
            System.out.println("Invalid selection. Please try again.");
            return;
        }
        else if(choiceBook.getAvailable()){
            loans.add(new Loan(choiceBook, choiceMember));
            choiceBook.setAvailable(false);
            System.out.println("Book borrowed successfully!");
        }
        else {
            System.out.println("This book is not available.");
        }
    }

    void listLoans(){
        int i = 0;
        for(Loan loan : loans){
            i++;
            System.out.println(i + " - " + loan);
            System.out.println();
        }
    }
}
