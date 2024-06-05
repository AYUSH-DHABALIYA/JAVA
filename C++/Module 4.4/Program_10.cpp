// 10.Write a program to concatenate the two strings using Operator Overloading

#include <iostream>
#include <cstring>

using namespace std;

class MyString {
private:
    char *str;
    int length;

public:
    // Constructor
    MyString(const char *s = "") {
        length = strlen(s);
        str = new char[length + 1];
        strcpy(str, s);
    }

    // Destructor
    ~MyString() {
        delete[] str;
    }

    // Overloading + operator for string concatenation
    MyString operator+(const MyString &other) const {
        int newLength = length + other.length;
        char *newStr = new char[newLength + 1];
        
        strcpy(newStr, str);
        strcat(newStr, other.str);
        
        MyString result(newStr);
        delete[] newStr;

        return result;
    }

    // Method to display string
    void display() const {
        cout << "Concatenated string: " << str << endl;
    }
};

int main() {
    MyString str1("Hello, ");
    MyString str2("world!");

    MyString concatenated = str1 + str2;
    concatenated.display();

    return 0;
}
