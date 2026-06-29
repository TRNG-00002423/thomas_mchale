SELECT oh.order_id, oh.placed_at, c.email, SUM(ol.qty * ol.unit_price)
FROM order_header oh
INNER JOIN customer c ON oh.customer_id = c.customer_id
INNER JOIN order_line ol ON oh.order_id = ol.order_id
WHERE order_header.status = 'PAID'
GROUP BY oh.order_id, oh.placed_at, c.email;

SELECT DISTINCT ON (c.customer_id)
c.customer_id, c.full_name, oh.order_id
FROM customer c
LEFT JOIN order_header oh ON c.customer_id = oh.customer_id
ORDER BY c.customer_id, oh.placed_at DESC;

SELECT DISTINCT ON (c.customer_id)
c.customer_id, c.full_name, oh.order_id
FROM order_header oh
RIGHT JOIN customer c ON c.customer_id = oh.customer_id
ORDER BY c.customer_id, oh.placed_at DESC;

SELECT c.email, c.full_name, oh.order_id, oh.status
FROM customer c
FULL OUTER JOIN order_header oh ON c.customer_id = oh.customer_id;

SELECT 
    p.name AS product_name, 
    p.stock_qty, 
    s.status_threshold
FROM product p
CROSS JOIN (
    VALUES ('STOCK_OK'), ('STOCK_LOW')
) AS s(status_threshold);

SELECT 
    c.customer_id,
    c.full_name,
    COUNT(DISTINCT oh.order_id) AS order_count,
    SUM(ol.qty * ol.unit_price) AS total_spend
FROM customer c
INNER JOIN order_header oh ON c.customer_id = oh.customer_id
INNER JOIN order_line ol ON oh.order_id = ol.order_id
GROUP BY c.customer_id, c.full_name
HAVING SUM(ol.qty * ol.unit_price) > 25.00;

