//WAP of even and odd by getting value from user//
#include<stdio.h>
void main()
{
    int num;
    for ( num = 1; num<= 10; num++)
    {
       printf("\nEnter your numbers : ");
       scanf("%d",&num);
       if (num%2 == 0)
      {
        printf("%d is even number",num);
      }
       else
      {
        printf("%d is odd number",num);
      }
   
    }
   
    
    
}