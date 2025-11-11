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

void allPrimes(int b){

    int i;

    for(i = 2; i < b; i++){
        if(isPrime(i)){

            printf("%d ", i);
        }
    }
}


int main(){

    int num = 20;

    allPrimes(num);
}