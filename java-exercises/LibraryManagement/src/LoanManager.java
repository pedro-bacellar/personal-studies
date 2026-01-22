import java.util.ArrayList;

public class LoanManager {

    ArrayList<Loan> loans = new ArrayList<>();

    LoanManager(){
    }

    void borrowBook(Book bookChoice, Member memberChoice){

        loans.add(new Loan(bookChoice, memberChoice));
    }

    void listLoans(){
        int i = 0;
        for(Loan loan : loans){
            i++;
            System.out.println(i + " - " + loan);
        }
    }
}
