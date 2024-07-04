// Write a C++ program to implement a class called Circle that has private member variables for radius. Include member functions to calculate the circle's area and circumference
#include<iostream>
using namespace std;
class circle // creating class circle
{
private : // here data members are private that means worked only in class body
    float radius,area,circum;
    float pi = 3.14; 
public :
    int calc_area(){ // creating function

    cout << "Enter the radius : ";
    cin >> radius;
    area = pi * radius * radius;
    cout << "\nThe area of circle is : "<< area;

    }
    int calc_circum(){
    circum = 2* pi * radius;
    cout << "\nThe circumference of circle is : "<< circum;
    }
};
int main()
{
    circle obj; // object creation
    obj.calc_area();// calling function
    obj.calc_circum();
    return 0;
}