//WAP of Addition, Subtraction, Multiplication and Division using Switch case.
#include<stdio.h>
void main() // creating function 
{
    int choice, n1, n2;

    printf("\nEnter any two number : ");
    scanf("%d%d",&n1,&n2);// getting value from user
    printf("\nPlease select your choice :");
    printf("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division\n");//choice of user 
    scanf("%d",&choice);

    switch (choice)
    {
    case 1: 
        printf("\n\tAddition of two is : %d",n1+n2);
        break;
    case 2:
        printf("\n\tSubstraction of two number is : %d",n1-n2);
        break;
    case 3:
        printf("\n\tMultiplication of two number is : %d",n1*n2);
        break;
    case 4:
        printf("\n\tDivision of two number is : %d",n1/n2);
        break;
    

    default:
        printf("\nInvalid input");
        break;
    }

}
