CREATE TABLE customers (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(50) UNIQUE NOT NULL,
    phone_number VARCHAR(20)
);

CREATE TABLE addresses (
    address_id int PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    street_address VARCHAR(100) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id) ON DELETE CASCADE
);

CREATE TABLE product (
    sku VARCHAR(15) PRIMARY KEY,
    price DECIMAL(10,2) NOT NULL,
    stock INTEGER NOT NULL
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    address_id INT,
    status VARCHAR(20) DEFAULT 'OPEN',
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id) ON DELETE RESTRICT,
    FOREIGN KEY (address_id) REFERENCES addresses(address_id) ON DELETE RESTRICT
);

CREATE TABLE order_lines (
    order_line_id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT,
    sku VARCHAR(15),
    quantity INT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(order_id) ON DELETE CASCADE,
    FOREIGN KEY (sku) REFERENCES product(sku) ON DELETE RESTRICT
);

INSERT INTO customers  (email)
VALUES 
    ('ex@gmail.com');

INSERT INTO addresses (customer_id, street_address)
VALUES 
    (LAST_INSERT_ID(), 'ex street');

INSERT INTO customers  (email)
VALUES 
    ('jim@gmail.com');

INSERT INTO addresses (customer_id, street_address)
VALUES 
    (LAST_INSERT_ID(), 'jim street');

INSERT INTO products (sku, price, stock)
VALUES
    ('SHIRT', 10.0, 10),
    ('MUG', 3.0, 24),
    ('PEN', 1.0, 100);

INSERT INTO orders (customer_id, address_id)
VALUES
    (1,1),
    (2,2);

INSERT INTO order_lines (order_id, sku, quantity, price)
VALUES 
    (1, 'SHIRT', 1, 10.0),
    (1, 'MUG', 1, 24),
    (1, 'PEN', 1, 1.0),
    (2, 'PEN', 3, 1.0);

UPDATE products
SET price = 2.0
WHERE sku = 'PEN';
