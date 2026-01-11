public class Question {

    String question;
    String[] options;
    int answer;

    Question(String question, String[] options, int answerIndex){

        this.question = question;
        this.options = options;
        this.answer = answerIndex;

    }

}