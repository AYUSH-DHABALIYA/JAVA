// WAP to show difference between Structure and Union
#include<stdio.h>
struct data1// creating structure
{
    int a,b;
    char x[10], y;
    float z;
   
}st;

union data2
{
    int a,b;
    char x[10], y;
    float z;
}un;

void main()
{
    printf("Size of structure : %d",sizeof(st));
    printf("\nSize of union : %d",sizeof(un));
    
}
