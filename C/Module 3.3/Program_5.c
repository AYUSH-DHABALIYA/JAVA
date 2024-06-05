//WAP to take two Array input from user and sort them in ascending or descending order as per user’s choice
#include<stdio.h>
void main()
{
    int i,n,j,ch;
    int k;
    printf("Enter the number of element of array : ");
    scanf("%d",&n);  // 60 40 30 50 10
    
    int arr1[n];//creating array
    int arr2[n];
    printf("Array 1 :");
    for(i=0;i<=n;i++) {
        printf("\nEnter Element of Array : ");
        scanf("%d", &arr1[i]);//get value from user
    }
    printf("Array 2 :");
    for(i=0;i<=n;i++) {
        printf("\nEnter Element of Array : ");
        scanf("%d", &arr2[i]);
    }

    printf("\n1.Ascending\n2.Descending");
    printf("\nPlease Enter your choice : ");
    scanf("%d", &ch);
    switch (ch)//using swiitch case for choice of user 
    {
    case 1:
         printf("\nAscending of array 1");
    for ( i = 0; i<=n; i++)
    {
        for ( j = i+1; j <=n; j++)//putting condition
        {
            if (arr1[i]>arr1[j])
            {
               k = arr1[i];//comparing values
               arr1[i] = arr1[j];
               arr1[j] = k;
            }
            
        }
        
        printf("\n Ascending value of array is %d",arr1[i]);
    }
    printf("\nAsecnding of array 2 :");// for ascending
    for ( i = 0; i<=n; i++)
    {
        for ( j = i+1; j <=n; j++)
        {
            if (arr2[i]>arr2[j])
            {
               k = arr2[i];
               arr2[i] = arr2[j];
               arr2[j]= k;
            }
            
        }
        
        printf("\n Ascending value of array is %d",arr2[i]);
    }
        break;
    case 2 :
    printf("\nDescending of array 1 : ");// for descending
    
    for ( i = 0; i<=n; i++)
    {
        for ( j = i+1; j <=n; j++)
        {
            if (arr1[i]<arr1[j])
            {
               k = arr1[j];
               arr1[j] = arr1[i];
               arr1[i] = k;
            }
            
        }
        printf("\n Descending value of array is %d",arr1[i]);
    }
    printf("\nDescending of array 2 :");
    for ( i = 0; i<=n; i++)
    {
        for ( j = i+1; j <=n; j++)
        {
            if (arr2[i]<arr2[j])
            {
               k = arr2[j];
               arr2[j] = arr2[i];
               arr2[i] = k;
            }
            
        }
        printf("\n Descending value of array is %d",arr2[i]);
    }
    
        break;

    default:
        printf("\nInvalid input");
        break;
    }
    
   
   

}