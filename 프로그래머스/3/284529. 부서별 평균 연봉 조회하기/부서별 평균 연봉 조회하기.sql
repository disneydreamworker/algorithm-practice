select a.dept_id, a.dept_name_en, round(avg(b.sal), 0) as AVG_SAL 
from hr_department a inner join hr_employees b
where a.dept_id = b.dept_id
group by a.dept_id, a.dept_name_en
order by avg_sal desc;