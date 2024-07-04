//Write a program to find the max number from given two numbers using friend function
#include<iostream>
using namespace std;
class Demo{// class called demo private data members
private :
    int a,b;
public :
    friend int data(Demo &obj);// using friend function and passing dummy object for occuping space 
};
int data(Demo &obj)
{
    cout << "Enter the value of a and b : ";// getting value from user 
    cin >> obj.a >> obj.b;
    if (obj.a > obj.b) // putting condition
    {
       cout <<"\nMaximum number is : " <<  obj.a;
    }
    else
    {
        cout << "\nMaximum number is : " <<  obj.b;
    }
    
};

int main()
{
    Demo demo;// creating object 
    data(demo);// calling function
}