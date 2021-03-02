#include <iostream>
#include <string>

using namespace std;

template <typename T>
struct Node {
	T data;
	Node<int>* link;
};

class SimpleLL {
	public:
		void insert(int item);
		void print();
		bool search(int item);
		void destroy(int nodeData);
		SimpleLL();
		~SimpleLL();

	private:
		Node<int>* head;
		Node<int>* tail;
        Node<int>* ptr;
};

// Your code here
void SimpleLL::insert(int item) {
    // Create a temporary node
    Node<int>* temp = new Node<int>();
    temp->data = item;              // Enter item as data for the node
    temp->link = nullptr;           // Point node to null as default

    if (head == nullptr) {
        // If there was no head before, set temp as head and also tail
        head = temp;
        tail = temp;
    } else {
        // Set temp as the next link after tail, and then set temp as the new tail
        tail->link = temp;
        tail = tail->link;
    }
}

void SimpleLL::print() {
    ptr = head;                     // Set temp pointer equal to head
    while (ptr != nullptr) {        // Go through and print the linked list from head till nullptr is reached
        cout << ptr->data << endl;
        ptr = ptr->link;
    }
}

bool SimpleLL::search(int item) {
    ptr = head;                     // Set temp pointer equal to head
    while (ptr != nullptr) {                    // Go through and print the linked list from head till nullptr is reached
        ptr = ptr->link;

        if (head->data == item) {                // If node being searched is equal to head
            cout << "Data is in linked list!" << endl;
            return true;
            break;
        } else if (ptr->data == item) {         // If node being searched is equal to pointer
            cout << "Data is in linked list!" << endl;
            return true;
            break;
        } else if (ptr == nullptr) {            // If at the end of the list
            cout << "Data is NOT in linked list!" << endl;
        }
    }
}

void SimpleLL::destroy(int nodeData) {
    // Variable initialization for destroying process
    Node<int>* previous;                        // Node before nodeData (node being deleted)
    Node<int>* after;                           // Node after nodeData (node being deleted)
    Node<int>* current;                         // Node that's going through the linked list

    current = head;                             // Set current pointer equal to head

    while (current != nullptr) {                // Go through and print the linked list from head till nullptr is reached
        previous = current;
        current = current->link;

        if (previous->data == nodeData) {        // If the node being deleted is the head node
            after = previous->link;
            head = after;
            cout << "Node with data " << previous->data << " deleted!" << endl;
            delete(previous);
            break;
        } else if (current->data == nodeData) { // If node being searched is equal to current pointer
            if (current->link == nullptr) {     // If the node being deleted is the tail node
                previous->link = nullptr;
                tail = previous;                // Set node previous to nodeData to be the new tail
            } else {                            // If the node is in between 2 other nodes
                after = current->link;          // Set after node as the current node's next link
                previous->link = after;         // Set the previous node's link as after
            }
            cout << "Node with data " << current->data << " deleted!" << endl;
            delete(current);
            break;
        } else if (current->link == nullptr) {  // If at the end of the list
            cout << "Node with data " << nodeData << " NOT FOUND!" << endl;
            break;
        }
    }
}

SimpleLL::SimpleLL() {
    head = nullptr;
    tail = nullptr;
}

SimpleLL::~SimpleLL() {
    while (head != nullptr) {
        ptr = head->link;
        delete(head);
        head = ptr;
    }
}