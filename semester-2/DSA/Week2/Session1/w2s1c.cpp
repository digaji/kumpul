#include <iostream>
using namespace std;

// base class or super class
class Shape {
	public:
		int getWidth() {
			return width;
		}

		int getHeight() {
			return height;

		}
		void setWidth(int w) {
			width = w;
		}

		void setHeight(int h) {
			height = h;
		}

		int getArea() {
			return width * height;
		}

        Shape(int w, int h) {
            width = w;
            height = h;
        }

	private:
		int width;
		int height;

};


// Derived class or sub class
class Triangle: public Shape {
	public:
		int getArea() {
			return 0.5 * getWidth() * getHeight();
		}

        Triangle(int w, int h): Shape(w, h) {
        }
};

// your code here
class Rectangle: public Shape {
    public:
        int getArea() {
            return getWidth() * length;
        }

        int getLength() {
            return length;
        }

        void setLength(int l) {
            length = l;
        }

        Rectangle(int w, int h, int l): Shape(w, h) {
            length = l;
        }

    private:
        int length;
};

int main() {
    int triangleWidth, triangleHeight, rectangleWidth, rectangleLength;

    // Triangle initialization
    cout << "What will be the triangle's width?: ";
    cin >> triangleWidth;
    cout << "What will be the triangle's height?: ";
    cin >> triangleHeight;
    Triangle myTriangle(triangleWidth, triangleHeight);

    // Rectangle initialization
    cout << "What will be the rectangle's width?: ";
    cin >> rectangleWidth;
    cout << "What will be the rectangle's length?: ";
    cin >> rectangleLength;
    Rectangle myRectangle(rectangleWidth, 0, rectangleLength);

    // Class getter
    cout << "myTriangle's width is: " << myTriangle.getWidth() << endl;
    cout << "myTriangle's height is: " << myTriangle.getHeight() << "\n\n";

    cout << "myRectangle's width is: " << myRectangle.getWidth() << endl;
    cout << "myRectangle's length is: " << myRectangle.getLength() << "\n\n";

    // Class setter
    cout << "What will be the triangle's new width?: ";
    cin >> triangleWidth;
    cout << "What will be the triangle's new height?: ";
    cin >> triangleHeight;
    myTriangle.setWidth(triangleWidth);
    myTriangle.setHeight(triangleHeight);

    cout << "What will be the rectangle's new width?: ";
    cin >> rectangleWidth;
    cout << "What will be the rectangle's new length?: ";
    cin >> rectangleLength;
    myRectangle.setWidth(rectangleWidth);
    myRectangle.setLength(rectangleLength);

    // Class getter
    cout << "myTriangle's width is now: " << myTriangle.getWidth() << endl;
    cout << "myTriangle's height is now: " << myTriangle.getHeight() << "\n\n";

    cout << "myRectangle's width is now: " << myRectangle.getWidth() << endl;
    cout << "myRectangle's length is now: " << myRectangle.getLength() << "\n\n";

    // Class area method
    cout << "myTriangle's area is: " << myTriangle.getArea() << endl;
    cout << "myRectangle's area is: " << myRectangle.getArea() << endl;
}
