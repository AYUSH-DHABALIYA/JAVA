// Write a program to find out the max number from given array using function//
#include <stdio.h>
void maxnum()
{
    int i,max = 0;


    int arr[5] = {10,20,30,40,50};// creat array and giving static value 

    for ( i = 0; i <=5; i++)
    {
       if (arr[i]>max)//putting condition
       {
        max = arr[i];
       }
       
    }
    
    printf("Max element of array is : %d",max);//print element of array

}
 void main()
 {
    maxnum();
 }