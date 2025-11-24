#include <stdio.h>

int main(){

    int numbers[] = {2, 3, 5, 7};
    int size = sizeof(numbers) / sizeof(numbers[0]);
    int sum = 0;

    for(int i = 0; i < size; i++){
        sum += numbers[i];

    }
    printf("Sum = %d", sum);



}