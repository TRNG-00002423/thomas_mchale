CREATE OR REPLACE PROCEDURE adjust_stock (p_sku TEXT, p_delta INT)
LANGUAGE plpgsql
AS $$
DECLARE
    v_inventory INT;
BEGIN 
    SELECT stock_qty
    INTO v_inventory
    FROM Product 
    WHERE sku = p_sku;

    IF (p_delta + inventory) >= 0 THEN
        UPDATE Product
        SET stock_qty = stock_qty + p_delta
        where p_sku = sku
    ELSE
        RAISE EXCEPTION 'Insufficient stock'
    END IF;
END;
$$;

CREATE OR REPLACE PROCEDURE fetch_order_total (
    p_order_id int,
    INOUT p_total_sum NUMERIC(10,2) DEFAULT 0.00
    )
LANGUAGE plpgsql
AS $$
BEGIN
    SELECT COALESCE(SUM(qty * unit_price), 0.00)
    INTO p_total_sum
    FROM order_line
    WHERE order_id = p_order_id;
END:
$$;

CALL adjust_stock ('BASE-A', 5);
CALL get_order_total(1, NULL);
