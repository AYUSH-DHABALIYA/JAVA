#include <stdio.h>

int main() {
    int rows = 5; // You can adjust the number of rows as needed

    for (int i = 1; i <= rows; i++) {
        // Print spaces
        for (int j = 1; j <= rows - i; j++) {
            printf("  ");
        }

        // Print asterisks
        for (int k = 1; k <= 2 * i - 1; k++) {
            printf("* ");
        }

        printf("\n");
    }

    return 0;
}


/*
       * 
      * * * 
    * * * * * 
  * * * * * * *
* * * * * * * * **/