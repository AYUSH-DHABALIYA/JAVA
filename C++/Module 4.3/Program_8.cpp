//Write a C++ program to implement a class called Student that has private member variables for name, class, roll number, and marks. Include member functions to calculate the grade based on the marks and display the student's information. Accept address from each student implement using of aggregation
#include<iostream>
using namespace std;
class Student{ // creating student class 
private :
    char grade;
    string name, address; // creating data member 
    int  roll_number, marks, standard, sub1, sub2, sub3;
public : 
    int student(){
        cout << "Enter your name : ";// get the value from user 
        cin >> name;
        cout << "Enter your roll number  : ";
        cin >> roll_number;
        cout << "Enter your address  : ";
        cin >> address;
        cout << "Enter your standard : ";
        cin >> standard;
      
      }
      int total_marks(){

            cout << "Enter the marks of  fisrt subject : ";// getting marks of student as per subjects
            cin >> sub1;
            cout << "Enter the marks of second subject : ";
            cin >> sub2;
            cout << "Enter the marks of third subject : ";
            cin >> sub3;

            marks = sub1 + sub2 + sub3;// total marks of subjects

         if (marks <= 100)
        {
           grade = 'F';
          
        }
        else if (marks <= 140)
        {
            grade = 'E';
           
        }
        else if (marks <= 170)
        {
            grade = 'D';
           
        }
        else if (marks <= 200)
        {
            grade = 'C';
          
        }
        else if (marks <= 240)
        {
            grade = 'B';
           
        }
        else if (marks <= 270)
        {
            grade = 'A';
           
        }
             
    }

    int show(){// creating function to show details of students 
         cout << "\nName of student is " << name;
         cout << "\nRoll number of student is " << roll_number;
         cout << "\nThe address of student is " << address;
         cout << "\nThe standard of student is " << standard;
         cout << "\nThe marks of student is " << marks;
         cout << "\nThe grade of student is " << grade;
    }
};

int main(){
    Student obj;// creating object 
    obj.student();// calling function
    obj.total_marks();
    obj.show();
}
