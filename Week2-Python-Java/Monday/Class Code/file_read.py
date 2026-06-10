file = open("data.txt", "r")

# Read one line
# line = file.readline()
# print(line)

# Read all lines into a list
lines = file.readlines()
print(lines)

# Read Entire File
# content = file.read()
# print(content)
# print("*"*20)

file.close()