// WAP Find out length of string without using inbuilt function
#include<stdio.h>
void main()
{
    char str[10];//creating string of array
    int len = 0;
    printf("Enter any string : ");
    scanf("%s",&str);
    for (int i = 0; str[i]!= '\0'; i++)//finding length of string
    {
       len++;//add into length
    }
    printf("Length of string is : %d",len);
}