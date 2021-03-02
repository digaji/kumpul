#include <iostream>
#include <string>
#include "SimpleLL.h"

using namespace std;


int main() {
	SimpleLL list1, list2;
	int data;

    // Your code here
    // * Print all the nodes in the linked list manually
    cout << "Enter data for 4 nodes!" << endl;

    cout << "1st node: ";
    cin >> data;
    list1.insert(data);

    cout << "2nd node: ";
    cin >> data;
    list1.insert(data);

    cout << "3rd node: ";
    cin >> data;
    list1.insert(data);

    cout << "4th node: ";
    cin >> data;
    list1.insert(data);

    cout << "\n";

    list1.print();

    cout << "\n";

    // * Searching example
    cout << "Enter data to be searched: ";
    cin >> data;
    list1.search(data);

    // * Destroying example
    cout << "Enter data to be destroyed: ";
    cin >> data;
    list1.destroy(data);

    // * Printing example after destroying
    list1.print();

    // * Create another 4-node linked list automatically
    cout << "Creating 4-node linked list" << endl;
    for (int i = 0; i < 4; i++) {
        list2.insert(i);
    }

    // * Print all the nodes in the linked list automatically
    list2.print();
}