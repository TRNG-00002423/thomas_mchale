import pickle

numbers = [1,2,3,4,5]
with open("num_pick.dat","wb") as file:
    pickle.dump(numbers, file)
    # no need to close it

with open("num_pick.dat", "rb") as file:
    data = pickle.load(file)
    print(data)
    # no need to close as we are using the Context Manager 'with'
 