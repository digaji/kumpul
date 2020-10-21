c = [32, 45, 51]
i = 0
e = 1
each_group = 0
leftover = 0
eg = []
lo = []

while i < len(c):
    for element in c:
        each_group = element
        leftover = element
        if i == 0:
            each_group //= 5
            leftover %= 5
            eg.append(each_group); lo.append(leftover)
            each_group = 0; leftover = 0
        if i == 1:
            each_group //= 7
            leftover %= 7
            eg.append(each_group); lo.append(leftover)
            each_group = 0; leftover = 0
        if i == 2:
            each_group //= 6
            leftover %= 6
            eg.append(each_group); lo.append(leftover)
            each_group = 0; leftover = 0
        i += 1
print("Number of students in each group:")
for element in eg:
    print("Class " + str(e) + ": " + str(element))
    e += 1
print("")
e = 1
print("Number of students leftover:")
for element in lo:
    print("Class " + str(e) + ": " + str(element))
    e += 1