//WAP to find reverse of string using recursion//
#include<stdio.h>
#include<string.h>

char str[20];
int len;

char str_reverse(char str[20],int len)
{
    if (str[len] == '\0')
    {
        return  ' ';
    }
   else
   {
        printf("%c",str[len]);
        str_reverse("ayush",len-1); 
   }  
}
void main(){
    char str[20] = {"ayush"};
    int len = strlen(str);
    str_reverse(str,len-1);

}