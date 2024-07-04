/* 11. Write a program to calculate the area of circle, rectangle and triangle using Function Overloading
Rectangle: Area * breadth
Triangle: ½ *Area* breadth
Circle: Pi * Area *Area */
#include<iostream>
using namespace std;
class Area{// creating class 
public :
   int area(int area, int breadth)// passing parameter, formula of rectangle
   {
        cout << "\nThe area of rectangle is : " << area * breadth;
   }

   int area(float a, int area, int breadth)// fromula of triangle
   {
        cout << "\nThe rectangle is : " << a * area * breadth;
   }

   int area(int area)//formula of cicrle 
   {
        cout << "\nThe area of circle : " << 3.14 * area * area;
   }
};

int main() // creating main function
{
    int a, b;
    cout << "\nEnter the value of a and b : ";// getting value from user
    cin >> a >> b;

    Area obj;// creating object 
    obj.area(a,b);// passing value to parameter
    obj.area(0.5,a,b);
    obj.area(a);
    return 0;
}

