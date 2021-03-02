#include <iostream>
using namespace std;

class Box{
	// function members (methods)
	public:
		int getLength();

		int getWidth();

		int getHeight();

		void setLength(int l);

		void setWidth(int w);

		void setHeight(int h);

		int calculateArea();

		int calculateVolume();

		Box(); // default constructor
		Box(int l, int w, int h) { // constructor
            length = l;
            width = w;
            height = h;
        }
	// data members
	protected:
		int length;
		int width;
		int height;

};

Box::Box() {
    length = 0;
    width = 0;
    height = 0;
}

int Box::getLength() {
    return length;
}

int Box::getWidth() {
    return width;
}

int Box::getHeight() {
    return height;
}

void Box::setLength(int l) {
    length = l;
}

void Box::setWidth(int w) {
    width = w;
}

void Box::setHeight(int h) {
    height = h;
}

int Box::calculateArea() {
    return (2 * height * width) + (2 * length * height) + (2 * width * length);
}

int Box::calculateVolume() {
    return height * width * length;
}

// your code here
int main() {
    Box myBox(5, 10, 10);

    // Box getter
    cout << "myBox's length is currently: " << myBox.getLength() << endl;

    cout << "myBox's width is currently: " << myBox.getWidth() << endl;

    cout << "myBox's height is currently: " << myBox.getHeight() << endl;

    // Box setter
    cout << "\nSetting new values for myBox's data...\n" << endl;

    myBox.setLength(10);
    cout << "myBox's length is now: " << myBox.getLength() << endl;

    myBox.setWidth(20);
    cout << "myBox's width is now: " << myBox.getWidth() << endl;

    myBox.setHeight(5);
    cout << "myBox's height is now: " << myBox.getHeight() << endl;

    // Box calculate methods
    cout << "myBox's area is: " << myBox.calculateArea() << endl;

    cout << "myBox's volume is: " << myBox.calculateVolume() << endl;
}