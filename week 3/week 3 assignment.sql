SELECT 
    t1.film_id, t1.title, t3.category_id, t3.name
FROM
    sakila.film AS t1
        INNER JOIN
    sakila.film_category AS t2 ON t1.film_id = t2.film_id
        INNER JOIN
    sakila.category AS t3 ON t2.category_id = t3.category_id;