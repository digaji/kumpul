#include <iostream>
#include "stack_array.h"

using namespace std;

// * I pick reversing a list

int main() {
    Stack st;
    int val, number;

    cout << "Enter number of elements in the list: ";
    cin >> number;

    int arr[number];

    cout << "Enter the elements of the list: " << endl;

    for (int i = 0; i < number; i++) {
        cin >> arr[i];
    }

    for (int i = 0; i < number; i++) {
        st.push(arr[i]);
    }

    for (int i = 0; i < number; i++) {
        val = st.pop();
        arr[i] = val;
    }

    cout << "Reversed: ";
    for (int i = 0; i < number; i++) {
        cout << arr[i] << " ";
    }
}