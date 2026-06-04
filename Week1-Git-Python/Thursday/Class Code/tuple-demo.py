# Tuple : ordered, immutable (can not be changed)

# Creating an empty tuple
empty_tuple = ()
rgb_color = (255,255,0)
coordinates = (10,20)

def result(marks):
    # based on marks calculate the percentage and return
    percentage = 85
    grade = "B"
    return (percentage, grade)

my_result = result(450)
percentage,grade = my_result # unpacks the varable into two different values

