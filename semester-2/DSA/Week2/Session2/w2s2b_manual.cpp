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

	cout << "Enter student id: ";
	cin >> sid;
	cout << "Enter student name: ";
	cin >> sname;
	cout << "Enter student gpa: ";
	cin >> sgpa;

	head = new Student;
	current = head;

	current->id = sid;
	current->name = sname;
	current->gpa = sgpa;
	current->link = nullptr;

	// Your code here
    // second entry
    cout << "Enter student id: ";
	cin >> sid;
	cout << "Enter student name: ";
	cin >> sname;
	cout << "Enter student gpa: ";
	cin >> sgpa;

    current->link = new Student;
    current = current->link;    // first -> second
	current->id = sid;
	current->name = sname;
	current->gpa = sgpa;
	current->link = nullptr;

    // third entry
    cout << "Enter student id: ";
	cin >> sid;
	cout << "Enter student name: ";
	cin >> sname;
	cout << "Enter student gpa: ";
	cin >> sgpa;

    current->link = new Student;
    current = current->link;    // second -> third
	current->id = sid;
	current->name = sname;
	current->gpa = sgpa;
	current->link = nullptr;

    // fourth entry
    cout << "Enter student id: ";
	cin >> sid;
	cout << "Enter student name: ";
	cin >> sname;
	cout << "Enter student gpa: ";
	cin >> sgpa;

    current->link = new Student;
    current = current->link;    // third -> fourth
	current->id = sid;
	current->name = sname;
	current->gpa = sgpa;
	current->link = nullptr;

    // print manual
    current = head; // set it back to first

    cout << "Node: 1" << endl;
    cout << "ID: " << current->id << endl;
    cout << "Name: " << current->name << endl;
    cout << "GPA: " << current->gpa << endl;
    current = current -> link;  // next node

    cout << "Node: 2" << endl;
    cout << "ID: " << current->id << endl;
    cout << "Name: " << current->name << endl;
    cout << "GPA: " << current->gpa << endl;
    current = current -> link;  // next node

    cout << "Node: 3" << endl;
    cout << "ID: " << current->id << endl;
    cout << "Name: " << current->name << endl;
    cout << "GPA: " << current->gpa << endl;
    current = current -> link;  // next node

    cout << "Node: 4" << endl;
    cout << "ID: " << current->id << endl;
    cout << "Name: " << current->name << endl;
    cout << "GPA: " << current->gpa << endl;
}