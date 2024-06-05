// Write a program of Addition, Subtraction, Division, Multiplication using constructor
#include<iostream>
using namespace std;
class Calculator{
public :
         Calculator(int a, int b){// creating constrcutor
        cout << "Addition of a and b is " << a + b;// addition of a and b
        cout << "\nSubstraction of a and b is " << a - b;//Substraction a -b
        cout << "\nDivision of a and b is " << a / b;//Divisiona a/b
        cout << "\nMultiplication of a and b is " << a * b;//Multiplication a*b
    }

};

int main()
{
    int num1, num2;
    cout << "\nEnter first number  ";
    cin >> num1;// getting value from user
    cout << "\nEnter second number ";
    cin >> num2;
    Calculator obj(num1,num2);//passing parameter in object
    return 0;

}