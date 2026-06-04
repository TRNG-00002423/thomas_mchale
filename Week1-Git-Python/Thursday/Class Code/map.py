# Map : map() applies a function to every element of a iterable

numbers=[1,2,3,4,5]
double=list(map(lambda x:x*2, numbers))

print(double)

names=["Oscar", "Audy", "Curtis", "Anuha"]
# Capitalize each name

capital_names=list(map(lambda x:x.upper(), names))
print(names)