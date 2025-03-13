#Write a query to find duplicate records in a table

SELECT email, COUNT(*) from users group by email having COUNT(*) > 1;

#Find Duplicate based on multiple column

SELECT name, email, COUNT(*) FROM users GROUP BY name, email HAVING COUNT(*) > 1;