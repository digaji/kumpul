# # Lambda func to create Fibonacci series up to n
def fiblist(x):
    start = [0, 1]
    any(map(lambda y: start.append(sum(start[-2: ])), range(2, x)))
    return start

print(fiblist(15))