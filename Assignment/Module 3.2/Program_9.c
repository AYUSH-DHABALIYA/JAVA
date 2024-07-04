// sum of odd numbers 
#include <stdio.h>

int main() {
    int limit, sum = 0;
    
    // Input the limit
    printf("Enter the limit: ");
    scanf("%d", &limit);

    // Validate input
    if (limit <= 0) {
        printf("Please enter a positive integer as the limit.\n");
        return 1;
    }

    // Calculate and print the sum of odd numbers
    printf("Sum of odd numbers up to %d: ", limit);
    int i;
    for ( i = 1; i <= limit; i += 2) 
    {
        sum += i;
    }
    printf("%d\n", sum);

    return 0;
}
