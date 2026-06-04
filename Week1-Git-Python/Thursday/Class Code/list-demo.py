# List : ordered and mutable collection of items

# Empty List
test = []

# Listh with some values
tests = ["login", "search", "checkout"]
mixed_list = [1, True, "String"]

# Acessing elements of a list
print(tests[0])
print(tests[1])

# Modidfy a list
test[1] = "advanced_search"
tests.append("logout")
tests.insert(0, "open_page")
tests.remove("login") # only removes the element
tests.pop(0) # will remove an element and also return it

len(tests) # returns the length of the list

"some value" in  tests # checks if the list contains a specific value, returns True or False

test.index("checkout") # returns the index of the value

tests.count("login") # counts the number of times an element apears in a list

tests.sort(reverse=True) # sorts the list in reverse order

tests.reverse() # reverses a list, but doesn't sort it first

numbers = [1, 2, 3, 4, 5]
print(numbers[1:3]) # slicing a list, takes first index but not including the last

numbers[:4]
numbers[3:]