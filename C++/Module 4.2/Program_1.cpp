// WAP to create simple calculator using class
#include<iostream>
using namespace std;
class calculator
{
public : 
        int number1, number2;
        void get()
        {
            cout << " Enter any two number : ";// getting value from user 
            cin >> number1  >> number2;
        }
        int add(){
            return number1 + number2;//addtion of two numbers
        }
        int sub(){// substraction of two numbers
            if(number1 > number2)
            return number1 - number2;
            
            else number2 - number1;
        }
        int mul(){
            return number1 * number2;// multiplication of two numbers

        }
        int div(){
            return number1 / number2;// division of two numbers
        }
};

int main()
{
    calculator calci;// object creation
    calci.get();// calling function
    cout << endl <<"Addition of number1 and number2 is : " << calci.add();
    cout << endl <<"Substraction of number1 and number2 is : " << calci.sub();
    cout << endl <<"Multiplication of number1 and number2 is : " << calci.mul();
    cout << endl <<"Division of number1 and number2 is : " << calci.div();
    return 0;
}
    
   