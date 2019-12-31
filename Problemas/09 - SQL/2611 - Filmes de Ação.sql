SELECT movies.id, movies.name
    FROM movies JOIN genres ON id_genres = genres.id
    WHERE description = 'Action'