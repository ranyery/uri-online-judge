SELECT pd.name, pv.name
	FROM products AS pd JOIN providers AS pv ON pd.id_providers = pv.id
	WHERE pd.id_categories = 6