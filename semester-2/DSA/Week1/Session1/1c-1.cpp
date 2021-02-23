#include <iostream>
using namespace std;

int main() {
	// declare an array
	int ROW = 9;
	int data[ROW] = {3, 49, 1, 6, 33, 13, 9, 4, 6};
	int key, index;
    bool inArray = false;

	// prompt the search key
	cout << "What data are you searching for?" << endl;
	cin >> key;

    for (int i = 0; i < ROW; i++) {
        if (data[i] == key) {
            inArray = true;
            index = i;
            break;
        }
    }
    if (inArray) {
        cout << "found in index " << index;
    } else {
        cout << "not found";
    }
}
