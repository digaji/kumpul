class Person:
    def __init__(self, name, address):
        self.name = name
        self.address = address

    def getName(self):
        return self.name

    def getAddress(self):
        return self.address

    def setAddress(self, address):
        self.address = address

    def toString(self):
        return f"{self.name}({self.address})"


class Student(Person):
    def __init__(self, name, address, numCourses=0, courses=[], grades=[]):
        super().__init__(name, address)
        self.numCourses = numCourses
        self.courses = courses
        self.grades = grades

    def toString(self):
        return f"Student: {self.name}({self.address})"

    def addCourseGrade(self, course, grade):
        if course not in self.courses:
            self.courses.append(course)
            self.numCourses += 1
        self.grades.append(grade)

    def printGrades(self):
        print(self.grades)

    def getAverageGrade(self):
        return sum(self.grades) / len(self.grades)


class Teacher(Person):
    def __init__(self, name, address, numCourses=0, courses=[]):
        super().__init__(name, address)
        self.numCourses = numCourses
        self.courses = courses

    def toString(self):
        return f"Teacher: {self.name}({self.address})"

    def addCourse(self, course):
        if course in self.courses:
            return False
        else:
            self.courses.append(course)
            self.numCourses += 1

    def removeCourse(self, course):
        if course not in self.courses:
            return False
        else:
            self.courses.remove(course)
            self.numCourses -= 1


# * If using dictionary for the Student class
# class Student(Person):
#     courses = {}

#     def __init__(self, name, address, numCourses=0):
#         super().__init__(name, address)
#         self.numCourses = numCourses

#     def toString(self):
#         return f"Student: {self.name}({self.address})"

#     def addCourseGrade(self, course, grade):
#         if course not in self.courses:
#             self.courses[course] = [grade]
#         else:
#             self.courses[course].append(grade)

#     def printGrades(self):
#         print(*self.courses.values())

#     def getAverageGrade(self):
#         grades = []
#         for i in self.courses.values():
#             for grade in i:
#                 grades.append(grade)
#         return sum(grades) / len(grades)