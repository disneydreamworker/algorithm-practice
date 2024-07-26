select p.id as ID, count(c.id) as CHILD_COUNT
from ECOLI_DATA p
    left outer join ECOLI_DATA c on p.id = c.parent_id
group by id
