//WAP of leap year //
#include<stdio.h>
void main()
{
    int year;
   printf("Enter year : ");
   scanf("%d",&year);//get user value//

   if ((year%4==0 && year%100!=0 ) || (year%400==0))//putting condition//
   {
   printf("\nThis year is leap year",year);
   } else{
    printf("\nThis year is not leap year",year);
   }
   
}