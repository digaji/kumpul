#include <iostream>

using namespace std;

// your code here
float larger(float data1, float data2);


int main() {
	float data1, data2;

	cout << "Enter first data " << endl;
	cin >> data1;

	cout << "Enter second data " << endl;
	cin >> data2;

	cout << "The larger of " << data1 << " and " << data2 << " is " << larger(data1, data2) << endl;

    return 0;
}

// your code here

float larger(float data1, float data2) {
    if (data1 < data2) {
        return data2;
    } else {
        return data1;
    }
}