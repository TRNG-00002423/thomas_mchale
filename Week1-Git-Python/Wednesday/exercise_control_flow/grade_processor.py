import math

if __name__ == "__main__":
    user_input = (input("Enter list of grades: ")).split()
    student_scores = []
    num_students = 0
    student_string = "Student scores:"
    total_score = 0
    class_average = 0
    high = -1
    low = math.inf


    for i in range(len(user_input)):
        current_letter = "A"
        if int(user_input[i]) == -999:
            break
        if int(user_input[i]) < 0:
            continue
        
        if (int(user_input[i]) > high):
            high = int(user_input[i])
        if (int(user_input[i]) < low):
            low = int(user_input[i])

        if (int(user_input[i]) < 90):
            current_letter = "B"
        if (int(user_input[i]) < 80):
            current_letter = "C"
        if (int(user_input[i]) < 70):
            current_letter = "D"
        if (int(user_input[i]) < 60):
            current_letter = "F"
        
        num_students+=1
        student_scores.append(current_letter)
        student_string += " " + current_letter
        total_score += int(user_input[i])
    
    class_average = total_score/num_students
    num_A = 0
    num_B = 0
    num_C = 0
    num_D = 0
    num_F = 0

    for i in range(num_students):
        if student_scores[i] == "A":
            num_A +=1
        if student_scores[i] == "B":
            num_B +=1
        if student_scores[i] == "C":
            num_C +=1
        if student_scores[i] == "D":
            num_D +=1
        if student_scores[i] == "F":
            num_F +=1

    print(student_string)
    print(f"Class average: {class_average}")
    print(f"Class high: {high}")
    print(f"class low: {low}")
    print(f"Number of A's: {num_A}")
    print(f"Number of B's: {num_B}")
    print(f"Number of C's: {num_C}")
    print(f"Number of D's: {num_D}")
    print(f"Number of F's: {num_F}")