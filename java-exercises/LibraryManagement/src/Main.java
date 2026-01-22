import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MemberManager memberManager = new MemberManager();
        BookManager bookManager = new BookManager();
        LoanManager loanManager = new LoanManager();
        Loan loan;
        Member member;

        boolean isRunning = true;
        int choiceMenu;

        while(isRunning){

            choiceMenu = getChoiceMenu(scanner);
            System.out.println();

            switch (choiceMenu){
                case 1 ->{
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    memberManager.addMember(name);
                    System.out.println();
                }
                case 2 ->{
                    memberManager.listMembers();
                    System.out.println();
                }
                case 3 ->{
                    bookManager.listBooks();
                    System.out.println();
                }
                case 4 ->{
                    System.out.print("Enter the book: ");
                    int bookIndex = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter the member: ");
                    int memberIndex = scanner.nextInt();
                    scanner.nextLine();

                    loanManager.borrowBook(bookManager.getBooksByIndex(bookIndex), memberManager.getMemberByIndex(memberIndex));
                    System.out.println();

                }
                case 5 ->{
                    loanManager.listLoans();

                }
                case 6 ->{
                    System.out.println("Exiting system");
                    isRunning = false;
                }
                default -> System.out.println("Invalid menu option. Try again.7");
            }
        }
    }

    static int getChoiceMenu(Scanner scanner){
        int choiceMenu;
        System.out.println("--- Library Menu ---");
        System.out.println();
        System.out.println("1 - Register Member");
        System.out.println("2 - List members");
        System.out.println("3 - List books");
        System.out.println("4 - Borrow book");
        System.out.println("5 - List loans");
        System.out.println("6 - Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
        choiceMenu = scanner.nextInt();
        scanner.nextLine();

        return choiceMenu;
    }
}
