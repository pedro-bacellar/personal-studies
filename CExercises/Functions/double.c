#include <stdio.h>

float doubleIt(float a){

    return a * 2;

}

int main(){

    float num = 2;

    printf("Result = %.2f", doubleIt(num));
}