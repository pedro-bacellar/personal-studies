#include <stdio.h>

int main(){

    int numbers[] = {4, 1, 9, 3, 7};
    int size = sizeof(numbers) / sizeof(numbers[0]);
    int max = numbers[0];

    for(int i = 1; i < size; i++){
        if(max < numbers[i]){
            max = numbers[i];
        }

    }

    printf("Max = %d", max);

}