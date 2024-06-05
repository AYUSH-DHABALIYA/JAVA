#include <stdio.h>

int main() {
    int rows; // You can adjust the number of rows as needed
    int currentChar;

    for (int i = 65; i <= 69; i++) {
        for (int j = 65; j <= i; j++) {
            printf("%c ", j);
        }
        printf("\n");
    }

    return 0;
}

/*
A
A B
A B C
A B C D
A B C D E
*/

