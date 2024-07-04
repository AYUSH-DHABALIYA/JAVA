//WAP of swaping the value//
#include<stdio.h>
void main()
{
    int a,b,c;
    printf("\nValue of a and b before swapping",a,b);

    printf("\n\nEnter vlaue of a : ");//value before swapping//
    scanf("%d",&a);//get user value//
    printf("\nEnter value of b :");
    scanf("%d",&b);
    
   c = a;
   a = b;
   b = c;
   printf("\n\nValue of a and b after swap",a,b);//value of after swap//
   printf("\nValue of a is : %d",a);
   printf("\nValue of b is : %d",b);

   
}