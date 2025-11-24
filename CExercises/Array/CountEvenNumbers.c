#include <stdio.h>

int main(){

    int numbers[] = {4, 7, 2, 9, 10};
    int size = sizeof(numbers) / sizeof(numbers[0]);
    int evenCounter = 0;
    
    for(int i = 0; i < size; i++){

        if(numbers[i] % 2 == 0){
            evenCounter++;

        }
    }
    printf("%d", evenCounter);

}