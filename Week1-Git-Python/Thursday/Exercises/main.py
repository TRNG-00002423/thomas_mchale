"""
Main Program — Product Inventory System
Week 1, Thursday | Pair Programming Exercise

Wire everything together here. Complete each numbered section.
Run with:  python main.py

References:
    written/4-Thursday/lists.md
    written/4-Thursday/tuples.md
    written/4-Thursday/sets.md
    written/4-Thursday/exception-handling-custom-exceptions.md
    written/4-Thursday/try-except.md
"""

from product import Product
from inventory import Inventory
from exceptions import ProductNotFoundError, InsufficientStockError


def section(title: str) -> None:
    print(f"\n{'─' * 55}")
    print(f"  {title}")
    print(f"{'─' * 55}")


def main():
    inv = Inventory()

    # ── 1. Add at least 8 products across 3+ categories ───────────────────
    section("1. Loading Inventory")

    # TODO: Create and add at least 8 Product instances.
    # Use at least 3 different categories (e.g., "electronics", "accessories", "software").
    # Example:
    #   p = Product("Laptop", 999.99, stock=15, category="electronics")
    #   product_id = inv.add_product(p)
    #   print(f"  Added: {p} → ID={product_id}")

    p1 = Product("Book", 10.0, 3, "entertainment")
    p2 = Product("HeadPhones", 20.0, 7, "electronics")
    p3 = Product("Desk", 75.0, 0, "furniture")
    p4 = Product("Comic Book", 5.0, 12, "entertainment")
    p5 = Product("Keyboard", 45.0, 10, "electronics")
    p6 = Product("Mouse", 25.0, 15, "electronics")
    p7 = Product("Chair", 120.0, 4, "furniture")
    p8 = Product("ProTest", 2.0, 0, "paper")

    id1 = inv.add_product(p1)
    id2 = inv.add_product(p2)
    id3 = inv.add_product(p3)
    id4 = inv.add_product(p4)
    id5 = inv.add_product(p5)
    id6 = inv.add_product(p6)
    id7 = inv.add_product(p7)
    id8 = inv.add_product(p8)

    print("Nothing to print here")

    # ── 2. Display all products sorted by price ────────────────────────────
    section("2. All Products (sorted by price)")

    # TODO: Use sorted() with the __lt__ dunder to sort inv.products.values().
    print(sorted(inv.products.values()))

    # ── 3. Search products by keyword ─────────────────────────────────────
    section("3. Search: 'pro'")

    # TODO: Call inv.search("pro") and print the results.
    # This uses the __contains__ dunder on Product.
    print(inv.search('pro'))

    # ── 4. Filter by category ─────────────────────────────────────────────
    section("4. Category: 'electronics'")

    # TODO: Call inv.by_category("electronics") and print the results.
    electronics_items = inv.by_category("electronics")
    for item in electronics_items:
        print(f"  Electronics: {item.name} (${item.price})")

    # ── 5. Sell products — one should succeed, one should fail ────────────
    section("5. Sell Operations")

    # TODO: Attempt to sell a quantity that succeeds, then one that exceeds stock.
    # Use try/except to catch InsufficientStockError and print the error details.
    # Access e.requested and e.available from the exception object.
    inv.sell(id1, 1)
    try:
        inv.sell(id1, 100)
    except InsufficientStockError as e:
        print(f"Not enough in stock for that request - {e}")

    section("6. Non-Existent Product Lookup")
    # ── 6. Access a non-existent product ID ───────────────────────────────

    # TODO: Try inv.get_product(9999) and catch ProductNotFoundError.
    try:
        inv.get_product(9999)
    except ProductNotFoundError:
        print("Product did not exist")

    # ── 7. Transaction history ────────────────────────────────────────────
    section("7. Recent Transaction History")

    # TODO: Print each entry in inv.history.
    # Remember: history is a deque — you can iterate over it directly.
    for entry in inv.history:
        print(entry)

    # ── 8. Inventory summary ──────────────────────────────────────────────
    section("8. Inventory Summary")

    # TODO: Call inv.summary() and print each key-value pair neatly.
    inv_summary = inv.summary()
    for key, value in inv_summary.items():
        print(f"  {key.replace('_', ' ').title()}: {value}")


    # ── 9. Set operations on categories ───────────────────────────────────
    section("9. Set Operations on Categories")

    my_wishlist = {"electronics", "gaming", "software"}

    # TODO: Use inv.categories (a set) and my_wishlist to show:
    #   - Union:        All categories across both sets
    #   - Intersection: Categories in BOTH my_wishlist and the inventory
    #   - Difference:   Categories in my_wishlist but NOT in the inventory
    # Use the |, &, - operators (ref: written/4-Thursday/sets.md)
    print(f"Union: {inv.categories | my_wishlist}")
    print(f"Intersection: {inv.categories & my_wishlist}")
    print(f"Difference: {my_wishlist - inv.categories}")

    # ── 10. Tuple-based product configurations ────────────────────────────
    section("10. Product Configs as Tuples")
    

    # TODO: Define at least 3 product configurations as tuples:
    #   configs = [
    #       ("Monitor", 349.99, 8, "electronics"),
    #       ("USB Hub",  24.99, 30, "accessories"),
    #       ...
    #   ]
    # Iterate over configs and add each as a Product to the inventory.
    # Print the updated total using len(inv).
    # This demonstrates tuples as immutable, structured data records.
    # (ref: written/4-Thursday/tuples.md — "Tuples as Fixed Records")
    
    configs = [("Water", 3.0, 10, "consumable"),
               ("Asprin", 10.0, 9, "consumable"),
               ("Wallet", 12.0, 5, "accessories")
               ]

    for product in configs:
        inv.add_product(Product(*product))

    print(len(inv))

if __name__ == "__main__":
    main()