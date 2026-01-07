            // 35. 2d arrays

public class Main {
    public static void main(String[] args){

        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[0][2] = "pineapple";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.println(food);
            }
            System.out.println();
        }
        

        char[][] telephone = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}, {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
