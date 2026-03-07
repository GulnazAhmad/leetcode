# Write your MySQL query statement below
#select customer_number,count(order_number) from orders 
#where customer_number=() 
#select max(customer_number) from orders
with cte1 as (
select customer_number,count(order_number)as cnt from orders group by customer_number
)
select customer_number from cte1 where cnt=(select max(cnt) from cte1)