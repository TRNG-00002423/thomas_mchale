def validate_password(password):
    specialChar = "!@#$%^&*"
    checklist = [False] * 5

    #0 is upper
    #1 is lower
    #2 8 char
    #3 is digit
    #4 special char

    for i in range(len(password)):
        if password[i].isupper():
            checklist[0] = True
        if password[i].islower():
            checklist[1] = True
        if (i >= 7):
            checklist[2] = True
        if password[i].isdigit():
            checklist[3] = True
        for x in range(8):
            if (password[i] == specialChar[x]):
                checklist[4] = True

    issue = False
    if (checklist[0] != True):
        print("no upper")
        issue = True
    if (checklist[1] != True):
        print("no lower")
        issue = True
    if (checklist[2] != True):
        print("too short")
        issue = True
    if (checklist[3] != True):
        print("no digit")
        issue = True
    if (checklist[4] != True):
        print("no special")
        issue = True
    if (issue == False):
        print("valid")

if __name__ == "__main__":
    user_input = input("Enter a password to test: ")
    validate_password(user_input)