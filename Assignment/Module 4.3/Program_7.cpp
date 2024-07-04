// Write a C++ program to implement a class called Date that has private member variables for day, month, and year. Include member functions to set and get these variables, as well as to validate if the date is valid
#include<iostream>
using namespace std;
class  Data{ // creating class data
private :
    int  day, month, year;

public : // data function for getting value from user
    int data()
    {
        cout << "Enter the number of days : ";
        cin >> day;
       if (day <= 31)
       {
        cout << "\nDays";
       }
       else
       {
        cout << "\nPlease enter proper day";
       }

        cout << "\nEnter number of months : ";
        cin >> month;
       if (month <= 12)
       {
        cout << "\nMonth";
       }
       else
       {
        cout << "\nPlease enter proper month";
       }

        cout << "\nEnter number of year : ";
        cin >> year;
       if (year >= 1900 && year <=2100)
       {
        cout << "\nYear";
       }
       else
       {
        cout << "\nPlease enter proper year";
       }
       
    }
};

int main()
    {
        Data obj; // object creation
        obj.data();// function calling
    }
