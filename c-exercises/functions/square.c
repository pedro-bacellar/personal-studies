#include <stdio.h>

float square(float a){

    return a * a;

}

int main(){

    float num = 2;

    printf("Result = %.2f", square(num));
}