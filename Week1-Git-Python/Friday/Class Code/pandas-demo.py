# series and dataFrame
# series is a one dimintional labeled array
# dataFrame is a two dimintional tabluar structure

import pandas as pd

s = pd.Series([10,20,30,40])
print(s)

data={
    "Name":["Ken", "John","Audy"],
    "Age":[29,28,29],
    "Marks":[86,87,85]
}

df=pd.DataFrame(data)
print(df)
print(df.info())

print(df[["Name", "Marks"]])

df["Passed"]=df["Marks"]>50
print(df)