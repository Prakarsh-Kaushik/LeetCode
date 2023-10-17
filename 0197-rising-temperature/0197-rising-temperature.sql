# Write your MySQL query statement below
SELECT a.id FROM weather a,weather b
where a.temperature>b.temperature and DATEDIFF(a.recordDate,b.recordDate)=1