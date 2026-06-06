def get_numbers():
    numbers=[]

    for i in range(1,6):
        numbers.append(i)

    return numbers   

result = get_numbers()
print(result)

# no return keyword, instead it uses yield
# uses one value of a time so it is less intensive on the memory

def get_numbers():
    for i in range(1,6):
        yield i

gen=get_numbers()
print(gen)

for num in gen:
    print(num)

# list comprehension returns you a list and are in []
sq_lst = [x*x for x in range(5)]
print(sq_lst)


# generator expression returns a generator and are in ()
gen=(i for i in range(1,6))
for n in gen:
    print(n)