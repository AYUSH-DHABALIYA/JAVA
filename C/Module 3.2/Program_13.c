// Write a program to find out the max from given number
#include <stdio.h>

int main() {
    int number, maxDigit = -1, digit;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    // Process each digit to find the maximum
    int originalNumber = number;  // Store the original number for reference

    while (number != 0) {
        digit = number % 10;

        // Update maxDigit if the current digit is greater
        if (digit > maxDigit) {
            maxDigit = digit;
        }

        number /= 10;
    }

    // Print the result
    printf("For the number %d, the maximum digit is %d\n", originalNumber, maxDigit);

    return 0;
}


