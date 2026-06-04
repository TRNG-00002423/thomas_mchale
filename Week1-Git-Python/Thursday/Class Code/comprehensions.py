# Comprehensions are the pythonic way to transform and filter data

# example : calculate squares of numbers from 0 to 9
'''
for i in range(10):
    print(i**2)
'''
# instead of the for loop we can use this structure to make it more concise
squares=[x**2 for x in range(10)]

even_sq=[x**2 for x in range(10) if x%2 == 0]

names=["Alice", "Bob", "Charlie"]
# {'Alice':5,'Bob':3,'Charie':7}

name_len = {name:len(name) for name in names} 
# so the structure is the operation that you want to do
# then the loop