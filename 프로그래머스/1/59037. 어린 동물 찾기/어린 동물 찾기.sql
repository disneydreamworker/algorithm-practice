select animal_id, name
from animal_ins
where intake_condition <> 'Aged'
order by animal_id;

# SELECT animal_id, name
# from animal_ins
# where intake_condition not like 'Aged'
# order by ANIMAL_ID
# ;