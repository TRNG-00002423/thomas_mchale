# Higher order funciton is a fucntion that can be assigened to a variable
# That way it can be passes as an arguement to anther funciton

def  greet(name):
    return f"Hellow {name}!"

# Assign it to a variable
say_hello = greet
print(say_hello("Example"))

# Pass function as an arguement
def apply(func, value):
    return func(value)

print(apply(greet, "Andrew"))
