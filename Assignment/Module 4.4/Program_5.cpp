// Assume that the test results of a batch of students are stored in three different classes. Class Students are storing the roll number. Class Test stores the marks obtained in two subjects and class result contains the total marks obtained in the test. The class result can inherit the details of the marks obtained in the test and roll number of students. (Multilevel Inheritance)
#include<iostream>
using namespace std;

class Students // creating parents class 
{
public :
    int roll_num;
    int roll(){
         cout << "Enter the roll number : ";// getting the roll number from student 
         cin >> roll_num;
    }
};

class Test : public Students // creating derived class from student class 
{
public : 
        int sub1, sub2;
    int test(){
        cout << "\nEnter the marks of subject 1 : ";// getting the marks of student
        cin >> sub1;
        cout << "\nEnter the marks of subject 2 : ";
        cin >> sub2;
    }
};
class Result : public Test // creating derived class from test class
{
public : 
    int result()
    {
        int total;
        total = sub1 + sub2;// total marks of test
        cout << "\nThe total marks of student is  : " << total;
    }
    
};

int main()
{
    Result obj;// creating object 
    obj.roll();// calling functions as per their requirment
    obj.test();
    obj.result();
    return 0;
}