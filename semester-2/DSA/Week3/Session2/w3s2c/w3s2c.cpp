// Stacks
// A program to perform Push, Pop, and Peek operations on a stack.
#include <iostream>
#include <cstdlib>
#define MAX 10 // Altering this value changes size of stack created

using namespace std;

template <class T>
class Stack
{
private:
	T st[MAX];
	T top = -1;

public:
	void push(T val);
	T pop();
	T peek();
	void display();
};

template <class T>
void Stack<T>::push(T val)
{
	// your code
    if (top == MAX - 1) {
        cout << "OVERFLOW" << endl;
    } else {
        top += 1;
        st[top] = val;
    }

}

template <class T>
T Stack<T>::pop()
{
	// your code
    if (top == -1) {
        cout << "UNDERFLOW" << endl;
        return -1;
    } else {
        int val = st[top];
        top -= 1;
        return val;
    }
}

template <class T>
void Stack<T>::display()
{
	int i;
	if (top == -1)
		cout << "\n STACK IS EMPTY";
	else
	{
		for (i = top; i >= 0 ;i--)
			cout << "\n" << st[i];
		cout << "\n"; // Added for formatting purposes
	}
}

template <class T>
T Stack<T>::peek()
{
	if (top == -1)
	{
		cout << "\n STACK IS EMPTY";
		return top;
	}
	else
		return (st[top]);
}

int main(int argc, char *argv[]) {
	int val, option;
	Stack<int> st;
	do
	{
		cout << "\n *****MAIN MENU*****";
		cout << "\n 1. PUSH";
		cout << "\n 2. POP";
		cout << "\n 3. PEEK";
		cout << "\n 4. DISPLAY";
		cout << "\n 5. EXIT";
		cout << "\n Enter your option: ";
		cin >> option;
		switch (option)
		{
			case 1:
					cout << "\n Enter the number to be pushed on stack: ";
					cin >> val;
					st.push(val);
					break;
			case 2:
					val = st.pop();
					if (val != -1)
						cout << "\n The value deleted from stack is: " << val;
					break;
			case 3:
					val = st.peek();
					if (val != -1)
						cout << "\n The value stored at top of stack is: " << val;
					break;
			case 4:
					st.display();
					break;
		}
	} while(option != 5);
	return 0;
}

/*
Output
*****MAIN MENU*****
1. PUSH
2. POP
3. PEEK
4. DISPLAY
5. EXIT
Enter your option : 1
Enter the number to be pushed on stack : 500
*/
