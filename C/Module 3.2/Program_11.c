#include <stdio.h>

int main() {
    int number, first = 0, second = 1, next;

    // Input the number
    printf("Enter the number: ");
    scanf("%d", &number);

    // putting condition
    if (number <= 0) {
        printf("Please enter the positive number.\n");
        
    }

    // Print Fibonacci series
    printf("Fibonacci series up to %d: %d, %d", number, first, second);

    for (int i = 2; i < number; ++i) {
        next = first + second; // next = 0 + 1
        printf(", %d", next); // 1
        first = second; // 0 = 1 first = 1
        second = next; // 1 = 1 second = 1
    }

    printf("\n");

    return 0;
}


// 0 1 1 2 3 5 8...