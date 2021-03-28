// Queue
// a program to implement a queue using circular array.
#include <iostream>
#include <cstdlib>
#define MAX 10

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
	if ((front == 0 && rear == MAX - 1) || (rear == front - 1)) {
		cout << "\n OVERFLOW";
    } else if (front == -1 && rear == -1) {
		// your code
        front = rear = 0;
        queue[rear] = num;
	} else if (rear == MAX - 1 && front != 0) {
		// your code
        rear = 0;
        queue[rear] = num;
	} else {
		// your code
        rear++;
        queue[rear] = num;
	}
}

int Queue::delete_element()
{
	int val;
	if (front == -1 && rear == -1) {
		// your code
        cout << "UNDERFLOW" << endl;
	}

	val = queue[front];

	if (front == rear) {
        // your code
        front = rear = -1;
    } else {
		// your code
        if (front == MAX - 1) {
            front = 0;
        } else {
            front++;
        }
	}
	return val;
}

int Queue::peek()
{
	if (front == -1 && rear == -1)
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
	if (front ==-1 && rear== -1)
		cout << "\n QUEUE IS EMPTY";
	else
	{
		if(front<rear)
		{
			for(i=front;i<=rear;i++)
				cout << "\t " << queue[i];
		}
		else
		{
			for(i=front;i<MAX;i++)
				cout << "\t " << queue[i];
			for(i=0;i<=rear;i++)
				cout << "\t " << queue[i];
		}
	}
}

int main()
{
	int option, val, num;
	Queue q;
	system("cls"); 		// belongs to stdlib.h
	do
	{
		cout << "\n ***** MAIN MENU *****";
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
					cout << "\n Enter the number to be inserted in the queue : ";
					cin >> num;
					q.insert(num);
					break;
			case 2:
					val = q.delete_element();
					if(val!=-1)
						cout << "\n The number deleted is : " << val;
					break;
			case 3:
					val = q.peek();
					if(val!=-1)
						cout << "\n The first value in queue is : " << val;
					break;
			case 4:
					q.display();
					break;
		}
	}while(option!=5);

	return 0;
}
/*
Output
***** MAIN MENU *****
1. Insert (enqueue) an element
2. Delete (dequeue) an element
3. Peek
4. Display the queue
5. EXIT
Enter your option : 1
Enter the number to be inserted in the queue : 25
Enter your option : 2
The number deleted is : 25
Enter your option : 3
QUEUE IS EMPTY
Enter your option : 5
*/

