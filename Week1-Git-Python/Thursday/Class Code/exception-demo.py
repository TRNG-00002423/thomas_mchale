'''
result=10/0 # will give an error
print(result)
'''

# in java : try catch finally throw throws
# but in python : try except else finally

# try is where problomatic code is put

# except is what executes if a error occurs

# else is what executes if there was no errors

# finally is always called at the end regardless of if there was an error thrown

try:
    # code that might raise an excedption
    result = int(input("Enter a nubmer: "))
except ValueError:
    # runs if number is not given
    print("That is not a number")
except (TypeError, KeyError) as e:
    print({e})
else:
    print("That is a number")
finally:
    print("clean up code")

# one try block can have multible exceptions