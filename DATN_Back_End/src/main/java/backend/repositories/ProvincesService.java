package backend.repositories;

import backend.models.Provinces;

public interface ProvincesService {

	Iterable<Provinces> findAll();

	String getIdByName(String province);
	

}
