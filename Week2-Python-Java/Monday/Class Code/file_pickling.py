import pickle
file = open("num_pickles.dat","wb")

numbers = [10,20,30,40,50]
numbers1 = [x for x in range(10)]

pickle.dump(numbers, file)

file = open("num_pickles.dat","rb")
data=pickle.load(file)
print(data)
file.close()