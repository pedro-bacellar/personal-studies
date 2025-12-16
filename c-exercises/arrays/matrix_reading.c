#include <stdio.h>

int main(){

    int numbers[3][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int linesSize = sizeof(numbers) / sizeof(numbers[0]);

    for(int i = 0; i < linesSize; i++){
        for(int j = 0; j < 3; j++){
            printf("%d ", numbers[i][j]);
        }
        printf("\n");
    }
}