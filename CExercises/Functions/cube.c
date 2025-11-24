#include <stdio.h>

float cube(float a){

    return a * a * a;

}

int main(){

    float num = 2;

    printf("Result = %.2f", cube(num));
}