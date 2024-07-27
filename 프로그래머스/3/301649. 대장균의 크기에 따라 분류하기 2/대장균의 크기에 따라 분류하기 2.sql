-- ROW_NUMBER 사용
# SELECT
#     e.ID,
#     CASE 
#         WHEN (e2.NUM / (SELECT COUNT(*) FROM ECOLI_DATA)) * 100 BETWEEN 0 AND 25 THEN 'CRITICAL'
#         WHEN (e2.NUM / (SELECT COUNT(*) FROM ECOLI_DATA)) * 100 <= 50 THEN 'HIGH'
#         WHEN (e2.NUM / (SELECT COUNT(*) FROM ECOLI_DATA)) * 100 <= 75 THEN 'MEDIUM'
#         ELSE 'LOW'
#     END AS 'COLONY_NAME'
# FROM ECOLI_DATA e
# JOIN (
#       SELECT ROW_NUMBER() OVER (ORDER BY SIZE_OF_COLONY DESC) AS NUM, ID, SIZE_OF_COLONY
#       FROM ECOLI_DATA) e2
# ON e.ID = e2.ID
# ORDER BY e.ID;


-- RANK 사용
# SELECT ID, 
#     CASE WHEN RANK <= ((SELECT COUNT(*) FROM ECOLI_DATA) * 0.25) THEN 'CRITICAL'
#          WHEN RANK <= ((SELECT COUNT(*) FROM ECOLI_DATA) * 0.50) THEN 'HIGH'
#          WHEN RANK <= ((SELECT COUNT(*) FROM ECOLI_DATA) * 0.75) THEN 'MEDIUM'
#          ELSE 'LOW'
#     END AS COLONY_NAME
# FROM
# (
#     SELECT ID, RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) AS RANK
#     FROM ECOLI_DATA
# ) AS e
# ORDER BY 1;


select a.ID,
    case 
        when a.percentover <= 0.25 then 'CRITICAL'
        when a.percentover <= 0.5 then 'HIGH'
        when a.percentover <= 0.75 then 'MEDIUM'
    else 'LOW' end COLONY_NAME
from
    (select 
            ID, 
            PERCENT_RANK() over (order by SIZE_OF_COLONY desc) percentover
    from ECOLI_DATA) a
order by 1;