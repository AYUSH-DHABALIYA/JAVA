#include <iostream>
#include <string>

using namespace std;

// Base class Person
class Person {
protected:
    string name;
    int age;

public:
    Person() {
        name = "";
        age = 0;
    }

    void setData() {
        cout << "Enter name: ";
        cin >> name;
        cout << "Enter age: ";
        cin >> age;
    }

    void displayData() {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
    }
};

// Derived class Student
class Student : public Person {
private:
    float percentage;

public:
    Student() {
        percentage = 0.0f;
    }

    void setData() {
        Person::setData(); // Calling base class method to set name and age
        cout << "Enter percentage: ";
        cin >> percentage;
    }

    void displayData() {
        Person::displayData(); // Calling base class method to display name and age
        cout << "Percentage: " << percentage << "%" << endl;
    }
};

// Derived class Teacher
class Teacher : public Person {
private:
    float salary;

public:
    Teacher() {
        salary = 0.0f;
    }

    void setData() {
        Person::setData(); // Calling base class method to set name and age
        cout << "Enter salary: ";
        cin >> salary;
    }

    void displayData() {
        Person::displayData(); // Calling base class method to display name and age
        cout << "Salary: $" << salary << endl;
    }
};

int main() {
    Student s;
    cout << "Enter student details:\n";
    s.setData();
    cout << "\nStudent details:\n";
    s.displayData();

    cout << "\n\n";

    Teacher t;
    cout << "Enter teacher details:\n";
    t.setData();
    cout << "\nTeacher details:\n";
    t.displayData();

    return 0;
}
