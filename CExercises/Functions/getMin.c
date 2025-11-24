#include <stdio.h>

float getMin(float a, float b){

    if(a < b){
        return a;
    }
    else if(b < a){
        return b;
    }
    else{
        return a;
    }
}

int main(){

    float num1 = 2;
    float num2 = 4;

    printf("Min number: %.2f\n", getMin(num1, num2));

}