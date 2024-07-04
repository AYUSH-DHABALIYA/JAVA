// Write a program of structure for five employee that provides the following information -print and display empno, empname, address and age
#include <stdio.h>
struct Employee
{
    char name[20], adress[30];
    int empno,age;
}st[10];

void main()
{
    int i;
    for (i = 1; i <= 5; i++)
    {
    printf("Enter Details of Employee : %d ", i);
    printf("\nEnter employee No. : ");
    scanf("%d",&st[i].empno);// getting value from user name, no.,age,address
    printf("\nEnter employee name : ");
    scanf("%s",&st[i].name);
    printf("\nEnter your age : ");
    scanf("%d",&st[i].age);
    printf("\nEnter your address  : ");
    scanf("%s",&st[i].adress);
    }
    for(i  = 1; i <= 5; i++)
    {
    printf("\n%s your employee no is %d your age is %d and your address is %s", st[i].name,st[i].empno,st[i].age,st[i].adress);
    }
    
}
