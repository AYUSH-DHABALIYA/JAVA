// Write a C++ program to create a class called Rectangle that has private member variables for length and width. Implement member functions to calculate the rectangle's area and perimeter
#include<iostream>
using namespace std;
class rectangle // creating class 
{
private : // private data member
    float length, width, area;
    float perimeter;
   
public :
    int rect_area(){ // creating data function for getting values from user
    cout << "Enter the length of rectangle : ";
    cin >> length;
    cout << "\nEnter the width of rectangle :";
    cin >> width;
    area = length * width;
    cout << "\nThe area of rectangle  is : " << area;
    }

    int rect_peri(){
    perimeter = 2 * (length + width);
    cout << "\nThe perimeter of rectangle is : " << perimeter;
    }
};
int main()
{
    rectangle obj;// create object 
    obj.rect_area(); // function calling
    obj.rect_peri();
    return 0;
}