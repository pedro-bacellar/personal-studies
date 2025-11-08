#include <stdio.h>

float paSum(float a){

    float total = 0;
    float i;

        for(i = 0;i <= a; i++){

        total += i;
    }

    return total;
}

int main(){

    float num;

    printf("Digite um numero: ");
    scanf("%f", &num);

    printf("%.2f\n", paSum(num));

}