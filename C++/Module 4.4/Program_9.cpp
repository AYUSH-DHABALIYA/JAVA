// Write a Program of Two 1D Matrix Addition using Operator Overloading
#include <iostream>

using namespace std;

class Matrix {
private:
    int size;
    int *data;

public:
    // Constructor
    Matrix(int s) : size(s) {
        data = new int[size];
    }

    // Destructor
    ~Matrix() {
        delete[] data;
    }

    // Overloading + operator for matrix addition
    Matrix operator+(const Matrix &other) {
        if (size != other.size) {
            cout << "Error: Matrices must have the same size for addition.\n";
            exit(1);
        }

        Matrix result(size);
        for (int i = 0; i < size; i++) {
            result.data[i] = data[i] + other.data[i];
        }
        return result;
    }

    // Method to input matrix elements
    void input() {
        cout << "Enter " << size << " elements:\n";
        for (int i = 0; i < size; i++) {
            cin >> data[i];
        }
    }

    // Method to display matrix elements
    void display() {
        cout << "Matrix elements:\n";
        for (int i = 0; i < size; i++) {
            cout << data[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    int size;
    cout << "Enter the size of the matrices: ";
    cin >> size;

    Matrix mat1(size), mat2(size);
    
    cout << "Enter elements for first matrix:\n";
    mat1.input();
    
    cout << "Enter elements for second matrix:\n";
    mat2.input();

    Matrix sum = mat1 + mat2;

    cout << "Result of matrix addition:\n";
    sum.display();

    return 0;
}
