a = [1,2,3]
b = [4,5,6]
c=[]
for i in range(3):
    c.append(a[i] + b[i])
print(c)

import numpy as np

a=np.array([1,2,3])
b=np.array(4,5,6)
print(a+b)

arr=np.array([1,2,3],[4,5,6])

print(arr)

arr1=np.array([1,2,3,4])
print(arr1*2)