// Write a program you have to make a summation of first and last Digit
#include <stdio.h>

int main() {
    int number, firstDigit, lastDigit, sum;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    // Extract the first digit
    firstDigit = number;
    while (firstDigit >= 10) {
        firstDigit /= 10;
    }

    // Extract the last digit
    lastDigit = number % 10;

    // Calculate the sum
    sum = firstDigit + lastDigit;

    // Print the result
    printf("For the number %d, the summation of first and last digits is %d\n", number, sum);

    return 0;
}



