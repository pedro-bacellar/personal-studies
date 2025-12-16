#include <stdio.h>

float getAverage(float numbers[], int size){

    float sum = 0;

    for(int i = 0; i < size; i++){
        sum += numbers[i];
    }
    return sum / size;
}

int main(){

    float vetor[] = {2, 3, 5};
    int size = sizeof(vetor) / sizeof(vetor[0]);
    float average = getAverage(vetor, size);

    for(int i = 0; i < size; i++){
        if(vetor[i] > average){
            printf("%.2f", vetor[i]);
        }
    }
}