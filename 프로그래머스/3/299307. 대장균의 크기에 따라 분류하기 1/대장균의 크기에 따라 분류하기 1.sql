select ID,
    CASE
        WHEN (SIZE_OF_COLONY <= 100) then 'LOW'
        WHEN (SIZE_OF_COLONY between 101 and 1000) then 'MEDIUM'
        ELSE 'HIGH'
    END AS SIZE
from ECOLI_DATA 
order by ID