select count(id) as count
from ECOLI_DATA 
where GENOTYPE & 2 = 0 and (GENOTYPE & 1 > 0 or GENOTYPE & 4 > 0);

# SELECT COUNT(*) AS "COUNT"
# FROM ECOLI_DATA
# WHERE GENOTYPE % 8 IN (1,4,5);