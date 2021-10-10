SELECT product_name FROM
    CUSTOMERS JOIN ORDERS
        ON CUSTOMERS.id = ORDERS.customer_id
    WHERE LOWER(name) = LOWER(:name);