#include <stdio.h>

int main() {
    int rows = 5; // You can adjust the number of rows as needed
    char currentChar = 'A';

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%c ", currentChar);
            currentChar++;
        }
        printf("\n");
    }

    return 0;
}


/*
A 
B C 
D E F 
G H I J 
K L M N O */