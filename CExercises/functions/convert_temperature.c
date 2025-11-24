#include <stdio.h>

float celsiusToFah(float celsius){

    return (celsius * (9.0/5.0)) + 32;
}

float fahrenheitToCel(float fahrenheit){

    return (fahrenheit - 32) * (5.0/9.0);

}

int main(){

    float celsius = 16;
    float fahrenheit = 60.80;

    printf("Fahrenheit conversion = %.2fF\n", celsiusToFah(celsius));
    printf("Celsius conversion = %.2fC\n", fahrenheitToCel(fahrenheit));

}