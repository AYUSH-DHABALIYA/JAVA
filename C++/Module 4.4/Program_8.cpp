//Write a program to Mathematic operation like Addition, Subtraction, Multiplication, Division Of two number using different parameters and Function Overloading
#include<iostream>
using namespace std;
class calculator// creating class 
{
public :
    int calculate(int a, int b)// using function overloading
    {
        return a + b;// same class, same function different parameter
    }
    
    int calculate(int a, int b, int c)
    {
        return a * b * c;
    }

    int calculate(float a, float b)
    {
        return a / b;
    }

    int calculate(long a, long b)
    {
        return a- b;
    }
};

int main()
{
    calculator calc;
    cout << endl << "Additon = " << calc.calculate(10,20);// calculating the values 
    cout << endl <<  "Multilication = " << calc.calculate(10,20,30);
    cout << endl <<  "Division = "<< calc.calculate(20,10);
    cout << endl << "Substraction = " << calc.calculate(100,50);
    return 0;
}