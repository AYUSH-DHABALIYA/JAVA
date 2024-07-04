//WAP of area of circle, rectangle, triangle//
#include<stdio.h>
// Area of circle//
void main()
{
   /**/ int radius;
    float pi = 3.14;// constant value of pi//
    printf("\nEnter radius of circle : ");
    scanf("%d",&radius);
    float circle = (float)(pi*radius*radius);//convert into float to get value in floar//
    printf("\nArea of circle is: %.2f ",circle);//get the area of circle //

// Area of rectangle//
    
   float area;
   float width,length;
   printf("\n\nEnter length :");
   scanf("%f",&length);
   printf("\nEnter width :");
   scanf("%f",&width);
   area = length*width;//formula of rectangle //
   printf("\nArea of rectangle is : %f",area);//area of rectangle//

    

// Area of triangle //

    float a;
    float base,heigth;
    printf("\n\nEnter base");
    scanf("%f",&base);
    printf("\nEnter heigth");
    scanf("%f",&heigth);
    a = 0.5*base*heigth;//formula of triangle//
    printf("Area of triangle is : %f",a);//area of triangle//

        
    


}

