# Lambda func that takes one argument which will be multiplied with an unknown number
import random

multiRand = lambda x: x * random.randint(0, 1000)
print(multiRand(5))