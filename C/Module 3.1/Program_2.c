// WAP making simple calculator//
#include<stdio.h>
void main()
{
    int a, b;
    printf("Enter the value of a :");
    scanf("%d",&a); // to get value //
    printf("Enter the value of b :");
    scanf("%d",&b);
    printf("\nAddition of number is: %d", a+b); // addition of and b //
    printf("\nSubstraction of number is: %d", a-b); // substraction of a and b //
    printf("\nMultiplication of number is: %d", a*b);// multiplication of a and b //
    printf("\nDivision of number is: %d", a/b);// division of a and b //
    printf("\nModule of number is: %d", a%b);// modulo of a and b //
}