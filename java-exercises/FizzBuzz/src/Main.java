public class Main {
    public static void main(String[] args){

        int numbers = 0;

        for(int i = 0; i < 100; i++){
            numbers = i + 1;

            if(numbers % 3 == 0 && numbers % 5 == 0){
                System.out.printf("FizzBuzz\n");
                continue;
            }
            else if(numbers % 5 == 0){
                System.out.printf("Buzz\n");
                continue;
            }
            else if(numbers % 3 == 0) {
                System.out.printf("Fizz\n");
                continue;
            }
            else{
                System.out.println(numbers);
            }
        }
    }
}
