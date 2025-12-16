#include <stdio.h>

int main(){

    int numbers[] = {1, 2, 3, 4, 3, 2, 3, 1, 3, 6};
    int size = sizeof(numbers) / sizeof(numbers[0]);
    int count = 0;
    int target = 3;

    for(int i = 0; i < size; i++){
        if(numbers[i] == target){
            count++;
        }
    }
    printf("%d", count);
}