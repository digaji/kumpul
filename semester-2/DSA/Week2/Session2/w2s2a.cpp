#include <iostream>
#include <string>
using namespace std;

struct Student {
	int id;
	string name;
	double gpa;
};

int main() {
	Student s;
	Student* sptr;

	int sid;
	string sname;
	double sgpa;

	// your code here
    sptr = new Student;

    cout << "Enter data for id: ";
    cin >> sid;

    cout << "Enter data for name: ";
    cin >> sname;

    cout << "Enter data for gpa: ";
    cin >> sgpa;

    s.id = sid;
    s.name = sname;
    s.gpa = sgpa;

    cout << "Student s's id is: " << s.id << endl;
    cout << "Student s's name is: " << s.name << endl;
    cout << "Student s's gpa is: " << s.gpa << "\n\n";

    sptr->id = sid;
    sptr->name = sname;
    sptr->gpa = sgpa;

    cout << "Student sptr's id is: " << sptr->id << endl;
    cout << "Student sptr's name is: " << sptr->name << endl;
    cout << "Student sptr's gpa is: "  << sptr->gpa << endl;

    delete(sptr);
}