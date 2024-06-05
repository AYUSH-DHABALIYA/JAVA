// Write a C++ program to create a class called Car that has private member variables for company, model, and year. Implement member functions to get and set these variables.
#include<iostream>
using namespace std;
class Car{ // create a class and creating private data member
private :
    string company, model;
    int year;

public :
        int get(){// getting value from user 
            cout << "Enter the company of car : ";
            cin >> company;
            cout << "\nEnter the model of car : ";
            cin >> model;
            cout << "\nEnter the year of car : ";
            cin >> year;
        }

        int set(){// set the value 
            cout << "\nThe company of your car is " << company;
            cout << "\nThe model of your car is " << model;
            cout << "\nYear of car issued is " << year;
        }
};

int main()
{
    Car obj;//create an object 
    obj.get();
    obj.set();
}