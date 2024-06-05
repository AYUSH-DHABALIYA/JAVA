// WAP to find factorial using recursion
#include<stdio.h>
int fact(int n )// creating function and giving parmeter
{
    if (n <= 1)// putting conditon 
    {
       return 1;
    }
    return n*fact(n-1);// finction call itself 
}
void main() // creating main function 
{
    int n;
    printf("Enter the value of n : ");// getting value from user 
    scanf("%d",&n);
    printf("%d",fact(n));
    
}