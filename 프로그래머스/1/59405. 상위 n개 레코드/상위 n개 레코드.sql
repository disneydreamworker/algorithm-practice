select name 
from animal_ins
where datetime = (
    select min(datetime)
    from animal_ins );

# -- 코드를 입력하세요
# SELECT NAME FROM ANIMAL_INS WHERE DATETIME = (SELECT min (DATETIME) FROM ANIMAL_INS)