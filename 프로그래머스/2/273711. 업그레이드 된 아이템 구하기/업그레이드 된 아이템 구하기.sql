-- 코드를 작성해주세요

select ITEM_ID, ITEM_NAME, RARITY
from item_info 
where item_id in (
    select t.item_id
    from item_tree t
    inner join item_info i on t.parent_item_id = i.item_id
    where rarity = 'RARE'
)
order by item_id desc;
