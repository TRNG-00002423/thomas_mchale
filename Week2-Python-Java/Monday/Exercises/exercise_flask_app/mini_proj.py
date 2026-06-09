from flask import Flask, request, jsonify

app = Flask(__name__)

students = [
    {"id": 1, "name": "Alice", "course": "Computer Science"},
    {"id": 2, "name": "Bob", "course": "Data Science"}
]

next_id = 3


@app.route("/students", methods=['GET'])
def get_students():
    return jsonify(students), 200

@app.route("/students/<int:id>", methods=['GET'])
def get_student(id):
    for my_dict in students:
        if my_dict["id"] == id:
            return jsonify(my_dict), 200
    return jsonify({"error": "Student does not exist"}), 404

@app.route("/students", methods=['POST'])
def post_student():
    student = request.get_json()
    try:
        name = student['name']
        course = student['course']
    except Exception as e:
        return jsonify({"error": f"{str(e)}"}, 400)
    
    global next_id
    id = next_id
    next_id += 1

    new_student = {
        "id": next_id,
        "name": name,
        "course": course
    }
    students.append(new_student)
    return jsonify(new_student), 201

@app.route("/students/<int:id>", methods=['PUT'])
def put_student(id):
    student = request.get_json()
    try:
        name = student['name']
        course = student['course']
    except Exception as e:
        return jsonify({"error": f"{str(e)}"}), 400
    for my_dict in students:
        if my_dict["id"] == id:
            modified_student = {
                "id": id,
                "name": name,
                "course": course
            }
            my_dict["name"] = name
            my_dict["course"] = course
            return modified_student
    return jsonify({"error": "Student does not exist"}), 404

@app.route("/students/<int:id>", methods=['DELETE'])
def del_student(id):
    global students
    for my_dict in students:
        if my_dict["id"] == id:
            students = [my_dict for my_dict in students if my_dict["id"] != id]
            return jsonify({"message": f"Student deleted successfully"}), 200
    return jsonify({"error": "Student does not exist"}), 404

if __name__ == "__main__":
    app.run(debug=True)