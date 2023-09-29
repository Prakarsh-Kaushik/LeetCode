# Write your MySQL query statement below
SELECT product_name, year, price FROM Sales
LEFT OUTER JOIN product ON sales.product_id = product.product_id
ORDER BY product_name;