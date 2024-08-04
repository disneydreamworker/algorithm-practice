select tbl2.y as YEAR, abs(tbl1.SIZE_OF_COLONY - tbl2.m) as YEAR_DEV, tbl1.ID
from ECOLI_DATA tbl1 
join 
(select year(DIFFERENTIATION_DATE) as y , max(SIZE_OF_COLONY) as m
from ECOLI_DATA
group by year(DIFFERENTIATION_DATE)) as tbl2
on year(tbl1.DIFFERENTIATION_DATE) = tbl2.y
order by YEAR, YEAR_DEV