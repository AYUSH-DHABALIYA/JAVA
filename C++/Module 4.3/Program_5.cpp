// Write a C++ program to create a class called Triangle that has private member variables for the lengths of its three sides. Implement member functions to determine if the triangle is equilateral, isosceles, or scalene.
#include<iostream>
using namespace std;
class Triangle{// creating class called triangle 
private :
    int len1, len2, len3;// creating data member for three sides 

public : 
    int triangle(){ // creating function and getting the value from user 
    cout << "Enter the three lengths of triangle :";
    cin >> len1 >> len2 >> len3;
    
    if (len1 == len2 && len2 == len3 && len3 == len1) // 10 == 10 && 10 == 10 && 10 == 10, this equilateral 
    {
       cout << "\nThe triangle is Equilateral";
    }
    else if (len1 == len2 || len2 == len3 || len3 == len1)// 10 == 10 || 10 == 10 || 10 == 10, this isoclecs
    {
       cout << "\nThe triangle is Isoclecs";
    }
    else 
    {
        cout << "\nThe triangle is Scalene";
    }
    } 
};

int main()
{
    Triangle tri;// create an object 
    tri.triangle();// calling function
    return 0;

}