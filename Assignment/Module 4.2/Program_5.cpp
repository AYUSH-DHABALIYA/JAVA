// Write a C++ program to create a class called Person that has private member variables for name, age and country. Implement member functions to set and get the values of these variables
#include<iostream>
using namespace std;
class Person // creating class 
{
private : // creating private data member
     int age;
     string name, country;

public :
    int get(){ // creating data function to get value from user

        cout << "Enter your name : ";
        cin >> name;
        cout << "\nEnter your age : ";
        cin >> age;
        cout << "\nEnter your country : ";
        cin >> country;
    }
    int set(){
        cout << "\nYour name is  " << name;
        cout << "\nYour age is  " << age;
        cout << "\nYour country is  " <<country;
    }
};

int main(){
    Person obj; // object creation
    obj.get(); // function calling
    obj.set();
}