#include <stdio.h>

int fatorialOf(int a){

    int i;
    int fatorial = 1;

    for(i = 1; i <= a; i++){

        fatorial *= i;

    }

    return fatorial;

}

int main(){

    int num = 3;

    printf("%d", fatorialOf(num));
}