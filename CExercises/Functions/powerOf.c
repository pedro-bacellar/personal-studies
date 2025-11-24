#include <stdio.h>

float powerOf(float a, float n){

    float i = 1;
    float b = a;

    while(i < n){
        i++;
        a *= b;
    }

    return a;

}

int main(){

    float num = 2;
    float power = 4;

    printf("Result = %.2f", powerOf(num, power));

}