#include <stdio.h>

int main(){

    int source[] = {1, 2, 3, 4, 5};
    int copy[] = {0, 0, 0, 0, 0};
    int size = sizeof(source) / sizeof(source[0]);

    for(int i = 0; i < size; i++){

        copy[i] = source[i];
    }

    printf("Source = ");
    for(int i = 0; i < size; i++){

        printf("%d ", source[i]);

    }

    printf("\nCopy = ");
    for(int i = 0; i < size; i++){

        printf("%d ", copy[i]);
    }



}