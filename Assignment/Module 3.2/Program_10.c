#include <stdio.h>

int main() {
    int number;
   int  factorial = 1; 
 
    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    // Validate input
    if (number < 0) {
        printf("Please enter a positive number.\n");
    }

    // Calculate factorial
    for (int i = 1; i <= number; i++) {
        factorial *= i; // factorial = factorial * i
    }

    // Print the factorial
    printf("Factorial of %d: %d\n", number, factorial);

    return 0;
}
