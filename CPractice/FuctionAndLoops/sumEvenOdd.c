#include <stdio.h>

void sumEvenOdd(int a){

    int even = 0;
    int odd = 0;
    int i;

    for(i = 0; i <= a; i += 2){
        even += i;
        
    }

    printf("%d\n", even);

    for(i = 1; i <= a; i += 2){
        odd += i;
        
    }
    
    printf("%d\n", odd);



}

int main(){

    int num = 7;

    sumEvenOdd(num);

}