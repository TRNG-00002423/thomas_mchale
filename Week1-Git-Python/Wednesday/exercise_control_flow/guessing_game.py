import random;

if __name__ == "__main__":
    answer = random.randint(1, 100)
    correctly_Guessed = False

    for i in range(7):
        if (correctly_Guessed == False):
            user_input = int(input("Enter a number to guess: "))
            if user_input == answer:
                print("congratulations!")
                correctly_Guessed = True
            else:
                if user_input > answer:
                    print("Too high")
                else:
                    print("Too low")
    if (correctly_Guessed == False):
        print("Ran out of guesses")