test_list = [
    ["test_login", "1200", "PASS"],
    ["test_search", "850", "PASS"],
    ["test_checkout", "2300", "FAIL"],
    ["test_profile", "450", "PASS"],
    ["test_logout", "180", "PASS"]
]

total_duration = 0
total_test = 0
test_pass = 0
for lst in test_list:
    total_duration += int(lst[1])
    total_test += 1
    if lst[2] == "PASS":
        test_pass += 1

print("┌──────────────────┬────────────┬──────────┐")
print(f"| {test_list[0][0]:<16} | {test_list[0][1]:>10} |{test_list[0][2]:>10}|")
print(f"| {test_list[1][0]:<16} | {test_list[1][1]:>10} |{test_list[1][2]:>10}|")
print(f"| {test_list[2][0]:<16} | {test_list[2][1]:>10} |{test_list[2][2]:>10}|")
print(f"| {test_list[3][0]:<16} | {test_list[3][1]:>10} |{test_list[3][2]:>10}|")
print(f"| {test_list[4][0]:<16} | {test_list[4][1]:>10} |{test_list[4][2]:>10}|")
print("├──────────────────┼────────────┼──────────┤")
print(f"| {"TOTAL":<16} | {total_duration:>10,} | {test_pass}/{total_test} Pass |")
print("└──────────────────┴────────────┴──────────┘")