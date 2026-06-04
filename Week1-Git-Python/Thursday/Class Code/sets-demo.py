# Sets : Mutable, unordered, unique (no duplicates)

empty_set = set()

numbers = {1,2,3,4,5}

from_list=set([10,20,20,30]) # creating a set from a list

ids = {1, 2, 3, 4}
ids.add(4)
ids.add(2)

ids.remove(1)
ids.remove(100) # error

ids.discard(2)
ids.discard(100) # no error

ids.clear() # removes all the elements

fruits = {"apple", "banana", "mango"}
veges = {"cabbage", "carrot", "lettuce"}

fruits_and_veges = fruits.union(veges) # joins the two lists

# Intersection
