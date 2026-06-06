# decorator : functions that modify or extend the behavior of another function without
# changing the original code

# examples include static and class methods

def my_decorator(func):
    def wrapper():
        print("Before the Function")
        func()
        print("After the Function")
    return wrapper

@my_decorator
def greet():
    print("Greet!")

@my_decorator
def hello():
    print("Hello")


greet()

hello()
