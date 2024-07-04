// WAP of simple intrest //
#include<stdio.h>
void main()
{
    float p,i,t;//creat variable in float//
    float si;
    printf("\nEnter principal :");
    scanf("%f",&p);
    printf("\nEnter intrest rate :");
    scanf("%f",&i);
    printf("\nEnter time :");
    scanf("%f",&t);
    si = p*i*t/100;//formula of simple intrest//
    printf("\nSimple intrest is : %.2f",si);
}