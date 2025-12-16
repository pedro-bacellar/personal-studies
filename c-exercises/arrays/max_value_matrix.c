#include <stdio.h>

int main(){

    int numbers[4][4] = {8, 5, 12, 5, 13, 17, 2, 20, 4, 12, 10, 1, 11, 18, 13, 16};
    int biggest = numbers[0][0];

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            if(numbers[i][j] > biggest){
                biggest = numbers[i][j];
            }
        }
    }
    printf("%d", biggest);
}