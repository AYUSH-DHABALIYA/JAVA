#include <stdio.h>

int main() {
    int rows = 5; // You can adjust the number of rows as needed
    int currentNumber = 1;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%d ", currentNumber);
            currentNumber++;
        }
        printf("\n");
    }

    return 0;
}
/*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15 */

