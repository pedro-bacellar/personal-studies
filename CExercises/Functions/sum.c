#include <stdio.h>

float sum(float a, float b){
    return a + b;
}

int main(){

    float num1 = 1;
    float num2 = 4;

    printf("result = %.2f", sum(num1, num2));

}