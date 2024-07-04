// Write a program to find the multiplication values and the cubic values using inline function
#include<iostream>
using namespace std;
class Multiplication { // creating class 
public :
    inline  multiplication_num(int a, int b){  cout << "\nMultiplication of number is " << a * b;} // using inline function
    
     inline int multiplication_cube(int x){  cout << "\nCube of number is  " << x * x * x;}
};

int main(){
    Multiplication obj;// create an object of  class
    obj.multiplication_num(10,2);//passing value in parameter, multiplication of a and b
    obj.multiplication_cube(3);// cube of x 
}