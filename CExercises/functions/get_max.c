#include <stdio.h>

float getMax(float a, float b){

    if(a > b){
        return a;
    }
    else if(b > a){
        return b;
    }
    else{
        return a;
    }
}

int main(){

    float num1 = 2;
    float num2 = 4;

    printf("Max number: %.2f\n", getMax(num1, num2));

}