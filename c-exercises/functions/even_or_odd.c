#include <stdio.h>

int evenOrOdd(int a){

    return a % 2 == 0;

}

int main(){

    int num = 1;

    if(evenOrOdd(num)){
        printf("Even\n");

    }
    else{
        printf("Odd\n");

    }
}