#include <stdio.h>

float averageOfThree(float a, float b, float c){

    return (a + b + c) / 3;

}

int main(){

    float num1 = 2;
    float num2 = 2;
    float num3 = 2;

    printf("Average: %.2f\n", averageOfThree(num1, num2, num3));

}