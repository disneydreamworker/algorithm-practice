

select USER_ID, product_id
from online_sale
group by user_id, product_id
having count(user_id) > 1 
ORDER BY USER_ID ASC, PRODUCT_ID DESC;