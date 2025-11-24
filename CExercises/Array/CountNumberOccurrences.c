#include <stdio.h>

int main(){

    int numbers[] = {3, 7, 3, 2, 9, 3};
    int size = sizeof(numbers) / sizeof(numbers[0]);
    int target = 3;
    int targetCounter = 0;

    for(int i = 0; i < size; i++){

        if(numbers[i] == target){
            targetCounter++;
        }
    }
    printf("Occurences of %d = %d", target, targetCounter);

}