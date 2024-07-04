//WAP of monday to sunday using switch case //
#include<stdio.h>
void main()
{
  int days = 1;//correspond to any case//
   
 switch (days)
 {
   case 1:
   case 2:
   case 3:
   case 4:
   case 5:
   case 6:
   case 7:
     printf("\nModay\nTuesday\nWednesday\nThursday\nFriday\nSaturday\nSunday");//print all days we want//
   break;
 
 default:
   printf("\nInvalid days");
   break;
 }
    

}