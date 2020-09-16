We are looking for four data fields: `film_id`, `title` (from `sakila.film` table), `category_id`, `name` (from `sakila.category` table).
However, there is no direct relationship between these two tables. 
We need an "intermediary" table `sakila.film_category` so that we could join `sakila.film` and `sakila.category`.   
<br>
First, make `sakila.film` `INNER JOIN` `sakila.film_category` by `film_id`.    
Then, `INNER JOIN` aforementioned tables to `sakila.category` by `category_id`.    
For simplicity, we could name the table t1, t2, and t3 using statement `FROM sakila.film AS t1`.    
