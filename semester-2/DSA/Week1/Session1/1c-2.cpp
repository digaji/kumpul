#include <iostream>
using namespace std;

int main() {
	// declare an array
	int ROW = 6;
	string data[ROW] = {"Nicky","David","Guntur","Cindy","Rizqy","James"};
	string key;
    int index;
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
