#include <iostream>
#include <string>
using namespace std;

struct Student {
	int id;
	string name;
	double gpa;
	Student* link;
};

int main() {
    Student* head;
	Student* current;
	Student* newnode;
	int sid;
	string sname;
	double sgpa;

    head = new Student();

    cout << "Enter data for 4 students!" << endl;

    for (int i = 0; i < 4; i++) {
        cout << "Enter student id: ";
        cin >> sid;
        cout << "Enter student name: ";
        cin >> sname;
        cout << "Enter student gpa: ";
        cin >> sgpa;

        cout << "\n";

        if (i == 0) {
            head->id = sid;
            head->name = sname;
            head->gpa = sgpa;
            head->link = nullptr;
            current = head;
        } else {
            current->link = new Student;
            current = current->link;    // node -> next node
            current->id = sid;
            current->name = sname;
            current->gpa = sgpa;
            current->link = nullptr;
        }
    }

    current = head;
    int i = 0;
    while (current != nullptr) {
        cout << "Node: " << i << endl;
        cout << "ID: " << current->id << endl;
        cout << "Name: " << current->name << endl;
        cout << "GPA: " << current->gpa << "\n\n";
        current = current -> link;  // next node
        i++;
    }
}