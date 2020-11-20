class Circle:
    def __init__(self, radius, color):
        self.radius = radius
        self.color = color

    def getRadius(self):
        return self.radius

    def setRadius(self, radius):
        self.radius = radius

    def getColor(self):
        return self.color

    def setColor(self, color):
        self.color = color

    def toString(self):
        return f"Radius: {self.radius}\nColor: {self.color}"

    def getArea(self):
        from math import pi

        return pi * (self.radius ** 2)


class Cylinder(Circle):
    def __init__(self, radius, color, height):
        super().__init__(radius, color)
        self.height = height

    def getHeight(self):
        return self.height

    def setHeight(self, height):
        self.height = height

    def toString(self):
        return f"Radius: {self.radius}\nColor: {self.color}\nHeight: {self.height}"

    def getVolume(self):
        from math import pi

        return pi * (self.radius ** 2) * self.height
