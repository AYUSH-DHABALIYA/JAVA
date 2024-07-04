// WAP to print number in reverse order e.g.: number = 64728 ---> reverse = 82746
#include <stdio.h>

int main() {
    int number, reversedNumber = 0, remainder;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    // Reverse the number
    while(number != 0){
        remainder = number % 10; // 512 = reminder = 512 % 10 = 51 2
        reversedNumber = reversedNumber * 10 + remainder; // rev = rev * 10 + rem = 0 * 10 + 2 = 2
        number/=10;
    }

    // Print the reversed number
    printf("Reversed number: %d\n", reversedNumber);

    return 0;
}

