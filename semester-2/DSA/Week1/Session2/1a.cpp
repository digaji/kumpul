#include <iostream>
using namespace std;

int main() {

	int x = 99;

	cout << "The content of x is " << x << endl;
	cout << "The address of x is " << &x << endl;

	// your code here

    // 3. Create a pointer var and assign the address of the var defined in step 1 to it
    int* xptr = &x;

    // 4. Print out the value of the pointer variable and the value stored in the address it is currently pointing to
    cout << "Address stored in pointer variable is: " << xptr << endl;
    cout << "Value stored in pointer variable is: " << *xptr << endl;

    // 5. Change the value stored in the address it is currently pointing to 115
    x = 115;

    // 6. Print out the value of the pointer variable and the value stored in the address it is currently pointing to
    cout << "Address stored in pointer variable is: " << xptr << endl;
    cout << "Value stored in pointer variable is: " << *xptr << endl;

    // 7. Create another pointer variable
    int* yptr;

    // 8. Use new keyword to create a dynamic storage for the pointer variable
    yptr = new int;

    // 9. Assign 333 to this storage
    *yptr = 333;

    // 10. Print the value stored in the address that this pointer is currently pointing to
    cout << "Address stored in pointer variable is: " << yptr << endl;
    cout << "Value stored in pointer variable is: " << *yptr << endl;

    delete xptr;
    delete yptr;
}
