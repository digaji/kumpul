class Person:
    def __init__(self, name, address):
        self.__name = name
        self.__address = address

    def getName(self):
        return self.__name

    def getAddress(self):
        return self.__address

    def setAddress(self, address):
        self.__address = address

    def toString(self):
        return f"{self.__name}({self.__address})"


class Student(Person):
    def __init__(self, name, address, numCourses=0, courses=[], grades=[]):
        super().__init__(name, address)
        self.__numCourses = numCourses
        self.__courses = courses
        self.__grades = grades

    def toString(self):
        return f"Student: {self.__name}({self.__address})"

    def addCourseGrade(self, course, grade):
        if course not in self.__courses:
            self.__courses.append(course)
            self.__numCourses += 1
        self.__grades.append(grade)

    def printGrades(self):
        print(self.__grades)

    def getAverageGrade(self):
        return sum(self.__grades) / len(self.__grades)


class Teacher(Person):
    def __init__(self, name, address, numCourses=0, courses=[]):
        super().__init__(name, address)
        self.__numCourses = numCourses
        self.__courses = courses

    def toString(self):
        return f"Teacher: {self.__name}({self.__address})"

    def addCourse(self, course):
        if course in self.__courses:
            return False
        else:
            self.__courses.append(course)
            self.__numCourses += 1

    def removeCourse(self, course):
        if course not in self.__courses:
            return False
        else:
            self.__courses.remove(course)
            self.__numCourses -= 1


# * If using dictionary for the Student class
# class Student(Person):
#     def __init__(self, name, address, numCourses=0, courses={}):
#         super().__init__(name, address)
#         self.__numCourses = numCourses
#         self.__courses = courses

#     def toString(self):
#         return f"Student: {self.__name}({self.__address})"

#     def addCourseGrade(self, course, grade):
#         if course not in self.__courses:
#             self.__courses[course] = [grade]
#         else:
#             self.__courses[course].append(grade)

#     def printGrades(self):
#         print(*self.__courses.values())

#     def getAverageGrade(self):
#         grades = []
#         for i in self.__courses.values():
#             for grade in i:
#                 grades.append(grade)
#         return sum(grades) / len(grades)