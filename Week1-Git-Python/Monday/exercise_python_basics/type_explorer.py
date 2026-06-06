'''
Variable Exploration:
  age         = 28         (type: int)
  price       = 19.99      (type: float)
  name        = Alice      (type: str)
  is_active   = True       (type: bool)
  result      = None       (type: NoneType)

Operators Demo:
  17 // 5     = 3          (floor division)
  17 / 5      = 3.4        (true division)
  "QA " * 3  = QA QA QA
  True + True = 2

Precision Gotcha:
  0.1 + 0.2  = 0.30000000000000004 (not exactly 0.3!)
'''
print("Variable Exploration:")
age = 28
print(f"age   = {age}   (type:{type(age)})")

price = 19.99
print(f"price   = {price}   (type: {type(price)}")

name = "Alice"
print(f"name   = {name}   (type: {type(name)}")

is_active = True
print(f"is_active   = {is_active}   (type: {type(is_active)}")

result = None
print(f"result   = {result}   (type: {type(result)}")

print("Operators Demo:")
print(f"18 // 5 = {18//5}")
print(f"18 / 5 = {18/5}")
print(f"'ABC' * 3 = {"ABC " * 3}")
print(f"True + False = {True + False}")
print(f".1 + .2 = {.1 + .2}")