//Write a program of to sort the array using templates
#include <iostream>

using namespace std;

template<typename T>
void bubbleSort(T arr[], int size) {
    for (int i = 0; i < size - 1; ++i) {
        for (int j = 0; j < size - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                T temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

template<typename T>
void displayArray(T arr[], int size) {
    for (int i = 0; i < size; ++i) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    // Example with integer array
    int intArr[] = {5, 2, 9, 1, 6};
    int intSize = sizeof(intArr) / sizeof(intArr[0]);
    cout << "Original integer array: ";
    displayArray(intArr, intSize);
    bubbleSort(intArr, intSize);
    cout << "Sorted integer array: ";
    displayArray(intArr, intSize);

    cout << endl;

    // Example with double array
    double doubleArr[] = {3.5, 1.2, 8.9, 2.7, 5.6};
    int doubleSize = sizeof(doubleArr) / sizeof(doubleArr[0]);
    cout << "Original double array: ";
    displayArray(doubleArr, doubleSize);
    bubbleSort(doubleArr, doubleSize);
    cout << "Sorted double array: ";
    displayArray(doubleArr, doubleSize);

    return 0;
}
