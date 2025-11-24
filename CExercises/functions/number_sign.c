#include <stdio.h>

void numberSign(float a){

    if(a > 0){
        printf("Positive\n");
    }

    else if(a < 0){
        printf("Negative\n");
    }

    else{
        printf("Zero\n");
    }
}

int main(){

    float num = 0;

    numberSign(num);
}