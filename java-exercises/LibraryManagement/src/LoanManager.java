import java.util.ArrayList;

public class LoanManager {

    ArrayList<Loan> loans = new ArrayList<>();

    LoanManager(){
    }

    void borrowBook(Book choiceBook, Member choiceMember){
        if(choiceBook = null || choiceMember = null){
            System.out.println("Invalid");
        }
        if(choiceBook.getAvailable()){
            loans.add(new Loan(choiceBook, choiceMember));
            choiceBook.setAvailable(false);
        }
        else {
            System.out.println("Invalid");
        }
    }

    void listLoans(){
        int i = 0;
        for(Loan loan : loans){
            i++;
            System.out.println(i + " - " + loan);
        }
    }
}
