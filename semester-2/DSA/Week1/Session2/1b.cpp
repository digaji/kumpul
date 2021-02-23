#include <iostream>
using namespace std;

void swap(int* x, int* y);

int main(){
	int a, b;

	cout << "Enter first number: ";
	cin >> a;

	cout << "Enter second number: ";
	cin >> b;

	// print before swap
	cout << "BEFORE SWAP: First number is " << a << " and the Second number is " << b << endl;

	// try to swap
	swap(&a, &b);

	// print before swap
	cout << endl << "AFTER SWAP: First number is " << a << " and the Second number is " << b << endl;
}

void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
