#include <stdio.h>

int main(){

    int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int size = sizeof(numbers) / sizeof(numbers[0]);

    for(int i = size - 1; i >= 0; i--){
        printf("%d ", numbers[i]);

    }
    printf("\n");

}