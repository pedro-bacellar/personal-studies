public class Main {
    public static void main(String[] args){

        for(int i = 1; i <= 100; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.printf("FizzBuzz\n");
                continue;
            }
            else if(i % 5 == 0){
                System.out.printf("Buzz\n");
                continue;
            }
            else if(i % 3 == 0) {
                System.out.printf("Fizz\n");
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
