select MEMBER_ID,MEMBER_NAME, GENDER, date_format(DATE_OF_BIRTH, '%Y-%m-%d') as DATE_OF_BIRTH
from member_profile
where gender = 'W' and month(DATE_OF_BIRTH) = 3 and TLNO is not null
order by member_id; 

# SELECT MEMBER_ID, MEMBER_NAME, GENDER,
# DATE_FORMAT( DATE_OF_BIRTH, "%Y-%m-%d") as DATE_OF_BIRTH
# from MEMBER_PROFILE
# Where TLNO is not null
# order by MEMBER_ID