#include <iostream>
#include "arrayList.h"

using namespace std;

void prompt();

int main() {
    // variable declaration
    int choice, value;

    // create a list
    cout << "How many values do you want to store? (integer): ";
    cin >> value;

    createList(value);

    // input loop
    prompt();
}

void prompt() {
    int option, existingData, newData;

    cout << "What do you want to do?" << endl;
	cout << "Choose from the following options:" << endl;
	cout << "Choose 1: Insert new data" << endl;
	cout << "Choose 2: Replace existing data" << endl;
	cout << "Choose 3: Delete existing data" << endl;
	cout << "Choose 4: Print data" << endl;
    cout << "Choose 5: Exit program" << endl;

    cin >> option;

    switch(option) {
        case 1:  // insert new data
            cout << "\nEnter new data: ";
            cin >> newData;

            // checks if newData already exists in list or not
            if (seqSearch(newData) == -1) {
                insert(newData);
            } else {
                cerr << "Data already exists!" << endl;;
            };
            prompt();
            break;
        case 2:  // replace existing data
            // prints current list
            cout << "List of existing data: ";
            print();

            cout << "\nEnter an existing data: ";
            cin >> existingData;

            if (seqSearch(existingData) != 1) {
                cout << "\nEnter new data: ";
                cin >> newData;

                replaceAt(seqSearch(existingData), newData);
            } else {
                cout << "Data doesn't exist!" << endl;
            };
            prompt();
            break;
        case 3:  // delete existing data
            // prints current list
            cout << "List of existing data: ";
            print();

            cout << "Enter an existing data: ";
            cin >> existingData;

            remove(existingData);
            prompt();
            break;
        case 4:  // print data
            cout << "List of existing data: ";
            print();
            prompt();
            break;
        case 5:  // exit program
            break;
        default:  // in case user enters integer not in options
            cout << "Not an option! Try again." << "\n\n";
            prompt();
            break;
    }
}