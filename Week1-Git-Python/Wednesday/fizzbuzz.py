def fizzbuzz(n):
    finalString = ""
    if (n%3 == 0):
        finalString+= "Fizz"
    if (n%5 == 0):
        finalString+= "Buzz"
    if (n%7 == 0):
        finalString+= "Boom"

    if finalString == "":
        print(n)
    else:
        print(finalString)

if __name__ == "__main__":
    user_input = int(input("Enter a number to test: "))
    fizzbuzz(user_input)