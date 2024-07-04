//Write a program of to swap the two values using template

#include<iostream>
using namespace std;

template <typename T>// create template

class temp { // creating class template
    public:
    T swaping (T a,T b) { // creating data function for swapping the value
        T c;
        c = a;
        a = b;
        b = c;

        cout<<"Value after swaping : ";
        cout << "\nValue of a is : " << a;
        cout << "\nValue of b is : " << b;
    }
};


int main () { // creating main function
    int a,b;
    cout<<"Enter Value of a and b : ";
    cin>>a>>b;

    temp <int> t1;
    t1.swaping(a,b);
} 