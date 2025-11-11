#include <stdio.h>

void countDivisibles(int a){

    int i;
    int threeCount = 0;
    int fiveCount = 0;
    int bothCount = 0;

    for(i = 1; i <= a; i++){
        if(i % 3 == 0 && i % 5 == 0){

            bothCount++;
                
        }
        else if(i % 3 == 0){

            threeCount++;
        }
        else if(i % 5 == 0){

            fiveCount++;
        }
    }

    printf("Divisible by three: %d\n", threeCount);
    printf("Divisible by five: %d\n", fiveCount);
    printf("Divisible by both: %d\n", bothCount);
}

int main(){

    int num = 30;

    countDivisibles(num);
}