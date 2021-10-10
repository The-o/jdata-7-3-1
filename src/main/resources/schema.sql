CREATE TABLE IF NOT EXISTS CUSTOMERS (
    id SERIAL PRIMARY KEY,
    name TEXT,
    surname TEXT,
    age INT,
    phone_number CHAR(10)
);

CREATE TABLE IF NOT EXISTS ORDERS (
    id SERIAL PRIMARY KEY,
    date TIMESTAMP,
    customer_id INT,
    product_name TEXT,
    amount INT,

    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS(id)
);