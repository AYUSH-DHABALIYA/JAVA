//WAP to make addition, Subtraction and multiplication of two matrix using 2-D Array

/*
1 1 1       1 1 1       2 2 2
1 1 1   +   1 1 1   =   2 2 2
1 1 1       1 1 1       2 2 2
*/

#include<stdio.h>
void main()
{
    int arr1[3][3] = {{1,1,1},{1,1,1},{1,1,1}};
    int arr2[3][3] = {{1,1,1},{1,1,1},{1,1,1}};
    int total[3][3];
    int i,j;
     
    // addition
    for (i = 0; i < 3; i++)
    {
       for (j = 0; j < 3; j++)
       {
        total[i][j] = arr1[i][j] + arr2[i][j];
       }
    }

printf("Addition of Matrix : \n");
    for(i = 0; i<3; i++) {
        for(j=0; j<3; j++) {
            printf("%d ", total[i][j]);
        }
        printf("\n");
    }

    // subtraction
    for (i = 0; i < 3; i++)
    {
       for (j = 0; j < 3; j++)
       {
        total[i][j] = arr1[i][j] - arr2[i][j];
       }
    }
printf("Substraction of Matrix : \n");
    for(i = 0; i<3; i++) {
        for(j=0; j<3; j++) {
            printf("%d ", total[i][j]);
        }
        printf("\n");
    }

    // multiplication
    for (i = 0; i < 3; i++)
    {
       for (j = 0; j < 3; j++)
       {
        total[i][j] = arr1[i][j] * arr2[i][j];
       }
    }

printf("Multiplication of Matrix :\n");
    for(i = 0; i<3; i++) {
        for(j=0; j<3; j++) {
            printf("%d ", total[i][j]);
        }
        printf("\n");
    }
}