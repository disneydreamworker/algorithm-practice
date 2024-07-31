SELECT A.ID, B.FISH_NAME, A.LENGTH
FROM FISH_INFO A
INNER JOIN FISH_NAME_INFO B
ON A.FISH_TYPE = B.FISH_TYPE
WHERE (A.FISH_TYPE,A.LENGTH) IN(
SELECT FISH_TYPE, MAX(LENGTH)
FROM FISH_INFO
GROUP BY FISH_TYPE)

# select
#     I.ID,
#     CASE 
#         WHEN I.FISH_TYPE = 0 THEN 'BASS'
#         WHEN I.FISH_TYPE = 1 THEN 'SNAPPER'
#         ELSE 'ANCHOVY'
#     END FISH_NAME,
#     I.length
# from 
#     (select id, FISH_TYPE, length, row_number() over(partition by fish_type order by length desc) L from FISH_INFO) I
# where L = 1
# order by I.ID;