// Queueu
// a program to implement a queue using a normal array (linear array)
#include <iostream>
#include <cstdlib>
#define MAX 10 // Changing this value will change length of array

using namespace std;

class Queue
{
private:
	int queue[MAX];
	int front = -1, rear = -1;

public:
	void insert(int);
	int delete_element();
	int peek();
	void display();
};

void Queue::insert(int num)
{
	// your code
    if (rear == MAX - 1) {
        cout << "OVERFLOW" << endl;
    } else if (front == -1 & rear == -1) {
        front = rear = 0;
        queue[rear] = num;
    } else {
        rear += 1;
        queue[rear] = num;
    }
}

int Queue::delete_element()
{
	int val;
	// your code
    if (front == -1 || front > rear) {
        cout << "UNDERFLOW" << endl;
        return -1;
    } else {
        val = queue[front];
        front += 1;
        return val;
    }
}

int Queue::peek()
{
	if (front == -1 || front > rear)
	{
		cout << "\n QUEUE IS EMPTY";
		return -1;
	}
	else
	{
		return queue[front];
	}
}

void Queue::display()
{
	int i;
	cout << "\n";
	if (front == -1 || front > rear)
		cout << "\n QUEUE IS EMPTY";
	else
	{
		for(i = front; i <= rear; i++)
			cout << "\t " << queue[i];
	}
}

int main()
{
	int option, val;
	Queue q;
	do
	{
		cout << "\n\n ***** MAIN MENU *****";
		cout << "\n 1. Insert (enqueue) an element";
		cout << "\n 2. Delete (dequeue) an element";
		cout << "\n 3. Peek";
		cout << "\n 4. Display the queue";
		cout << "\n 5. EXIT";
		cout << "\n Enter your option : ";
		cin >> option;

		switch(option)
		{
			case 1:
					int num;
					cout << "\n Enter the number to be inserted in the queue : ";
					cin >> num;
					q.insert(num);
					break;
			case 2:
					val = q.delete_element();
					if (val != -1)
						cout << "\n The number deleted is : " << val;
					break;
			case 3:
					val = q.peek();
					if (val != -1)
						cout << "\n The first value in queue is : " << val;
					break;
			case 4:
					q.display();
					break;
		}
	}while(option != 5);

	return 0;
}
/*
Output
***** MAIN MENU *****"
1. Insert (enqueue) an element
2. Delete (dequeue) an element
3. Peek
4. Display the queue
5. EXIT
Enter your option : 1
Enter the number to be inserted in the queue : 50
*/


