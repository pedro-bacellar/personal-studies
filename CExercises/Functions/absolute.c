#include <stdio.h>

float absolute(float a){

    if(a >= 0){
        return a;

    }

    else{
        return -a;
    }
}

int main(){

    float num = -2;

    printf("Result = %.2f", absolute(num));
}