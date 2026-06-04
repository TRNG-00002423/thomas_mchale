# iterator itorators over something
# iterable is able to be iterated like a list

numbers = [1,2,3,4]

for number in numbers:
    print(number)

my_iter=iter(numbers)

print()

print(next(numbers))
print(next(numbers)) #wraps the list and tracks the current position