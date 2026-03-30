# Write your MySQL query statement below
SELECT Euni.unique_id, E.name FROM Employees E
LEFT JOIN EmployeeUNI EUni ON E.id = EUni.id ;
