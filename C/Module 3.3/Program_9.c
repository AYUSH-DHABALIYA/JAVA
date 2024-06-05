//Write a program of structure employee that provides the following information -print and display empno, empname, address and age
#include<stdio.h>
struct emp{ // creating structure 
    int empno,age;// create variable 
    char empname[20],address[30];
    
}st;

void main()// creating function 
{
    printf("Enter employee No. : ");
    scanf("%d",&st.empno);// getting value from user name, no.,age,address
    printf("\nEnter employee name : ");
    scanf("%s",&st.empname);
    printf("\nEnter your age : ");
    scanf("%d",&st.age);
    printf("\nEnter your address  : ");
    scanf("%s",&st.address);
    printf("\n%s your employee no is %d and your age is %d and your address is %s",st.empname,st.empno,st.age,st.address);
   
}