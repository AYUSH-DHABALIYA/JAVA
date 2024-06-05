// Write a C++ Program to find Area of Rectangle using inheritance
#include<iostream>
using namespace std;
class Triangle // creating parent class 
{
public :
    int area, base, height;
};

class triangle : public Triangle // creating child class 
{
public :
    int get() // creating data function
    {
        cout << "\nEnter the base of triangle : ";
        cin >> base;
        cout << "\nEnter the height of triangle : ";
        cin >> height;

        area = 0.5 * base * height;
        cout << "\nThe area of triangle is " << area;
    }
};

int main()// creating main function
{
    triangle tri;// creating object
    tri.get();// calling function
    return 0;
}