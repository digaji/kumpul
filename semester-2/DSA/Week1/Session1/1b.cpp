#include <iostream>

using namespace std;

int main(){
	// declare variables
	string day;
    string days[7] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int sizeDays = sizeof(days)/sizeof(days[0]);

	// print message to the console
	cout << "What day is it today?" << endl;

	// get input data
	cin >> day;

    // check data
    for (int i = 0; i < sizeDays; i++) {
        if (days[i] == day) {
            if (i <= 4) {
                cout << "I'm studying";
                return 0;
            } else if (i > 4) {
                cout << "I go fishing";
            }
        }
    }
}
