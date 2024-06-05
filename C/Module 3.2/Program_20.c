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


