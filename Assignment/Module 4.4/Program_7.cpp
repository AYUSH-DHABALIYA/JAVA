//Write a C++ Program to illustrates the use of Constructors in multilevel inheritance
#include<iostream>
using namespace std;
class A {// creating grand parent class 
public : 
        int a,b;
          A(){// creating constructor
        cout << "Enter the value of a : ";
        cin>>a;
    }
};
class B:public A { // creating parent class from grand parent class 
public : 
        B(){
        cout << "Enter the value of b : ";
        cin>>b;
    }
};
class C:public B {// creating child class 
public : 
        C(){
        cout <<"Addition is : "<<a+b;
    }
};

int main() {
    C c1;// creating object and function called it self because of constructor
    return 0;
}