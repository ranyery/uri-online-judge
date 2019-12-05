SELECT p.id, p.name 
	FROM products AS p JOIN categories AS c ON p.id_categories = c.id
	WHERE c.name like 'super%'