//Write a C++ Program display Student Mark sheet using Multiple inheritance
#include<iostream>
using namespace std;
class Student // creating class student
{
public :
    string name;// creating data member
    int roll_num,std;
    int student()
    {
        cout << "Enter the name of student : ";
        cin >> name;
        cout << "Enter the roll number of student : ";
        cin >> roll_num;
        cout << "Enter the standard of student : ";
        cin >> std;
    }
};

class Subject{ // creating child class
public : 
    int sub1, sub2, sub3, total;
    int subject(){
        cout << "\nEnter the marks of subject 1 : ";
        cin >> sub1;
        cout << "\nEnter the marks of subject 2 : ";
        cin >> sub2;
        cout << "\nEnter the marks of subject 3 : ";
        cin >> sub3;
        total = sub1 + sub2 + sub3;
        cout<<"Total : "<<total;

    }
};

class Result : public Student, public Subject // inherit child class from parent class
{
public : 
float per;
    int result1(){
        
        per = total / 3;
        cout << "\nThe result of student is : " << per ;
        return 0;
    }
};

int main(){
    Result obj; // object creation
    obj.student();// function calling
    obj.subject();
    obj.result1();
    return 0;

}