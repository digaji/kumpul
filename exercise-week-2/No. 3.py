class1, class2, class3 = 32, 45, 51

def grouped(students1, students2, students3):
    each_group1 = students1 // 5
    each_group2 = students2 // 7
    each_group3 = students3 // 6
    each_group = [each_group1, each_group2, each_group3]
    leftover1 = students1 % 5
    leftover2 = students2 % 7
    leftover3 = students3 % 6
    leftover = [leftover1, leftover2, leftover3]
    i = 1
    print("Number of students in each group: ")
    for e in each_group:
        print("Class " + str(i) + ": " + str(e))
        i += 1
    print("")
    i = 1
    print("Number of students leftover: ")
    for e in leftover:
        print("Class " + str(i) + ": " + str(e))
        i += 1

grouped(class1, class2, class3)