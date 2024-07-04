// WAP to reverse a string and check that the string is palindrome or not
#include<stdio.h>
#include<string.h>
void main()
{
    char str[10],str2[10]; // creating array of string
    printf("Please enter the string  : ");
    scanf("%s",&str);// getting value from user 
    strcpy(str2,str);// copy string 1 to string 2
    strrev(str2);//reverse string
    printf("%s\n",str2);
    if (strcmp(str,str2)==0) // putting condition
    {
       printf("\nIt's pelindrome");
    }
    else{
        printf("\nIt's not pelindrome");
    }   
    

}