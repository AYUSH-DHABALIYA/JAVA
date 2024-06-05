//Write a program to swap the two numbers using friend function without using third variable
#include<iostream>
using namespace std;
class Demo{// creating class demo and providing data members in private
private :
    int x, y;

public : 
    friend int data(Demo &obj);// using friend function and passing dummy object
    
};
int data(Demo &obj)
{
    cout << "Enter the value of x : ";// getting the value from user 
    cin >> obj.x;
    cout << "\nEnter the value of y : ";
    cin >> obj.y;

    obj.x = obj.x + obj.y;// x = 10 + 20 = 30
    obj.y = obj.x - obj.y;// y = 30 - 20 = 10
    obj.x = obj.x - obj.y;// x = 30 - 10 = 20

    cout << "\nAfte swapping ";
    cout << "\nValue of x is : " << obj.x;// value after swapping 
    cout << "\nValue of y is :" << obj.y;

}

int main()
{
    Demo demo;// creating object 
    data(demo);//calling function
    return 0;
}