import pandas as pd
df = pd.read_csv("test_data.csv")

print("Test Results Analysis")
print("_" * 20)
print("Basic Info")
print(f"Total Tests: {len(df)}")
print(f"Columns: {df.columns}")
print(f"Column types: {df.dtypes}")
print(f"First 5 rows:")
print(df.head(10))
print("_" * 20)

print("Aggregate metrics")
print(f"Pass rate: {(len(df[df["status"] == "pass"]) / len(df)) * 100}")
print(f"Average duration: {df["duration_ms"].mean()}ms or {df["duration_ms"].mean() * .001}s")

print(f"Slowest test: {df.sort_values('duration_ms', ascending=False).iloc[0]['test_name']} ({df.sort_values('duration_ms', ascending=False).iloc[0]['duration_ms']} ms)")
print(f"Fastest test: {df.sort_values('duration_ms', ascending=True).iloc[0]['test_name']} ({df.sort_values('duration_ms', ascending=True).iloc[0]['duration_ms']} ms)")
print("_" * 20)

print("Group by")
print(f"{df.groupby("module").agg(
    tests = ("test_name", "count"),
    avg = ("duration_ms", "mean"),
    pass_rate=('status', lambda x: (x == 'pass').mean() * 100)
)}")

print("_" * 20)
print("Failed tests")
print(f"{df[df["status"] == "fail"]}")

print("_" * 20)
print("Tests slower than 1500ms")
print(f"{df[df["duration_ms"] > 1500]}")

print("_" * 20)
print("Tests in auth")
print(f"{df[df["module"] == "auth"]}")

print("_" * 20)
df["duration_sec"] = df["duration_ms"] / 1000
print("Sorted by duration")
sorted_val = df.sort_values("duration_ms", ascending=False)
print(sorted_val)

sorted_val.to_csv("results_sorted.csv", index=False)




