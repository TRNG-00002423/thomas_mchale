# Dictionary : Stores values in Key value pairs

student = {
    "name":"Utsav",
    "age":"25",
    "grade":"A"
}

# accessing values from the dictionary
print(student["name"])
print(student.get("age"))

student["grade"] = "A+"
student["city"] = "Loucisvolle"

for key,value in student.items():
    print(key,value)

student.keys()
student.values()
student.items()
