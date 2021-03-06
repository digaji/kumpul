class Circle:
    def __init__(self, radius=1.0, color="red"):
        self.__radius = float(radius)
        self.__color = color

    def getRadius(self):
        return self.__radius

    def setRadius(self, radius):
        self.__radius = radius

    def getColor(self):
        return self.__color

    def setColor(self, color):
        self.__color = color

    def toString(self):
        return f"Radius: {self.__radius}\nColor: {self.__color}"

    def getArea(self):
        from math import pi

        return pi * (self.__radius ** 2)


class Cylinder(Circle):
    def __init__(self, radius=1.0, color="red", height=1.0):
        super().__init__(radius, color)
        self.__height = float(height)

    def getHeight(self):
        return self.__height

    def setHeight(self, height):
        self.__height = height

    def toString(self):
        return f"Radius: {self.__radius}\nColor: {self.__color}\nHeight: {self.__height}"

    def getVolume(self):
        return self.getArea() * self.__height
