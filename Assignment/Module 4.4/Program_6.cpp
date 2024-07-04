// Write a C++ Program to show access to Private Public and Protected using Inheritance
#include<iostream>
using namespace std;
class Parent { // creating parent class 
public :
    int i = 10, k =20;// passing value 
    int parent()
    {
        cout << "Additon of  i and k is " << i + k;
    }
private :
    string str = "ayush dhabliya";// passing stringin private
    int demo()
    {
        cout << "\nYour string is " << str;
    }
};
class Demo{
protected :
    int a = 10, b = 20;// passing value in protected
    int data()
    {
        cout << "\nMultiplication of and b : " << a * b ;
    }
};

class child : public Parent, virtual Demo//derieving child class 
{
public :
  int chill()// creating function
  {
    parent();
    data();
  }
};

int main()
{
    child obj;// creating object 
    obj.chill();//calling function
    return 0;
}