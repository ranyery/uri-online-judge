 SELECT DISTINCT movies.id, movies.name
    FROM movies JOIN genres ON movies.id_genres = genres.id
    JOIN movies_actors ON movies.id = movies_actors.id_movies
    JOIN actors ON movies_actors.id_actors = actors.id
    WHERE actors.name like '%Silva'
    AND genres.description = 'Action';