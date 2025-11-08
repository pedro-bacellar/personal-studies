#include <stdio.h>

void multiplicationTable(int a){

    int i;
    int result = 0;

    for(i = 0; i <= 10; i++){

        result = i * a;
    
        printf("\n%d * %d = %d", i, a, result);
    }

    printf("\n");

}

int main(){

    int num;

    printf("Digite um numero inteiro: ");
    scanf("%d", &num);

    multiplicationTable(num);

}