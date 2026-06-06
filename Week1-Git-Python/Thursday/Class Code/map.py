

# Map : map() applies a function to every element of a iterable

numbers=[1,2,3,4,5]
double=list(map(lambda x:x*2, numbers))

print(double)

names=["Oscar", "Audy", "Curtis", "Anuha"]
# Capitalize each name

capital_names=list(map(lambda x:x.upper(), names))
print(names)

# filter() - filters based on a predicate function or condition
numbers=[1,2,3,4,5,6,7,8,9,10]

filter_even=list(filter(lambda x: x%2 == 0, numbers))
print(filter_even)

# reduce() - often used as aggegrator
from functools import reduce # needed for reduce

numbers=[1,2,3,4,5]
total = reduce(lambda a,x:a+x, numbers) 
# takes multible values and returns a single value

# zip() : takes two or more iterables and combines the elements in touples
grade=[85, 92, 84]
zip_name_grade=zip(names,grade)
list_name_grade = list(zip_name_grade)
print(list_name_grade)