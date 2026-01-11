import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int score = 0;

        Question question1 = new Question("What is Java?", new String[]{"1) An operating system", "2) A programming language", "3) A database", "4) A text editor"}, 2);
        Question question2 = new Question("What does OOP stand for?", new String[]{"1) Object Oriented Programming", "2) Open Output Process", "3) Order Of Parameters", "4) Object Optional Pattern"}, 1);
        Question question3 = new Question("Which structure stores values in rows and columns?", new String[]{"1) Array", "2) Varargs", "3) 2D Array", "4) Method"}, 3);
        Question question4 = new Question("In OOP, what is an object?", new String[]{"1) A function", "2) A variable", "3) An instance of a class", "4) A loop"}, 3);

        String[] questions = {question1.question, question2.question, question3.question, question4.question};
        String[][] options = {question1.options, question2.options, question3.options, question4.options};
        int[] answer = {question1.answer, question2.answer, question3.answer, question4.answer};

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){

                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            System.out.println();

            score += getScore(guess, answer[i]);
        }
        System.out.println("Final score: " + score);

    }

    static int getScore(int guess, int answer){

        int score = 0;

        if(guess == answer){
            return 1;
        }
        return 0;
    }
}