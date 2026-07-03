# Write your MySQL query statement below
select query_name,round(AVG(rating/position),2)as quality, round(AVG(rating<3)*100,2)as poor_query_percentage from queries where query_name is NOT NULL group by query_name;
