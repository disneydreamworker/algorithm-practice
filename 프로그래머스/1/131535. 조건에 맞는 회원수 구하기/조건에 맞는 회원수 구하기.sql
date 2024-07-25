select count(user_id)
from user_info
where (year(joined) = '2021') and (age between 20 and 29);

# -- 코드를 입력하세요
# SELECT COUNT(AGE) FROM USER_INFO WHERE JOINED LIKE '2021%' and AGE >= 20 and AGE <= 29;