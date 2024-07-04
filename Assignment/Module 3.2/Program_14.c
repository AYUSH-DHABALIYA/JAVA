// Write a program make a summation of given number
#include <stdio.h>

int main() {
    int number, sum = 0, digit;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    // Process each digit to calculate the sum
    int originalNumber = number;  // Store the original number for reference

    while (number != 0) {
        digit = number % 10;
        sum += digit;
        number /= 10;
    }

    // Print the result
    printf("For the number %d, the summation of digits is %d\n", originalNumber, sum);

    return 0;
}

