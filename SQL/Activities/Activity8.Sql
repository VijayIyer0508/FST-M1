select * from orders

select customer_id , max(purchase_amount) as purchase_amount from orders
group by customer_id

select salesman_id , max(purchase_amount) as purchase_amount from orders
where order_date =to_date ('2012-08-17','YYYY-MM-DD')
group by salesman_id,order_date;

SELECT customer_id, order_date, MAX(purchase_amount) as purchase_amount FROM orders
GROUP BY customer_id, order_date
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);