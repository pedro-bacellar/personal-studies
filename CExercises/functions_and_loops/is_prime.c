#include <stdio.h>

int isPrime(int a){

    int i;

    for(i = 2; i < a; i++){

        if(a < 2){

            return 0;
            
        }
        else if(a % i == 0){

            return 0;
            
        }
    }

    return 1;

}

int main(){

    int num = 6;

    printf("%d", isPrime(num));
}