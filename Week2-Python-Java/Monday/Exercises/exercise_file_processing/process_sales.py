
"""
Week 2 Exercise — CSV processing with context managers.

TODO:
1. Read starter_code/data/sales.csv using csv.DictReader and with open(...).
2. Compute rows count, grand total (sum of units * unit_price), average line revenue.
3. Find SKU with max line revenue (tie: first in file).
4. Write output/summary.txt using with open(..., "w", encoding="utf-8").
"""

from __future__ import annotations
import csv

def main() -> None:
    total_rows = 0
    grand_total = []
    top_sku = ""
    top_line_revenue = 0
    

    with open("data/sales.csv",mode="r", encoding="utf-8") as sales_file:
        reader = csv.DictReader(sales_file)

    
        for row in reader:
            try:
                sku = row["sku"]
                units = int(row["units"])
                unit_price = float(row["unit_price"])
                grand_total.append(units * unit_price)
                total_rows += 1
                if (units * unit_price > top_line_revenue):
                    top_line_revenue = units * unit_price
                    top_sku = sku
            except Exception as e:
                print(f"Skiped because - {e}")

    with open("output/summary.txt", mode="w", encoding="utf-8") as output_file:
        output_file.write(f"rows={total_rows}\ngrand_total={grand_total}\naverage_line_revenue={sum(grand_total)/total_rows}\ntop_sku={top_sku}\ntop_line_revenue={top_line_revenue}")


if __name__ == "__main__":
    main() 