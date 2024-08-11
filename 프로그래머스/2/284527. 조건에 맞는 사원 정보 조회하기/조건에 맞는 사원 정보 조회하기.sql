with cte as (
select sum(score) as score, emp_no, emp_name, position, email
from hr_employees em
join hr_grade g using(emp_no)
join hr_department d using(dept_id)
group by emp_no
)

select A.score, A.emp_no, A.emp_name, A.position, A.email
from (
select *, row_number() over (order by score desc) as r_num
from cte
) A
where A.r_num = 1