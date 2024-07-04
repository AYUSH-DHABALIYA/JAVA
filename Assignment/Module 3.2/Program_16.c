#include <stdio.h>

int main() {
    int rows = 5; // You can adjust the number of rows as needed

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%d ", j % 2); // Alternate between 0 and 1
        }
        printf("\n");
    }

    return 0;
}
/*
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 */
