file = open("notes.txt", "w")
file.write("Hello There\n")
file.write("Python\n")
file.close()

file = open("notes.txt", "a")
file.write("Hello There\n")
file.write("Python\n")
file.writelines("This is a new line")
file.close()

try:
    file=open("abc.txt", "r")
    content = file.read()
    print(content)
except FileNotFoundError as e:
    print(f"File does not exist {e}")
finally:
    file.close()